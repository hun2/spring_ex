package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.model.bo.ReviewBO;

@RestController
public class Lesson03Ex03RestController {

	
	@Autowired
	private ReviewBO reviewBo;
	
	// db 업데이트 
	//요청 url : http://localhost/lesson03/ex03?id=22&review=흠냐냐냐냐ㅑ냐아아앙
	
	@RequestMapping("/lesson03/ex03")
	public String ex03(@RequestParam("id") int id, @RequestParam("review") String review) {
		
		int now = reviewBo.updateReviewById(id, review);
		return "변경 완료요" + now;
				
	}
	
	
}
