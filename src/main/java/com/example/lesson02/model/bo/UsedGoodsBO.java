package com.example.lesson02.model.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.model.UsedGoods;
import com.example.lesson02.model.dao.UsedGoodsDAO;

@Service
public class UsedGoodsBO {

	//순번
	// Controller 에서 BO 한테 요청
	// 메소드 input : 없음
	// output  : List<UsedGoods>
	
	// autowired는 DAO 객체를 가져오는거임. (= new)
	@Autowired
	//        클래스명       객체명
	private UsedGoodsDAO usedGoodsDAO;
	
	// 메소드 명은 관례적으로 get 으로쓰고 타입명을 붙여줌.
	public List<UsedGoods> getUsedGoodsList(){
		return usedGoodsDAO.selectUsedGoodsList();
	}
	
}
