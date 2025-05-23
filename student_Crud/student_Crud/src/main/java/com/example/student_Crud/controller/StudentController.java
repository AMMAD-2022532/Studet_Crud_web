package com.example.student_Crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.student_Crud.model.Student;


import com.example.student_Crud.service.StudentService;

import jakarta.validation.Valid;



@Controller
public class StudentController {
	@Autowired
    private StudentService studentService;
	

	@GetMapping("/list")
	public String studentlist(Model model) {
		
		model.addAttribute("allstudents", studentService.getAllStudents());
		return "student_list";
		
	}
	
    @GetMapping("/list/add")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "student_form";
    }
    
    
  
    
    @PostMapping("/list/save")
    public String saveStudent(@Valid @ModelAttribute("student") Student student,
                              BindingResult result,
                              Model model) {
        if (result.hasErrors()) {
            return "student_form"; 
        }

        studentService.saveStudent(student);
        return "redirect:/list";
    }

    
    @GetMapping("/list/delete/{id}")
    public String deleteStudent(@PathVariable("id") long id) {
    	  studentService.deleteStudentById(id);
        return "redirect:/list";
    }
    
    
    @GetMapping("/list/edit/{id}")
    public String editStudent(@PathVariable("id") long id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "student_form";
    }
    @GetMapping("/login")
    public String loginPage() {
        return "login"; 
    }
  

  
}