package com.devchronicale.di;

import javax.inject.Named;

@Named("UserDataRepositoryMongo")
public class UserDataRepositoryMongo implements UserDataRepository {

	@Override
	public void save(User user) {
		// Persistence Code Here
	}
}
