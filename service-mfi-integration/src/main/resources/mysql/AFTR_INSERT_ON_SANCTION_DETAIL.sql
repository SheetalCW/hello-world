DROP TRIGGER IF EXISTS AFTR_INSERT_ON_SANCTION_DETAIL;
/
CREATE
 TRIGGER AFTR_INSERT_ON_SANCTION_DETAIL AFTER INSERT ON sanction_detail
    FOR EACH ROW BEGIN
	  
	DECLARE ids BIGINT(20);
  	DECLARE isalreadysanction BIGINT(20);
	DECLARE branchcode VARCHAR(255);
	DECLARE statusid BIGINT(20);
	    SET statusid = 5 ;
	    SELECT bank_curr_proposal_status_id INTO isalreadysanction FROM bank_current_proposal_status bcps WHERE bcps.application_id =new.application_id;


	SELECT COUNT(id)+1 INTO ids FROM bank_current_proposal_status;
	        IF  isalreadysanction = 15 OR isalreadysanction = 16  THEN 
	            SET branchcode = NULL ;
	            SET statusid = NULL;
	        ELSE
	            SET branchcode = new.branch;
	            SET statusid = 5 ;
	        END IF;
	        IF isalreadysanction IS NULL  THEN 
	            INSERT INTO bank_current_proposal_status  (id , application_id , bank_curr_proposal_status_id , branch_code, branch_name
	            , created_date , created_by , is_active , is_saved , rejection_authority , rejection_date ,  remark , status_code , sanction_pk  , sanction_date) VALUES
	            (ids , new.application_id , statusid , branchcode , NULL ,  NOW() ,new.created_by , TRUE , FALSE  , NULL , NULL,  new.remark , NULL , new.id , new.sanction_date );
	        ELSE 
	            UPDATE bank_current_proposal_status bcps SET bcps.bank_curr_proposal_status_id = statusid , bcps.branch_code = branchcode ,is_saved = new.is_saved ,
	             bcps.remark = new.remark  , bcps.modified_by = new.created_by  , bcps.modified_date = NOW() , bcps.sanction_pk = new.id , 
	             bcps.sanction_date = new.sanction_date  WHERE bcps.application_id = new.application_id ;   
	       END IF;
		END;
/