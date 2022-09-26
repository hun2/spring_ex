package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.UserBO;
import com.example.lesson04.model.User;

@RequestMapping("/lesson04/ex01")
@Controller
public class Lesson04Ex01Controller {

	// view 붙으면 jsp로 하는걸로 기준세움 
	//요청 url : http://localhost/lesson04/ex01/add_user_view
	
	@RequestMapping(path = "/add_user_view", method = RequestMethod.GET)
	public String addUserView() {
	
		return "lesson04/addUser";
	}
	
	
	@Autowired
	private UserBO userBo;
	
	//유저 정보 insert 추가 맵핑
	//요청 url : http://localhost/lesson04/ex01/add_user
	@PostMapping("/add_user")
	public String addUser(@RequestParam("name") String name, @RequestParam("yyyymmdd") String yyyymmdd, 
			@RequestParam("email") String email,@RequestParam(value = "introduce", required = false) String introduce) {
			// null 이 있을경우 introduce 처럼 해야함.
		
		
		// db insert 
		
		userBo.addUser(name, yyyymmdd, email, introduce);
		
		// 결과 jsp
		return "lesson04/afterAddUser";
		
		
	}
	
	
	//요청 url : http://localhost/lesson04/ex01/get_last_user_view
	
	@GetMapping("/get_last_user_view")
	public String getLastUser(Model model) {
		//가장 최근에 추가된 사람 한명 가져오기 -  db select 
		User user = userBo.getLastUser();
		
		//결과 jsp에서 객체값을 꺼내서 사용할 수 있다.
		model.addAttribute("result", user);
		model.addAttribute("subject", "회원정보");
		
		return "lesson04/getLastUser";
	}
	
}
