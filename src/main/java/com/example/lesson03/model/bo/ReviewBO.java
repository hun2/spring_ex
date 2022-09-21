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
}
