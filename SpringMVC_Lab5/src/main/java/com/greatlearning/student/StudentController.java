package com.greatlearning.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/books")
	public String getBooks() {
		//get Data from DB
		//send the value to view
		return null;

	}

}
