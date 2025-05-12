package com.example.student_Crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
    @Id
    private int studentId;
   
    private String name;

    private Integer age;

    private String email;
 
    private String department;

    private Double gpa ;
   
    private Integer graduationYear;

  
	  
	    public int getStudentId() {
	        return studentId;
	    }

	    public void setStudentId(int studentId) {
	        this.studentId = studentId;
	        
	    }

	    public String getName() {
	        return name;
	        
	    }

	    public void setName(String name) {
	        this.name = name;
	        
	    }

	    public Integer getAge() {
	        return age;
	        
	    }

	    public void setAge(Integer age) {
	    	
	        this.age = age;
	        
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public Double getGpa() {
	        return gpa;
	    }

	    public void setGpa(Double gpa) {
	        this.gpa = gpa;
	    }

	    public Integer getGraduationYear() {
	        return graduationYear;
	    }

	    public void setGraduationYear(Integer graduationYear) {
	        this.graduationYear = graduationYear;
	    }
}
