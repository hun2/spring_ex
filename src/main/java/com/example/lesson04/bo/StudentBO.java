package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.StudentDAO;
import com.example.lesson04.dao.UserDAO;
import com.example.lesson04.model.Student;

@Service
public class StudentBO {

	
	@Autowired
	private StudentDAO studentDao;

	public void addStudent(Student student) {
		
		studentDao.insertStudent(student);
	}
	
	
	public Student getStudentById(int id) {
		return studentDao.selectStudentById(id);
	}
}
