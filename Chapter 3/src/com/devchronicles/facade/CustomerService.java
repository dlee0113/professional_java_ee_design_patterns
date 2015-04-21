package com.devchronicles.facade;

import javax.ejb.Stateless;

@Stateless
public class CustomerService {
	public long getCustomer(int sessionID) {
		// get logged in customer id
		return 100005L;
	}

	public boolean checkId(long x) {
		// check if customer id is valid
		return true;
	}
}
