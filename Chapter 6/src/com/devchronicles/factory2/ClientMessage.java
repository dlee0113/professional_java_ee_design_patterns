package com.devchronicles.factory2;

import javax.ejb.TransactionAttribute;
import javax.inject.Inject;
import javax.ejb.TransactionAttributeType;

@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ClientMessage {

	@Inject
	@ShortMessage
	private MessageA messageA;

	@Inject
	@LongMessage
	private MessageB messageB;

	public void doEvent() {
		messageA.setMessage("This is a long email message.");
		messageB.setMessage("This is a short SMS message.");
		System.out.println(messageA.getMessage());
		System.out.println(messageB.getMessage());
	}
}