package com.cg.login.staticdb;

import java.util.HashMap;

public class LoginDatabase {
	private static HashMap<String, String> hashmap = null;

	static {
		hashmap = new HashMap<String, String>();
	}

	public static HashMap<String, String> getLoginDetails() {
		hashmap.put("varun", "varun");
		hashmap.put("Admin", "Admin");
		return hashmap;

	}
}
