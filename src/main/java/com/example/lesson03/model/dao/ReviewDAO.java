package com.example.lesson03.model.dao;

import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	//파라미터가 여러개가 되는경우는 앞에 어노테이션을 붙여야함
	// 단건일때는 하기건 처럼 생략이 가능.
	public Review selectReviewById(int id);
	
}
