package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Lesson05Controller {

	
	//요청 url : localhost/lesson5/ex01
	@RequestMapping("/lesson05/ex01")
	public String ex01() {
		
		return "lesson05/ex01";
	}
	
	
	@RequestMapping("/lesson05/ex02")
	public String ex02(Model model) {
		//List<String>
		List<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("배");
		fruits.add("수박");
		fruits.add("딸기");
		fruits.add("바나나");
		model.addAttribute("fruits", fruits);
		
		
		//List<Map<>>
		List<Map<String,Object>> users = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("name", "기훈");
		map.put("age", 33);
		map.put("hobby", "수영");
		users.add(map);
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("name", "태양");
		map2.put("age", 33);
		map2.put("hobby", "유튜브");
		users.add(map2);
		model.addAttribute("users", users);
		
		return "lesson05/ex02";
	}
	
	
	
	
}
