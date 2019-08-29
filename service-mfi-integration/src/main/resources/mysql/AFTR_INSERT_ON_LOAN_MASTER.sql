DROP TRIGGER IF EXISTS AFTR_INSERT_ON_LOAN_MASTER ;
/
CREATE
  TRIGGER AFTR_INSERT_ON_LOAN_MASTER AFTER INSERT ON loan_master 
    FOR EACH ROW BEGIN
 
    -- Insert or update into bank_current_proposal_status 
	DECLARE ids BIGINT(20);
    DECLARE proposalstatusid BIGINT(20);  	
	DECLARE counts BIGINT(20);
	DECLARE newstatus VARCHAR(255);
	DECLARE issaved BIT(1);

	-- for proposal audit log
	DECLARE idss BIGINT(20);

	SET newstatus = LOWER(NEW.current_proposal_status);
	    IF(NEW.current_proposal_status IS NOT NULL)  THEN 
	        SET proposalstatusid  = 
	         	CASE newstatus 
	                    WHEN 'pending' THEN 1 
	                    WHEN 'accept' THEN 2 
	                    WHEN 'hold' THEN 3
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
	            IF proposalstatusid = 2 THEN 
	               SET issaved = FALSE ;
	            ELSE
					SET issaved = TRUE ;
	            END IF;  
	            -- dbms_output.put_line('updated proposal statu -' || proposalstatusid );
	            SELECT COUNT(*) INTO counts FROM bank_current_proposal_status bcps WHERE bcps.application_id = NEW.application_id ;
	            -- dbms_output.put_line(counts);
	
			SELECT COUNT(id)+1 INTO ids FROM bank_current_proposal_status  ;
       		IF counts = 0 THEN 
	        	INSERT INTO bank_current_proposal_status (id , application_id , bank_curr_proposal_status_id , branch_code, branch_name , bank_name ,
	        	created_date ,  is_active , is_saved , cw_rejection_reason ) 
	        	VALUES
	        	(ids, NEW.application_id , proposalstatusid , NEW.branch_code , NEW.branch_name , NEW.bank_name , NOW() , TRUE , issaved , NEW.rejection_reason_from_cw );
	                -- dbms_output.put_line('1 row inserted');     
	    	ELSE 
	        	UPDATE bank_current_proposal_status bcps SET bcps.bank_curr_proposal_status_id = proposalstatusid , bcps.is_saved = issaved, bcps.cw_rejection_reason = NEW.rejection_reason_from_cw ,
	        	 bcps.modified_date = NOW()  WHERE bcps.application_id = NEW.application_id ; 
	        	-- dbms_output.put_line('1 row updated');     
	    	END IF ; 
		END IF ; 


	--  For proposal audit log
	SELECT COUNT(id)+1 INTO idss FROM proposal_status_audit_log ;
  	INSERT INTO proposal_status_audit_log
   	( id, 
   	CREATED_DATE,
     IS_ACTIVE,
     APPLICATION_ID ,
     CURRENT_PROPOSAL_STATUS , 
     FP_PRODUCT_NAME ,
    
     bank_name,
     branch_name,
     branch_code
     )
   	VALUES
   	( idss ,
   	NOW() ,  
    TRUE  , 
    NEW.APPLICATION_ID ,
    NEW.CURRENT_PROPOSAL_STATUS,
    NEW.FP_PRODUCT_NAME ,
    
    NEW.bank_name,
    NEW.branch_name,
    NEW.branch_code
    );
END;

/	