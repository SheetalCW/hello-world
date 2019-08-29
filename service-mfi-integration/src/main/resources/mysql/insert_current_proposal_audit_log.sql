DROP TRIGGER IF EXISTS TR_INSERT_PROPOSAL_STATUS;
/
CREATE
 TRIGGER TR_INSERT_PROPOSAL_STATUS AFTER INSERT ON loan_master 
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
    NEW.APPLICATION_ID ,
    NEW.CURRENT_PROPOSAL_STATUS,
    NEW.FP_PRODUCT_NAME ,
    NEW.CURRENT_PROPOSAL_STATUS,
    NEW.bank_name,
    NEW.branch_name,
    NEW.branch_code
    );
  
END;

/
