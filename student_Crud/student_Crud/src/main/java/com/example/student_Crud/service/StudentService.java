
package com.example.student_Crud.service;

import java.util.List;

import com.example.student_Crud.model.Student;

public interface StudentService {
	
    List<Student> getAllStudents();
    void saveStudent(Student student);
    Student getStudentById( long id);
    void deleteStudentById(long id);
}
