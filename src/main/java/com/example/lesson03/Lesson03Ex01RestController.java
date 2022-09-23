package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.model.Review;
import com.example.lesson03.model.bo.ReviewBO;

@RestController
public class Lesson03Ex01RestController {
	
	@Autowired
	private ReviewBO reviewBo;
	
	
	//요청 url : http://localhost/lesson03/ex01
	@RequestMapping("/lesson03/ex01")
	public Review ex01() {
		return reviewBo.getReviewById(5);
		
	}
	
	
	//파라미터 값으로 받아오기
	//요청 url :  http://localhost/lesson03/ex02?id=5
	@RequestMapping("/lesson03/ex02")
	public Review ex02(
			@RequestParam(value="id") int id
	) {
		return reviewBo.getReviewById(id);
	}
	
	//위에와 다른 방식이긴 하지만 똑같다고 보면 됨.  ( 필수 파라미터일때)
	//요청 url : http://localhost/lesson03/ex03
	@RequestMapping("/lesson03/03")
	public Review ex03(
			@RequestParam(value="id", required=true) int id // 필수 파라미터
	) {
		return reviewBo.getReviewById(id);
	}
	
	//필수 파라미터가 아닌 비 필수 일때 => 디폴드값이 아에 없는 경우
	@RequestMapping("/lesson03/ex04")
	public Review ex04(
			@RequestParam(value="id", required =false ) Integer id  // 비 필수 파라미터 => 비 필수 일때는 BO에서 파라미터 값도 Integer이여야함.
	) {
		return reviewBo.getReviewById(id);
		
	}
	
	
	//필수 파라미터가 아닌 비 필수 일때 => 디폴드값을 아에 설정 하는 경우.
		@RequestMapping("/lesson03/ex05")
		public Review ex05(
				@RequestParam(value="id", defaultValue = "1" ) int id  // 
		) {
			return reviewBo.getReviewById(id);
			
		}
	
	
	
	
	
}
