create or replace TRIGGER BANK_PROPOSAL_STATUS_AUDIT_LOG
AFTER INSERT OR UPDATE ON BANK_CURRENT_PROPOSAL_STATUS
   FOR EACH ROW
BEGIN

    INSERT INTO BANK_PROPOSAL_AUDIT_LOG  (ID , APPLICATION_ID , BRANCH_CODE , BRANCH_NAME, CREATED_DATE
    , CREATED_BY , MODIFIED_BY , MODIFIED_DATE ,   IS_ACTIVE , IS_SAVED ,OLD_PROPOSAL_SATUS , CURRENT_PROPOSAL_SATUS , REJECTION_AUTHORITY ,
    REJECTION_DATE , bank_rejection_reason  , cw_rejection_reason, REMARK , STATUS_CODE , sanction_pk , sanction_date , disbursed_pk , disbursed_date) VALUES
    (BANK_PROPOSAL_AUDIT_LOG_SEQ.NEXTVAL , :NEW.APPLICATION_ID , :OLD.BRANCH_CODE , :OLD.BRANCH_NAME , SYSDATE , 
     :OLD.CREATED_BY, :OLD.MODIFIED_BY  , :OLD.MODIFIED_DATE ,     :OLD.IS_ACTIVE , :OLD.IS_SAVED  , :OLD.bank_curr_proposal_status_id , :NEW.bank_curr_proposal_status_id, :OLD.REJECTION_AUTHORITY , 
     :OLD.REJECTION_DATE , :OLD.bank_rejection_reason , :OLD.cw_rejection_reason , :OLD.REMARK  , :OLD.STATUS_CODE, :NEW.sanction_pk , :NEW.sanction_date , :NEW.disbursed_pk , :NEW.disbursed_date  );
END;
/