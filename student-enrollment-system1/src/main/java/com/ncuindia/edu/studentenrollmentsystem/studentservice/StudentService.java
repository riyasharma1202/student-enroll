package com.ncuindia.edu.studentenrollmentsystem.studentservice;

import java.util.List;

import com.ncuindia.edu.studentenrollmentsystem.student.Student;

public interface StudentService {

	public List<Student> getStudent();
	public void insertStudent(Student student);
	public String removeStudent(int id);
	public String modifyStudent();
	
}
