package com.nic.student_id.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nic.student_id.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
