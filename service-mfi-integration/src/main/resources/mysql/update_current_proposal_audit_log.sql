DROP TRIGGER IF EXISTS TR_UPDATE_PROPOSAL_STATUS;
/
CREATE
 TRIGGER TR_UPDATE_PROPOSAL_STATUS AFTER UPDATE ON loan_master 
    FOR EACH ROW BEGIN
  
   -- Insert record into audit table
 
DECLARE ids BIGINT(20);
SELECT COUNT(id)+1 INTO ids FROM proposal_status_audit_log ;
  INSERT INTO proposal_status_audit_log
   ( id, 
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
   ( ids ,
   NOW() ,  
    TRUE  , 
    old.APPLICATION_ID ,
    new.CURRENT_PROPOSAL_STATUS,
    old.FP_PRODUCT_NAME ,
    old.CURRENT_PROPOSAL_STATUS,
    old.bank_name,
    old.branch_name,
    old.branch_code
    );
  
END;

/