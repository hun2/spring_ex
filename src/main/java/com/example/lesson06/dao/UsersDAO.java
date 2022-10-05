package com.example.lesson06.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDAO {

	
	public void insertUsers(
			@Param("name") String name, 
			@Param("yyyymmdd") String yyyymmdd, 
			@Param("email") String email, 
			@Param("introduce") String introduce);
	
	
}
