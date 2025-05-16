package com.example.student_Crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.student_Crud.repository.StudentRepository;

import jakarta.validation.Valid;

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
    
    
    @PostMapping("/list/save")
    public String saveStudent(@ModelAttribute("student") Student student) {
    	 studentRepository.save(student);
    	    return "redirect:/list";
    }
    
    
    @PostMapping("/saveStudent")
    public String saveStudent(@Valid @ModelAttribute("student") Student student,
                              BindingResult result,
                              Model model) {
        if (result.hasErrors()) {
            return "add-student"; 
        }

        
        return "redirect:/students";
    }

    
    @GetMapping("/list/delete/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        studentRepository.deleteById(id);
        return "redirect:/list";
    }



}
