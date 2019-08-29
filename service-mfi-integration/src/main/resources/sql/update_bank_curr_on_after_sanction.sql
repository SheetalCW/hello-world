create or replace TRIGGER "UPDATEPROPOSALSTATUSOFSANCTION" 
AFTER INSERT ON SANCTION_DETAIL 
FOR EACH ROW
    DECLARE 
        isAlreadySanction NUMBER;
        branchCode VARCHAR2(255 CHAR);
        statusId NUMBER(19,0);
BEGIN
        statusId := 5 ;
        SELECT bank_curr_proposal_status_id INTO isAlreadySanction FROM BANK_CURRENT_PROPOSAL_STATUS BCPS WHERE BCPS.APPLICATION_ID =:NEW.APPLICATION_ID;
        IF  isAlreadySanction = 15 OR isAlreadySanction = 16  THEN 
            branchCode := null ;
            statusId := null;
        ELSE
            branchCode := :NEW.BRANCH;
            statusId := 5 ;
        END IF;

        IF isAlreadySanction IS NULL  THEN 
            INSERT INTO BANK_CURRENT_PROPOSAL_STATUS BCPS (ID , APPLICATION_ID , bank_curr_proposal_status_id , BRANCH_CODE, BRANCH_NAME
            , CREATED_DATE , CREATED_BY , IS_ACTIVE , IS_SAVED , REJECTION_AUTHORITY , REJECTION_DATE ,  REMARK , STATUS_CODE) VALUES
            (BANK_CUR_PROPOSAL_STATUS_SEQ.NEXTVAL , :NEW.application_id , statusId , branchCode , NULL ,  SYSDATE ,:NEW.CREATED_BY , 1 , 0  , NULL , NULL,  :NEW.REMARK , NULL );
        ELSE 
            UPDATE BANK_CURRENT_PROPOSAL_STATUS BCPS SET BCPS.bank_curr_proposal_status_id = statusId , BCPS.BRANCH_CODE = branchCode ,IS_SAVED = 0 , BCPS.REMARK = :NEW.REMARK        
            , BCPS.MODIFIED_BY = :NEW.CREATED_BY  , BCPS.MODIFIED_DATE = SYSDATE  WHERE BCPS.application_id = :NEW.application_id ;   
       END IF;

END;
/