DROP TRIGGER IF EXISTS bank_proposal_audit_log; 
 /
CREATE TRIGGER `bank_proposal_audit_log` AFTER UPDATE ON `bank_current_proposal_status` 
    FOR EACH ROW BEGIN
	
DECLARE ids BIGINT(20);
SELECT COUNT(id)+1 INTO ids FROM bank_proposal_audit_log  ;

	 INSERT INTO  bank_proposal_audit_log (id , application_id , branch_code , branch_name, created_date
	    , created_by , modified_by , modified_date ,   is_active , is_saved ,OLD_proposal_satus , current_proposal_satus , rejection_authority ,
	    rejection_date , bank_rejection_reason  , cw_rejection_reason, remark , status_code , sanction_pk , sanction_date , disbursed_pk , disbursed_date) VALUES
	    (ids , NEW.application_id , OLD.branch_code , OLD.branch_name , NOW() , 
	     OLD.created_by, OLD.modified_by  , OLD.modified_date ,     OLD.is_active , OLD.is_saved  , OLD.bank_curr_proposal_status_id , NEW.bank_curr_proposal_status_id, OLD.rejection_authority , 
	     OLD.rejection_date , OLD.bank_rejection_reason , OLD.cw_rejection_reason , OLD.remark  , OLD.status_code , NEW.sanction_pk , NEW.sanction_date , NEW.disbursed_pk , NEW.disbursed_date);
    END;

/