DROP TRIGGER IF EXISTS AFTR_INSRT_ON_BANK_CURR_PROPOSL; 
 /
CREATE TRIGGER `AFTR_INSRT_ON_BANK_CURR_PROPOSL` AFTER INSERT ON `bank_current_proposal_status` 
    FOR EACH ROW BEGIN
	
	DECLARE ids BIGINT(20);
	SELECT COUNT(id)+1 INTO ids FROM bank_proposal_audit_log  ;

	INSERT INTO  bank_proposal_audit_log (id , application_id , branch_code , branch_name, created_date
	    , created_by , modified_by , modified_date ,   is_active , is_saved , current_proposal_satus , rejection_authority ,
	    rejection_date , bank_rejection_reason  , cw_rejection_reason, remark , status_code , sanction_pk , sanction_date , disbursed_pk , disbursed_date) VALUES
	    (ids , NEW.application_id , NEW.branch_code , NEW.branch_name , NOW() , 
	     NEW.created_by, NEW.modified_by  , NEW.modified_date ,     NEW.is_active , NEW.is_saved  , NEW.bank_curr_proposal_status_id, NEW.rejection_authority , 
	     NEW.rejection_date , NEW.bank_rejection_reason , NEW.cw_rejection_reason , NEW.remark  , NEW.status_code , NEW.sanction_pk , NEW.sanction_date , NEW.disbursed_pk , NEW.disbursed_date);
END;

/