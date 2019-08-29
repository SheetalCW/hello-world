DROP TRIGGER IF EXISTS updatestatusfromloanmaster; 
/
CREATE
 TRIGGER updatestatusfromloanmaster BEFORE UPDATE ON loan_master 
    FOR EACH ROW BEGIN
	DECLARE ids BIGINT(20);
    DECLARE proposalstatusid BIGINT(20);
	    DECLARE counts BIGINT(20);
	    DECLARE newstatus VARCHAR(255);
	    DECLARE issaved BIGINT(20);
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
	        SELECT COUNT(*) INTO counts FROM bank_current_proposal_status  bcps WHERE bcps.application_id = NEW.application_id ;     
	        -- dbms_output.put_line(counts);
	        IF proposalstatusid = 2 THEN 
	            SET issaved = FALSE ;
	        ELSE
	             SET issaved = TRUE ;
	        END IF;             
	        IF counts > 0 THEN 
	            UPDATE bank_current_proposal_status bcps SET bcps.bank_curr_proposal_status_id = proposalstatusid , bcps.is_saved = issaved ,
	            bcps.modified_by = NOW() , bcps.modified_date = NOW() WHERE bcps.application_id = NEW.application_id ;   
	            -- dbms_output.put_line('1 row updated');     
	        ELSE 
	     
SELECT COUNT(id)+1 INTO ids FROM bank_current_proposal_status ;
       INSERT INTO bank_current_proposal_status  (id , application_id , bcps.bank_curr_proposal_status_id , branch_code, branch_name , bank_name , 
	            created_date ,  is_active , is_saved ) 
	            VALUES
	            (ids , OLD.application_id , proposalstatusid , OLD.branch_code , OLD.branch_name , OLD.bank_name ,  NOW() , TRUE , issaved );
	            -- dbms_output.put_line('1 row inserted');    
	        END IF ;    
	     END IF ;       
	END;

/