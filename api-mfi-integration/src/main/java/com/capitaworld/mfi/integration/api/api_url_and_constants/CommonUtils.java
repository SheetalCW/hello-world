package com.capitaworld.mfi.integration.api.api_url_and_constants;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.util.ObjectUtils;

public class CommonUtils {

	/**
	 * copy field data from source to target
	 * 
	 * @param                  <T>
	 * @param source
	 * @param target
	 * @param ignoreProperties
	 * @return target as after call setters
	 */
	public static <T> T copyProperties(Object source, T target, String... ignoreProperties) {
		BeanUtils.copyProperties(source, target, ignoreProperties);

		// TODO validate
		{
			// <Setter name, getter method)
			Map<String, Method> sourceGetters = Stream.of(source.getClass().getMethods())
					.filter(m -> m.getName().startsWith("get") && m.getParameterCount() == 0)
					.collect(Collectors.toMap(Method::getName, Function.identity()));

			List<String> ignoredSetterNameList = Stream.of(ignoreProperties)
					.map(nm -> "set" + Character.toUpperCase(nm.charAt(0)) + nm.substring(1))
					.collect(Collectors.toList());

			Stream.of(target.getClass().getMethods())
					.filter(m -> m.getName().startsWith("set") && m.getParameterCount() == 1).forEach(m -> {
						String curSetterMethodName = m.getName();
						if (ignoredSetterNameList.contains(curSetterMethodName))
							return;

						String getterMethodName = "g" + curSetterMethodName.substring(1);

						Method sourceGetter = sourceGetters.get(getterMethodName);
						if (sourceGetter == null || !sourceGetter.getReturnType().equals(m.getParameterTypes()[0])) {
							System.err.println("Getter does not found '" + getterMethodName + "()' in source class "
									+ source.getClass());
						} /*
							 * else { try { m.invoke(target, sourceGetter.invoke(source)); } catch
							 * (IllegalAccessException | IllegalArgumentException |
							 * InvocationTargetException e) { throw new
							 * RuntimeException("Can not copy from "+getterMethodName, e); } }
							 */
					});
		}

		return target;
	}

	public static final String[] IGNORE_AUDOTIR_FIELDS = { "id", "createdBy", "createdDate", "isActive", "modifiedBy",
			"modifiedDate" };

	public static String stackTrace(Exception e) {
		try (ByteArrayOutputStream out = new ByteArrayOutputStream()) { // edit by Dharmendrasinh Chudasama
			e.printStackTrace(new PrintStream(out));
			return out.toString();
		} catch (IOException e1) {
			return e1.getMessage();
		}
	}

	/**
	 * Same as case
	 * 
	 * @param objToCheck
	 * @param argObj
	 * @return
	 */
	public static boolean isIn(final Object objToCheck, final Object... argObj) {
		for (final Object o : argObj) {
			if (objToCheck.equals(o))
				return true;
		}
		return false;
	}

	// -------------------------- Is Empty Methods -----------------------------

	/**
	 * @return <code>true</code> if given argumetn is <code>null</code> or empty
	 * @see ObjectUtils#isEmpty(Object)
	 */
	public static boolean isEmpty(Object obj) {
		if (obj == null)
			return true;
		if (obj instanceof String)
			return isEmpty((String) obj);
//		if(obj instanceof Number)
//			return isEmpty((Number) obj);
		return ObjectUtils.isEmpty(obj);
	}

	/**
	 * Determine whether the given array is empty: i.e. {@code null} or of zero
	 * length.
	 * 
	 * @param array the array to check
	 * @see #isEmpty(Object)
	 */
	public static boolean isEmpty(Object[] array) {
		return (array == null || array.length == 0);
	}

	/**
	 * @return <code>true</code> if given argumetn is <code>null</code> or 0
	 * @deprecated need improvements
	 */
	public static boolean isEmpty(Number arg) {
		return arg == null || ((Number) arg).longValue() == 0l;
	}

	/**
	 * @return <code>true</code> if given argumetn is <code>null</code> or empty
	 *         anything
	 */
	public static boolean isEmpty(String str) {
		if (str == null)
			return true;

		str = str.trim();
		return str.isEmpty() || str.equals("null") || str.equals("{}") || str.equals("[]")
				|| str.equalsIgnoreCase("undefined");
	}

	// ---------------------------------------------------------------------

}
