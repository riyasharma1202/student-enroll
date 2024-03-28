package com.ncuindia.edu.studentenrollmentsystem.instructorservice;

import java.util.List;

import com.ncuindia.edu.studentenrollmentsystem.instructor.Instructor;

public interface InstructorService {

	public List<Instructor> getInstructor();
	public void insertInstructor(Instructor instructor);
	public String removeInstructor(int id);
	public String modifyInstructor();
}
