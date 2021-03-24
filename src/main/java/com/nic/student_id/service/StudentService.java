package com.nic.student_id.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nic.student_id.model.Student;
import com.nic.student_id.repository.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	
	//get student details
	public List<Student> getStudents(){
		
		return repository.findAll();
	}
	
	//Save student details
	public String saveStudent(Student student) {
		
		repository.save(student);
		return "Your details Registered successfully!";
		
	}
	
	//Update student details
	
	public String updateStudent(Student student) {
		
		repository.save(student);
		return "Your details Updated Successfully!";
	}
	
	//Delete student details
	public String deleteStudent(Student student) {
		
		repository.delete(student);
		return "Your Data Deleted";
	}
	
	
	public Optional<Student> getStudentById(long roll_number) {
		
		Optional<Student> std = repository.findById((int) roll_number);
		
		return std;
	}


}
