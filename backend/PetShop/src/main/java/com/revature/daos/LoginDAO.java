package com.revature.daos;

import org.hibernate.Session;

import com.revature.models.Users;
import com.revature.utils.HibernateUtil;

public class LoginDAO {
	
	public Users getUser(String username , String password) {
		Session ses = HibernateUtil.getSession();
		Users user = (Users) ses.createQuery("FROM Users U WHERE U.username = :username AND U.password = :password")
				.setParameter("username", username)
				.setParameter("password", password)
				.uniqueResult();
		
		
		System.out.println("Hibernate object");
		HibernateUtil.closeSession();
		
		if(user.getUsername().equals(username) && (user.getPassword().equals(password)))
			return user;
		else
			return null;
	}
	
//	public void updateToActive(String username) {
//		Session ses = HibernateUtil.getSession();
//		Users user = (Users) ses.createQuery("Update Users U set U.actuve = true WHERE U.username = :username")
//				.setParameter("username", username);
//		System.out.println("User: " + username + " is now active !");
//		
//		HibernateUtil.closeSession();
//	}
	

}
