package com.in28minutes.jee;

public class ValidCredentialService {

	boolean isvalidCredential(String userName, String password) {
		if(userName.equalsIgnoreCase("Punj") && password.equalsIgnoreCase("Prakash")){
			return true;
		}
		return false;
	}

}
