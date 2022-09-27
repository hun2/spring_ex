package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson04.model.Student;

@Controller
public class Lesson04Ex02Controller {

	
	
	@RequestMapping("/lesson04/ex02/add_student_view")
	public String addstudentView() {
		
		
		return "lesson04/addStudent";
	}
	
	
	@Autowired
	private StudentBO studentBo;
	
	
	@PostMapping("/lesson04/ex02/add_student")
	// 리퀘스트 파람 말고 객체에 담아서 post 하는 방법
	// @modelattribute 를 생략해도 상관 무 
	// @modelattribute 에는 @requestparam 과 일치하는 필드에 값이 들어간다.
	public String addStudent(
			@ModelAttribute Student student
			, Model model
			) {
		
		//db insert 
		studentBo.addStudent(student);
		
		//db select ( 마지막에 추가한 db 가져오기 => student.getid 값으로.  => xml 파일안에 셋팅하는 법 있음.)
		Student currentstudent = studentBo.getStudentById(student.getId());
		
		
		// model 에 담기.
		model.addAttribute("student", currentstudent);
		model.addAttribute("subject", "학생 정보");
		
		// jsp 경로 return
		
		return "lesson04/afterAddStudent";
	}
}
