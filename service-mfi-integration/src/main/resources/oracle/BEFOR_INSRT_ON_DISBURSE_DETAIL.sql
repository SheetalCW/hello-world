create or replace TRIGGER BEFOR_INSRT_ON_DISBURSE_DETAIL
BEFORE INSERT  ON DISBURSEMENT_DETAIL
   FOR EACH ROW
   DECLARE
   sanctionAmount FLOAT(16);
   totalDisbursement DISBURSEMENT_DETAIL.DISBURSED_AMOUNT%TYPE;
   res NUMBER;
   disburseAmt FLOAT(16);
   isAlreadySanction NUMBER;

BEGIN    

    SELECT  SD.SANCTION_AMOUNT INTO sanctionAmount  FROM  ( SELECT sd.SANCTION_AMOUNT   FROM SANCTION_DETAIL SD WHERE 
    SD.APPLICATION_ID = :NEW.application_id ORDER BY SD.ID DESC ) SD WHERE ROWNUM <= 1 ;  
    SELECT SUM( DISBURSED_AMOUNT ) INTO totalDisbursement FROM DISBURSEMENT_DETAIL   WHERE APPLICATION_ID = :NEW.APPLICATION_ID ;
    IF totalDisbursement IS NULL THEN 
        totaldisbursement := 0.0 ;
         dbms_output.put_line('FIRST DISBURSEMENT FOR APPLICATION_ID'||:NEW.APPLICATION_ID); 
    END IF;
    disburseAmt :=  :NEW.DISBURSED_AMOUNT + totaldisbursement;
    dbms_output.put_line(disburseAmt ); 

    SELECT bank_curr_proposal_status_id INTO isAlreadySanction FROM BANK_CURRENT_PROPOSAL_STATUS BCPS WHERE BCPS.APPLICATION_ID =:NEW.APPLICATION_ID;

    IF sanctionAmount > disburseAmt THEN 
        res :=  13 ;
    ELSIF sanctionAmount = disburseAmt THEN 
         res := 11 ;
    ELSIF sanctionAmount < disburseAmt THEN 
         res := 14 ;
    END IF ;

    IF  isAlreadySanction = 15 OR isAlreadySanction = 16  THEN 
        res := null ;
    END IF; 
    UPDATE BANK_CURRENT_PROPOSAL_STATUS BCPS SET BCPS.bank_curr_proposal_status_id = res , BCPS.IS_SAVED = :NEW.IS_SAVED , BCPS.MODIFIED_DATE = SYSDATE , 
    BCPS.disbursed_pk = :NEW.id ,    BCPS.disbursed_date = :NEW.disbursement_date WHERE bcps.application_id =:NEW.APPLICATION_ID ;

END ;
/