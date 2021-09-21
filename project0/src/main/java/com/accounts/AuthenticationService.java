package com.accounts;

public interface AuthenticationService {

		public boolean validate(String username);
		public boolean authenticate (String username, String password);
}
