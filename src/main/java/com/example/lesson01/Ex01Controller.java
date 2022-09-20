package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")    //위에서 부터 맵핑해노면 밑에는 간편하게 맵핑 가능. => 여기서부터 읽음 => 즉 공통 맵핑.
@Controller   // spring bean = > 스프링 객체라고 함.
public class Ex01Controller {

	
	
	// String 출력하기.
	// 요청 url : http://localhost:8080/lesson01/ex01/1
	@ResponseBody  // 요청하는 값(리턴되는 값)을 body 에 넣겠다 
	@RequestMapping("/1") // 주소 mapping 
	public String ex01_1() {
		String text = "<h1>예제1번<br> 문자열을 response body 로 보내는 예제</h1>";
		return text;
	}
	
	
	//Map 출력하기. => json이 되는지 확인하신다함 테스트하실때.
	//요청 url : http://localhost:8080/lesson01/ex01/2
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();
		map.put("apple", 5);
		map.put("banana", 2);
		map.put("orange", 4);
		map.put("watermelon", 99);
		
		//map을 리턴하면 json으로 나타난다. 원래 map 은 {"apple" = 4...} 이렇게 나와야하는데 { apple : 4....} 으로 나옴.
		//기본설정 한 build.gradle 에 dependencies 에 라이브러리가 포함되어 있음 . jackson이라는 
		//알아서 변환을 해줌.
		return map;
	}
	
	
	
	
	
	
}
