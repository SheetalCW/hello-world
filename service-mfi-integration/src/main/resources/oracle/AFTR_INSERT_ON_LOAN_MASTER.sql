create or replace TRIGGER AFTR_INSERT_ON_LOAN_MASTER 
AFTER INSERT ON LOAN_MASTER 
FOR EACH ROW
DECLARE 
    proposalStatusId NUMBER(19,0);
    COUNTS NUMBER(19,0);
    newStatus VARCHAR2(50 CHAR);
    isSaved NUMBER(1,0);
BEGIN
        newStatus := LOWER(:NEW.CURRENT_PROPOSAL_STATUS);
        IF(:NEW.CURRENT_PROPOSAL_STATUS IS NOT NULL)  THEN 
          proposalStatusId  := 
          CASE newStatus 
                    WHEN 'pending' THEN 1 
                    WHEN 'accept' THEN 2 
                    WHEN 'hold' THEN 3
                    WHEN 'decline' THEN 4
                    WHEN 'approved' THEN 5
                    WHEN 'published' THEN 6 
                    WHEN 'published' THEN 7 
                    WHEN 'suggestion' THEN 10
                    WHEN 'disbursed' THEN 11
                    WHEN 'todisbursed' THEN 12
                    WHEN 'partiallydisbursed' THEN 13
                    WHEN 'disbursedamountexceed' THEN 14 
                    WHEN 'alreadysanctionbyotherbank' THEN 15 
                    WHEN 'alreadydisbursedbyotherbank' THEN 16 
                END;
            IF proposalStatusId = 2 THEN 
                isSaved := 0 ;
            ELSE
                 isSaved := 1 ;
            END IF;  
            dbms_output.put_line('UPDATED PROPOSAL STATUS -' || proposalStatusId );
            SELECT COUNT(*) INTO COUNTS FROM bank_current_proposal_status bcps WHERE bcps.APPLICATION_ID = :NEW.APPLICATION_ID ;
            dbms_output.put_line(COUNTS);
            IF COUNTS = 0 THEN 
                INSERT INTO BANK_CURRENT_PROPOSAL_STATUS BCPS (ID , APPLICATION_ID , bank_curr_proposal_status_id , BRANCH_CODE, BRANCH_NAME , BANK_NAME ,
                CREATED_DATE ,  IS_ACTIVE , IS_SAVED , cw_rejection_reason) 
                VALUES
                (BANK_CUR_PROPOSAL_STATUS_SEQ.NEXTVAL , :NEW.APPLICATION_ID , proposalStatusId , :NEW.BRANCH_CODE , :NEW.BRANCH_NAME , :NEW.BANK_NAME , SYSDATE , 1 , isSaved , :NEW.rejection_reason_from_cw);
                dbms_output.put_line('1 ROW INSERTED');     
            ELSE 
                UPDATE BANK_CURRENT_PROPOSAL_STATUS BCPS SET BCPS.bank_curr_proposal_status_id = proposalStatusId , BCPS.IS_SAVED = isSaved, bcps.cw_rejection_reason = :NEW.rejection_reason_from_cw ,
                 BCPS.MODIFIED_DATE = SYSDATE  WHERE BCPS.application_id = :NEW.application_id ; 
                dbms_output.put_line('1 ROW UPDATED');     
            END IF ; 
        END IF ; 

   -- Insert record into audit table
   INSERT INTO proposal_status_audit_log
   ( id ,
   CREATED_DATE,
     IS_ACTIVE,
     APPLICATION_ID ,
     CURRENT_PROPOSAL_STATUS , 
     FP_PRODUCT_NAME ,
     OLD_PROPOSAL_STATUS,
     bank_name,
     branch_name,
     branch_code
     )
   VALUES
   (PROPOSAL_STATUS_AUDIT_LOG_SEQ.NEXTVAL , 
   SYSDATE() ,  
    1  , 
    :NEW.APPLICATION_ID ,
    :OLD.CURRENT_PROPOSAL_STATUS,
    :NEW.FP_PRODUCT_NAME ,
    :NEW.CURRENT_PROPOSAL_STATUS,
    :NEW.bank_name,
    :NEW.branch_name,
    :NEW.branch_code
    );
  
END;
/