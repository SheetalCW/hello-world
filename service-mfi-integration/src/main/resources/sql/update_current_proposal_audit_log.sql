create or replace TRIGGER "TR_UPDATE_PROPOSAL_STATUS" 
AFTER UPDATE ON loan_master
   FOR EACH ROW
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
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
    :old.APPLICATION_ID ,
    :new.CURRENT_PROPOSAL_STATUS,
    :old.FP_PRODUCT_NAME ,
    :old.CURRENT_PROPOSAL_STATUS,
    :old.bank_name,
    :old.branch_name,
    :old.branch_code
    );
  END COLUMN_SEQUENCES;
END;
/