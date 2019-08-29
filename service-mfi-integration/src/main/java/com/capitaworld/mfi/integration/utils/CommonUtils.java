package com.capitaworld.mfi.integration.utils;

import org.springframework.util.ObjectUtils;

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

}
