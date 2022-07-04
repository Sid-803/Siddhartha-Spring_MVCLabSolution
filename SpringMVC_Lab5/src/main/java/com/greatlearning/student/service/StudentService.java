package com.greatlearning.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.SessionFactoryUtils;
import org.springframework.stereotype.Service;

import com.greatlearning.student.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private SessionFactoryUtils sessionFactory;
	
	public List<Student> findStudents(){
		
	}
	
	public void SaveStudent(Student student) {
		
	}
}
