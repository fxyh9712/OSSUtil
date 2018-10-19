package com.fxyh.ossutil.util;

public abstract class Assert {
	public static void isTrue(boolean expression, String message){ 
		//如果表达式的值为false，那么会抛出非法参数异常，如果是true，则结束方法的调用,return
        if(!expression)
            throw new IllegalArgumentException(message);
        else
            return;
    }
	// 客户端程序员在使用的使用，可以直接调这个方法，如果想自定义异常信息，可以调用上面那个
	public static void isTrue(boolean expression) {
		isTrue(expression, "[Assertion failed] - this expression must be true");
	}
}
