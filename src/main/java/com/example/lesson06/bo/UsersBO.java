package com.example.lesson06.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson06.dao.UsersDAO;

@Service
public class UsersBO {

	@Autowired
	private UsersDAO usersDao;
	
	public void addUser(String name, String yyyymmdd, String email, String introduce) {
		
		usersDao.insertUsers(name, yyyymmdd, email, introduce);
	}
}
