package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.model.UsedGoods;
import com.example.lesson02.model.bo.UsedGoodsBO;

@RestController
public class Lesson02RestController {
	
	
	//db 값 순번
	//controller => service  or (BO , business Object 로 일컫) 로직이 많음  =>  repository or ( DAO Data access Object 로 일컫 )=> Database
	
	
	@Autowired         //BO에서 값 호출 
	//       클래스명    객체명
	private UsedGoodsBO usedGoodsBO;
	
	
	//요청 url : http://localhost/lesson02/ex01
	@RequestMapping("/lesson02/ex01")
	public List<UsedGoods> ex01(){
		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList() ;
		
		return usedGoodsList;
		
	}
	
	
	
	
	
	
}
