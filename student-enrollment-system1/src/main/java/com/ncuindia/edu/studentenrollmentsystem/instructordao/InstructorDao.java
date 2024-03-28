package com.ncuindia.edu.studentenrollmentsystem.instructordao;

import java.util.List;

import com.ncuindia.edu.studentenrollmentsystem.instructor.Instructor;

public interface InstructorDao {

	public List<Instructor> getInstructorFromDB();
	public  Instructor saveInstructorToDB(Instructor instructor);
	public Instructor deleteInstructorFromDB(int id);
	public void updateInstructorInDB(int id,String name);
}
