package com.example.lesson03.model.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	//파라미터가 여러개가 되는경우는 앞에 어노테이션을 붙여야함
	// 단건일때는 하기건 처럼 생략이 가능.
	public Review selectReviewById(int id);
	
	public int insertReview(Review review);   // 한개만 보낼거면 이렇게 여러개 일경우 @Param 써서 
	// review 객체의 내용을행 추가
	
	
	public int insertReviewAsField(
			
			@Param("storeId") int storeId, 
			@Param("menu") String menu, 
			@Param("userName") String userName, 
			@Param("point") Double point, 
			@Param("review") String review);
	
	public int updateReviewById(
			@Param("id") int id,
			@Param("review") String review);
	
	
	
	public void deleteReviewById(int id);
	
	
}


