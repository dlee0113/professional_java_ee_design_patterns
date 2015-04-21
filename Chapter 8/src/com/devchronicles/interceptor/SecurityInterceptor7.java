package com.devchronicles.interceptor;

import java.util.logging.Logger;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
public class SecurityInterceptor7 {
	@AroundInvoke
	public Object doSecurityCheck(InvocationContext context) throws Exception {
		// Do some security checks!
		Logger.getLogger("SecurityLog").info(
				context.getMethod().getName() + "is accessed!");
		String user = (String) context.getContextData().get("user");
		if (user == null) {
			user = (String) context.getParameters()[0];
			context.getContextData().put("user", user);
		}
		return context.proceed();
	}
}