package com.example.lesson06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.lesson06.bo.UsersBO;

@Controller

public class Lesson06Controller {

	@Autowired
	private UsersBO usersBo;
	
	@RequestMapping("/lesson06/ex01/add_user_view")
	public String addUserView() {
		
		return "lesson06/addUser";
		
	}
	//ajax 로 요청된 aip는 응답값이 ResponseBody로 String 으로 내려간다
	@ResponseBody 
	@PostMapping("/lesson06/ex01/add_user")
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam("email") String email,
			@RequestParam(value="introduce", required = false) String introduce
			) {
		
		
		// TODO : 받은 data 로 db insert 해야함.
		
		usersBo.addUser(name, yyyymmdd, email, introduce);
		
		
		return "success";
	}
	
	
	@RequestMapping("/lesson06/ex01/get_user_view")
	public String view() {
		
		return "lesson06/getUser";
	}
	
}
