package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
}
