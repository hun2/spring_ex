package com.example.lesson02.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.lesson02.model.UsedGoods;

@Repository
public interface UsedGoodsDAO {
	
	// BO => DAO 에 요청
	// input = 없음 
	// output = List<UsedGoods>
	
	
	public List<UsedGoods> selectUsedGoodsList();
		

}
