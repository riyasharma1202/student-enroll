package com.ncuindia.edu.studentenrollmentsystem.instructorservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncuindia.edu.studentenrollmentsystem.instructor.Instructor;
import com.ncuindia.edu.studentenrollmentsystem.instructorcontroller.InstructorController;

@Service
public class InstructorServiceImpl implements InstructorService{

	private InstructorController instructorcontroller;
	@Autowired
	public InstructorServiceImpl( InstructorController instructorcontroller) {
		this.instructorcontroller=instructorcontroller;
	}
	public InstructorServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<Instructor> getInstructor() {
		instructorcontroller.getInstructorDetails();
		return null ;
	}

	@Override
	public void insertInstructor(Instructor instructor) {
		System.out.println("Instructor added: " +instructorcontroller.saveInstructorDetails(instructor));
		
	}

	@Override
	public String removeInstructor(int id) {
		return instructorcontroller.deleteInstructorDetails(id);
	}

	@Override
	public String modifyInstructor() {
		return instructorcontroller.updateInstructorDetails(0, null);
	}

	
}
