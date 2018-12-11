package com.in28minutes.login;

public class ValidCredentialService {

	public boolean isvalidCredential(String userName, String password) {
		if(userName.equalsIgnoreCase("Punj") && password.equalsIgnoreCase("Prakash")){
			return true;
		}
		return false;
	}

}
