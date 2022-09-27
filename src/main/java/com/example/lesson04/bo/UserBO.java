package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.UserDAO;
import com.example.lesson04.model.Student;
import com.example.lesson04.model.User;

@Service
public class UserBO {

	@Autowired
	private UserDAO userDao;
	
	//성공 유부 갯수 요청 안받을거면 void
	public void addUser(String name, String yyyymmdd, String email, String introduce) {
		
		
		userDao.insertUser(name, yyyymmdd, email, introduce);
		
	}
	
	
	//select 
	public User getLastUser() {
		return userDao.selectLastUser();
	}
	
	
	
	
}
