package com.fxyh.ossutil.util;

public class StringUtils {

	// 判断字符串是否为空，如果为nul或者""则返回true，否则返回false
	public static boolean isEmpty(Object str) {
		return str == null || "".equals(str);
	}

	// 判断字符串是否有长度，不等于null同时长度大于0，则为true
	// 这里重载两个hasLength方法，其中CharSequence是String的父类，是接口
	public static boolean hasLength(CharSequence str) {
		return str != null && str.length() > 0;
	}

	public static boolean hasLength(String str) {
		return hasLength(((CharSequence) (str)));
	}

	// 如果为空则直接返回false，如果字符串中有一个不是空白，则表示
	// 有内容，返回true
	public static boolean hasText(CharSequence str) {
		if (!hasLength(str))
			return false;
		int strLen = str.length();
		// 遍历字符序列，如果其中有一个不是空白，则返回true
		for (int i = 0; i < strLen; i++)
			if (!Character.isWhitespace(str.charAt(i)))
				return true;

		return false;
	}

	public static boolean hasText(String str) {
		return hasText(((CharSequence) (str)));
	}

	
    /**
     * org.apache.commons.lang.StringUtils
     * start
     */
	/**
     * <p>检查一个字符串是否不是空的（“”），而不是NULL，而不是空白。</p>
     *
     * <pre>
     * StringUtils.isNotBlank(null)      = false
     * StringUtils.isNotBlank("")        = false
     * StringUtils.isNotBlank(" ")       = false
     * StringUtils.isNotBlank("bob")     = true
     * StringUtils.isNotBlank("  bob  ") = true
     * </pre>
     *
     * @param str  要检查的字符串是否为空。
     * @return <code>true</code> 如果字符串不是空的，也不是空白，也不是空格
     * 
     */
    public static boolean isNotBlank(String str) {
        return !StringUtils.isBlank(str);
    }
    
    /**
     * <p>检查字符串是否为空格、（“”）或NULL。</p>
     *
     * <pre>
     * StringUtils.isBlank(null)      = true
     * StringUtils.isBlank("")        = true
     * StringUtils.isBlank(" ")       = true
     * StringUtils.isBlank("bob")     = false
     * StringUtils.isBlank("  bob  ") = false
     * </pre>
     *
     * @param str  要检查的字符串是否为空。
     * @return <code>true</code>如果字符串是空的，或者是空白，或者是空格
     */
    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }
    /**
     * org.apache.commons.lang.StringUtils
     * end
     */

}
