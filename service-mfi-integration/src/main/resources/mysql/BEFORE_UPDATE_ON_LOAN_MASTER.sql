DROP TRIGGER IF EXISTS BEFORE_UPDATE_ON_LOAN_MASTER; 
/
CREATE
 TRIGGER BEFORE_UPDATE_ON_LOAN_MASTER BEFORE UPDATE ON loan_master 
    FOR EACH ROW BEGIN

    -- Update current status into bank_current_proposal_status
	DECLARE ids BIGINT(20);
    DECLARE proposalstatusid BIGINT(20);
	DECLARE counts BIGINT(20);
	DECLARE newstatus VARCHAR(255);
	DECLARE isSaved BIGINT(20);
	DECLARE currentStatusId BIGINT(20);

 	-- Proposal Status audit log	
	DECLARE idss BIGINT(20);

	    SET newstatus = LOWER(NEW.current_proposal_status);
	    IF((newstatus IS NOT NULL) AND LOWER(OLD.current_proposal_status) <> newstatus)  THEN 
	          SET proposalstatusid  = 
	          CASE newstatus 
	                    WHEN 'pending' THEN 1 
	                    WHEN 'accept' THEN 2 
	                    WHEN 'hOLD' THEN 3
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
	            -- dbms_output.put_line(proposalstatusid );
	        SELECT bcps.bank_curr_proposal_status_id INTO currentStatusId FROM bank_current_proposal_status  bcps WHERE bcps.application_id = NEW.application_id ;     
	        -- dbms_output.put_line(counts);
	        -- IF proposalstatusid = 2 THEN 
	            -- SET isSaved = FALSE ;
	        -- ELSE
	             -- SET isSaved = TRUE ;
	        -- END IF;             

	        IF currentStatusId IS NULL THEN

	        	SELECT COUNT(id)+1 INTO ids FROM bank_current_proposal_status ;
       			INSERT INTO bank_current_proposal_status  (id , application_id , bank_curr_proposal_status_id , branch_code, branch_name , bank_name , 
	            	created_date ,  is_active , is_saved , cw_rejection_reason ) 
	            	VALUES
	            	(ids , NEW.application_id , proposalstatusid , NEW.branch_code , NEW.branch_name , NEW.bank_name ,  NOW() , TRUE , TRUE , NEW.rejection_reason_from_cw  );
	            -- dbms_output.put_line('1 row inserted');  

	        ELSE  
	        	        
	            IF proposalstatusid != 2 THEN 	
	            	UPDATE bank_current_proposal_status bcps SET bcps.bank_curr_proposal_status_id = proposalstatusid , bcps.is_saved = TRUE , bcps.cw_rejection_reason = NEW.rejection_reason_from_cw,
	           		 bcps.modified_date = NOW() WHERE bcps.application_id = NEW.application_id ;   

	           	ELSEIF (currentStatusId = 15 || currentStatusId = 16) THEN
	        
	       			UPDATE bank_current_proposal_status bcps SET bcps.bank_curr_proposal_status_id = proposalstatusid , bcps.is_saved = FLASE , bcps.cw_rejection_reason = NEW.rejection_reason_from_cw, 
	           		 bcps.modified_date = NOW() WHERE bcps.application_id = NEW.application_id ;   
	            	-- dbms_output.put_line('1 row updated');	
				END IF;	
	        END IF ;    
	     END IF ;       

	    
	    -- Insert current status into audit log
		SELECT COUNT(id)+1 INTO idss FROM proposal_status_audit_log ;
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
	   ( idss ,
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