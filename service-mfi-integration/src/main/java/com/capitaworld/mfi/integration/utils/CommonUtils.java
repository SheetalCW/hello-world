package com.capitaworld.mfi.integration.utils;

import java.util.Date;
import java.util.function.Supplier;

import org.springframework.util.ObjectUtils;

import com.capitaworld.mfi.integration.domain.oneform.Auditor;

/** Class for provide common functionalities
 * @author dharmendra.chudasama
 *
 */
public class CommonUtils {

	//-------------------------- Is Empty Methods -----------------------------

	/**
	 * @return <code>true</code> if given argumetn is <code>null</code> or empty
	 * @see ObjectUtils#isEmpty(Object)
	 */
	public static boolean isEmpty(Object obj){
		if(obj == null)
			return true;
		if(obj instanceof String)
			return isEmpty((String) obj);
//		if(obj instanceof Number)
//			return isEmpty((Number) obj);
		return ObjectUtils.isEmpty(obj);
	}

	/**
	 * Determine whether the given array is empty:
	 * i.e. {@code null} or of zero length.
	 * @param array the array to check
	 * @see #isEmpty(Object)
	 */
	public static boolean isEmpty(Object[] array) {
		return (array == null || array.length == 0);
	}

	/** @return <code>true</code> if given argumetn is <code>null</code> or 0
	 * @deprecated need improvements
	 *  */
	public static boolean isEmptyNum(Number arg){
		if(arg == null)
			return true;
		return ((Number) arg).longValue()==0l;
//		return ((Number) arg).intValue()==0;
	}
	
	/** @return <code>true</code> if given argumetn is <code>null</code> or empty anything */
	public static boolean isEmpty(String str){
		if(str == null)
			return true;
		
		str = str.trim();
		return str.isEmpty() || str.equals("null") || str.equals("{}") || str.equals("[]") || str.equalsIgnoreCase("undefined");
	}
	
	//--------------------------- Methods -------------------------------

	/** Method for set audit component values
	 * @param request request class
	 * @param entity fetched entity class
	 * @param constructor reference of constructor of entity, will call if required
	 * @return Generated entity (never null)
	 * @author Dharmendrasinh Chudasama
	 */
	public static <T extends Auditor> T setAuditDetail(Object request, T entity, Supplier<T> constructor) {
		if(entity == null ) {
			entity = constructor.get();
			entity.setCreatedBy(-1l);
			entity.setCreatedDate(new Date());
			
			entity.setIsActive(true);
		}else {
			entity.setModifiedBy(-1l);
			entity.setModifiedDate(new Date());
		}
		com.capitaworld.mfi.integration.api.api_url_and_constants.CommonUtils.copyProperties(request, entity, com.capitaworld.mfi.integration.api.api_url_and_constants.CommonUtils.IGNORE_AUDOTIR_FIELDS);

		return entity;
	}
}
