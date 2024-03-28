package com.ncuindia.edu.studentenrollmentsystem.studentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncuindia.edu.studentenrollmentsystem.student.Student;
import com.ncuindia.edu.studentenrollmentsystem.studentcontroller.StudentController;
@Service
public class StudentServiceImpl implements StudentService {

private StudentController studentcontroller;
	
	@Autowired
	public StudentServiceImpl(StudentController studentcontroller) {
        this.studentcontroller = studentcontroller;
    }
	
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Student> getStudent() {
		studentcontroller.getStudentDetails();
		return null ;
	}

	@Override
	public void insertStudent(Student student) {
		System.out.println(" student added: " + studentcontroller.saveStudentDetails(student));

	}

	@Override
	public String removeStudent(int id) {
		return studentcontroller.deleteStudentDetails(id);
	}

	@Override
	public String modifyStudent() {
		return studentcontroller.updateStudentDetails(0, null);
	}

}
