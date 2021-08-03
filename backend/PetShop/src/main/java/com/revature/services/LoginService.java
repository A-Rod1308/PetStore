package com.revature.services;

import com.revature.daos.LoginDAO;
import com.revature.models.Users;

public class LoginService {
	
	LoginDAO lDAO = new LoginDAO();

	public boolean login(String username, String password) {
		
		//UserService userService = new UserService();
		
		//Users user = userService.getUserByUsername(username);
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		
		Users u = lDAO.getUser(username, password);
		
		if(username.equals(u.getUsername()) && password.equals(u.getPassword())) {
			return true;
		}
		
		return false;
		
	}
	
	
	public void updateToActive(String username) {
		lDAO.updateToActive(username);
	}
	public void updateToInactive(String username) {
		lDAO.updateToInactive(username);
	}


	public void updateToInactive() {
		lDAO.updateToInactive();
		
	}
	
}
