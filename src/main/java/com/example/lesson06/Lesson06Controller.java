package com.example.lesson06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
	
	//------------------------ex02 회원가입 관련 page 제작
	
	@RequestMapping("/lesson06/ex02/add_name_view")
	public String ex02() {
		
		
		return "lesson06/addName";
	}
	
	
	@ResponseBody
	@GetMapping("/lesson06/ex02/is_duplication")
	public Map<String, Boolean> ex02_1(@RequestParam("name") String name) {
		
		//select 
		
		
		//결과
		Map<String , Boolean> result = new HashMap<>();
		// true 면 중복  false 면 중복아님.
		boolean isDuplication = usersBo.existUserByName(name);
		result.put("isduplication", isDuplication);
		
		
		
		
		return result;
	}
	
	
	
	
	
	
	
}
