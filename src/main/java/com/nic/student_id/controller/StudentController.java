package com.nic.student_id.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nic.student_id.model.Student;
import com.nic.student_id.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	
	
	@GetMapping("/getStudent")
	public List<Student> get(){
		
		
		return service.getStudents();
	}
	
	@PostMapping("/saveStudent")
	public String save(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	
	@PutMapping("/updateStudent")
	public String update(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/deleteStudent")
	
	public String delete(@RequestBody Student student) {
		return service.deleteStudent(student);
	}
	
	@GetMapping("/getStudent/{roll_number}")
	public Optional<Student> get_data(@PathVariable("roll_number") int roll_number) {
		
		
		return service.getStudentById(roll_number);
		
	}

}
