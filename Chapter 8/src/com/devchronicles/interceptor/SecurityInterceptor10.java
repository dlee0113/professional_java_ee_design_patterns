package com.devchronicles.interceptor;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Secure
@Interceptor
public class SecurityInterceptor10 {

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

	@PostConstruct
	public void onStart() {
		Logger.getLogger("SecurityLog").info("Activating");
	}

	@PreDestroy
	public void onShutdown() {
		Logger.getLogger("SecurityLog").info("Deactivating");
	}
}
