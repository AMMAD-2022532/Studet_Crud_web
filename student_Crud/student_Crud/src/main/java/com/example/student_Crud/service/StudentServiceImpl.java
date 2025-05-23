package com.example.student_Crud.service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.student_Crud.model.Student;
import com.example.student_Crud.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	 @Autowired
	    private StudentRepository studentRepository;

	    @Override
	    public List<Student> getAllStudents() {
	 
	      
	       // return studentRepository.findAll();
	    	return studentRepository.findAll(Sort.by(Sort.Direction.DESC, "Id"));
	    }
	    

	    @Override
	    public void saveStudent(Student student) {
	        studentRepository.save(student);
	    }

	    @Override
	    public Student getStudentById(long id) {
	        Optional<Student> optional = studentRepository.findById(id);
	        if (optional.isPresent()) {
	            return optional.get();
	        } else {
	            throw new RuntimeException("Student not found for ID : " + id);
	        }
	    }

	    @Override
	    public void deleteStudentById(long id) {
	        studentRepository.deleteById(id);
	    }
}
