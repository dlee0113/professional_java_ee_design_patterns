package com.devchronicles.factory2;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventService {
	@Inject
	private MessageA messageA;
	@Inject
	private MessageB messageB;

	public void startService() {
		messageA.setMessage("This is message A");
		messageB.setMessage("This is message B");
		System.out.println("Start service call " + messageA.getMessage());
		System.out.println("Start service call " + messageB.getMessage());
	}
}
