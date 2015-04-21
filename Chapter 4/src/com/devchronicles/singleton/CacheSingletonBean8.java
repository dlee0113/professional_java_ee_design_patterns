package com.devchronicles.singleton;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import java.util.logging.Logger;

@Singleton
public class CacheSingletonBean8 {

	private Map<Integer, String> myCache;

	@PostConstruct
	public void start() {
		Logger.getLogger("MyGlobalLogger").info("Started!");
		myCache = new HashMap<Integer, String>();
	}

	public void addUser(Integer id, String name) {
		myCache.put(id, name);
	}

	public String getName(Integer id) {
		return myCache.get(id);
	}
}
