package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.model.Review;
import com.example.lesson03.model.bo.ReviewBO;


@RestController
public class Lesson03Ex02RestController {

	
	//insert 문 2개 타입
	
	@Autowired
	private ReviewBO reviewBo;
	
	// 요청 url : http://localhost/lesson03/ex02/1
	
	@RequestMapping("/lesson03/ex02/1")
	public String ex02_1 () {
		Review review = new Review();
		review.setStoreId(7);
		review.setMenu("삼겹혼밥세트");
		review.setUserName("김기훈");
		review.setPoint(4.5);
		review.setReview("맛있네");
		
		//insert 
		int row = reviewBo.addReview(review);   // 인서트 된 인트 타입을 리턴 받음. 즉 행의 갯수를 리턴받고 그걸 int 형 row 에 저장.
		
		//return String
		
		return "success row count:" + row;   // 리턴조지기
	}
	
	
	
	
	
	@RequestMapping("/lesson03/ex02/2")
	public String ex02_2() {
		int row = reviewBo.addReviewAsField(4, "콤비네이션R", "김기훈", 4.5, "호호호하하하 존맛!!");
		
		return "성공한 갯수" + row;
	}
	
}
