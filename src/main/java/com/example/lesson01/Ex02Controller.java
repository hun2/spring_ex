package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller    // @RestController 가 아님에 주의 ( jsp 를 뿌리는거기때문에 Controller  써야함)
public class Ex02Controller {

	// 요청 url : http://localhost/lesson01/ex02/
	@RequestMapping("/lesson01/ex02")
	public String ex02() {    // ★ view를 리턴할 때는 무조건 String ★
		
		
		// prefix=/WEB-INF/jsp/                  suffix=.jsp         
        				return "lesson01/ex02"; 
        
        				// application.properties 에 프리픽스와 서픽스를 넣기에 경로를 생략 가능.
        				//프리픽스 : 시작 경로
        				// 서픽스 : 마지막 경로 (끝나는형식)
        // responsebody 가 아닌 상태로 String 을 리턴하면 경로를 본다. (viewresolver에 의해 리턴된 String 이름의 view(jsp) 를 찾고 화면이 구성된다.
        				
    }
	
	
	
	
	
}
