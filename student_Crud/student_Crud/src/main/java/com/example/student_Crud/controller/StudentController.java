package com.example.student_Crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.student_Crud.repository.StudentRepository;
import com.example.student_Crud.model.Student;



@Controller
public class StudentController {
	@Autowired
    private StudentRepository studentRepository;

	@GetMapping("/list")
	public String studentlist(Model model) {
		
		model.addAttribute("allstudents", studentRepository.findAll());
		return "student_list";
		
	}
	
    @GetMapping("/list/add")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "student_form";
    }
	
	

}
