package com.devchronicles.producer;

import javax.enterprise.inject.Produces;

public class EventProducer {
	@Produces
	public String getMessage() {
		return "Hello World";
	}
}