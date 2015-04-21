package com.devchronicles.observer;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

// LISTING 6-23
public class EventProducer {
	@Produces
	@Named("Logging")
	public String messageAFactory() {
		return "A message";
	}

	@Produces
	@Named("Message")
	public String messageBFactory() {
		return "Another message";
	}
}