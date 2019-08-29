DROP TRIGGER IF EXISTS updtproposalstatusofdisbursed;
/
CREATE
 TRIGGER updtproposalstatusofdisbursed BEFORE INSERT ON disbursement_detail  FOR EACH ROW BEGIN  
	   DECLARE sanctionamount DOUBLE;
	   DECLARE totaldisbursement DOUBLE;
	   DECLARE res BIGINT;
	   DECLARE disburseamt DOUBLE;
	   DECLARE isalreadysanction BIGINT(20);
	    SELECT  sd.sanction_amount INTO sanctionamount  FROM  ( SELECT sd.sanction_amount   FROM sanction_detail sd WHERE 
	    sd.application_id = new.application_id ORDER BY sd.id DESC ) sd WHERE rownum <= 1 ;  
	    SELECT SUM( disbursed_amount ) INTO totaldisbursement FROM disbursement_detail   WHERE application_id = new.application_id ;
	    IF totaldisbursement IS NULL THEN 
	        SET totaldisbursement = 0.0 ;
	         -- dbms_output.put_line('first disbursement for application_id'||new.application_id); 
	    END IF;
	    SET disburseamt =  new.disbursed_amount + totaldisbursement;
	    -- dbms_output.put_line(disburseamt ); 
	    SELECT bank_curr_proposal_status_id INTO isalreadysanction FROM bank_current_proposal_status WHERE application_id = new.application_id;
	    IF (sanctionamount>disburseamt)THEN
	       SET res = 13;
	    ELSEIF (sanctionamount=disburseamt)THEN
	       SET res = 11;
	    ELSEIF (sanctionamount<disburseamt)THEN
	       SET res = 14;
	     END IF;
	 UPDATE bank_current_proposal_status SET bank_curr_proposal_status_id=res,is_saved=new.is_saved,modified_date=NOW() WHERE application_id = new.application_id ;
	END;

/
