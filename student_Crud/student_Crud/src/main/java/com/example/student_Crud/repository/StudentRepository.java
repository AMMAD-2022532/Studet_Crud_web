package com.example.student_Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_Crud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>  {

	
}
