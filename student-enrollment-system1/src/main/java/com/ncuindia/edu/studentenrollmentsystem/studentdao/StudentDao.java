package com.ncuindia.edu.studentenrollmentsystem.studentdao;

import java.util.List;

import com.ncuindia.edu.studentenrollmentsystem.student.Student;

public interface StudentDao {

	public List<Student> getStudentFromDB();
	public Student saveStudentToDB(Student student);
	public Student deleteStudentFromDB(int id);
	public void updateStudentInDB(int id,String name);
}
