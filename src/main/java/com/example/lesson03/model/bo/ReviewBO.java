package com.example.lesson03.model.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.model.Review;
import com.example.lesson03.model.dao.ReviewDAO;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewDAO reviewDao;
	
	//where 을 가져올때는 관례적으로 By라고 하고 그 뒤에는 컬럼명
	// input : 원하는 id
	// output : Review
	public Review getReviewById(int id) {
		
		return reviewDao.selectReviewById(id);
	}
	
	
	// insert 의 경우 리턴 타입은 2가지 => void, int  // int 의 경우 인서트가 성공한 행의 갯수를 받는것. 
	
	public int addReview(Review review) {
		return reviewDao.insertReview(review);
	}
	
	// reviewBo.addReviewAsField(4, "콤비네이션R", "김기훈", 4.5, "호호호하하하 존맛!!"));
	public int addReviewAsField(int storeId, String menu, String userName, Double point, String review) {
		
		return reviewDao.insertReviewAsField(storeId, menu, userName, point, review);
	}
	
	
	
	// 업데이트 
	
	public int updateReviewById(int id, String review) {
		return reviewDao.updateReviewById(id, review);
	}
}
