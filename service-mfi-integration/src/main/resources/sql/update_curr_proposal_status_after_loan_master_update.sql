create or replace TRIGGER UPDATESTATUSFROMLOANMASTER 
BEFORE UPDATE OF CURRENT_PROPOSAL_STATUS ON LOAN_MASTER 
FOR EACH ROW
DECLARE 
    proposalStatusId NUMBER(19,0);
    COUNTS NUMBER(19,0);
    newStatus VARCHAR2(50 CHAR);
    isSaved NUMBER(1,0);
BEGIN
    newStatus := LOWER(:NEW.CURRENT_PROPOSAL_STATUS);
    IF((newStatus IS NOT NULL) AND LOWER(:OLD.CURRENT_PROPOSAL_STATUS) <> newStatus)  THEN 
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
            dbms_output.put_line(proposalStatusId );
        SELECT COUNT(*) INTO COUNTS FROM bank_current_proposal_status  bcps WHERE bcps.APPLICATION_ID = :NEW.APPLICATION_ID ;     
        dbms_output.put_line(COUNTS);
        IF proposalStatusId = 2 THEN 
            isSaved := 0 ;
        ELSE
             isSaved := 1 ;
        END IF;             
        IF COUNTS > 0 THEN 
            UPDATE BANK_CURRENT_PROPOSAL_STATUS BCPS SET BCPS.bank_curr_proposal_status_id = proposalStatusId , BCPS.IS_SAVED = isSaved ,
            BCPS.MODIFIED_BY = SYSDATE , BCPS.MODIFIED_DATE = SYSDATE  WHERE BCPS.application_id = :NEW.application_id ;   
            dbms_output.put_line('1 ROW UPDATED');     
        ELSE 
            INSERT INTO BANK_CURRENT_PROPOSAL_STATUS BCPS (ID , APPLICATION_ID , BCPS.bank_curr_proposal_status_id , BRANCH_CODE, BRANCH_NAME , BANK_NAME , 
            CREATED_DATE ,  IS_ACTIVE , IS_SAVED ) 
            VALUES
            (BANK_CUR_PROPOSAL_STATUS_SEQ.NEXTVAL , :OLD.APPLICATION_ID , proposalStatusId , :OLD.BRANCH_CODE , :OLD.BRANCH_NAME , :OLD.BANK_NAME ,  SYSDATE , 1 , isSaved );
            dbms_output.put_line('1 ROW INSERTED');    
        END IF ;    
     END IF ;       
END;
/