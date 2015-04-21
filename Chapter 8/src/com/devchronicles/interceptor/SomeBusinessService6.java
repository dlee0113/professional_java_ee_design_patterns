package com.devchronicles.interceptor;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class SomeBusinessService6 {
	@Interceptors(SecurityInterceptor.class)
	public void startService() {
		// Complex business logic
		Logger.getLogger("AppLog").info("done...");
	}

	public void startAnotherService() {
		// Complex business logic
		Logger.getLogger("AppLog").info("done again...");
	}
}