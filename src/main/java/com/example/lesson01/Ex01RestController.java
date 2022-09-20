package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/lesson01/ex01")
@RestController   // @Controller + @Responsebody 어노테이션이 들어있다. 즉 짬뽕밥임. // 데이터만 리턴할 때 주로 쓰는 컨트롤러
// 보통 html 을 뿌리는 컨트롤러는 rest안쓰고 데이터값만 뿌릴때만 rest씀.
// 응답값을 String 으로 뿌리면 html, map이나 클래스로 뿌리면 json 이라고 생각하면 됨.
public class Ex01RestController {

	
	//요청 url : http://localhost:8080/lesson01/ex01/3
	
	@RequestMapping("/3")
	public String ex01_3() {
		return "@Restcontroller를 사용해 String 을 리턴해본다.";
	}
	
	
	//요청 url : http://localhost:8080/lesson01/ex01/4
	
	@RequestMapping("/4")
	public Map<String, Object> ex01_4 () {
		Map<String,Object> map = new HashMap<>();
		map.put("aaaa", 111);
		map.put("ㅁㅇㄴㅁㅇㄴㅁㅇ", 135131);
		map.put("낄리리리", 1231);
		map.put("후후후후후", 99);
		
		return map;
	}
	
	
	
	// 요청 url : http://localhost:8080/lesson01/ex01/5
	
	@RequestMapping("/5")
	public Data ex01_5 () {
		Data data = new Data(); // 일반 자바 been 이라 new 로 객체생성해야함.
		data.setId(1);
		data.setName("김기훈");
		
		return data;
	}
	
	
	
	// 요청 url : http://localhost:8080/lesson01/ex01/6
	
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		Data data = new Data();
		data.setId(1);
		data.setName("김기훈");
		
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
}
