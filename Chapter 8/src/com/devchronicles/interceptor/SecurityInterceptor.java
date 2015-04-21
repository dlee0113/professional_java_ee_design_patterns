package com.devchronicles.interceptor;

import java.util.logging.Logger;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
public class SecurityInterceptor {
	@AroundInvoke
	public Object doSecurityCheck(InvocationContext context) throws Exception {
		// Do some security checks!
		Logger.getLogger("SecurityLog").info(
				context.getMethod().getName() + "is accessed!");
		return context.proceed();
	}
}