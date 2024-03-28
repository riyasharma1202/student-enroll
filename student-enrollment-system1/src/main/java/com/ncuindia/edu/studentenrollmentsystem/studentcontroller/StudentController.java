package com.ncuindia.edu.studentenrollmentsystem.studentcontroller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncuindia.edu.studentenrollmentsystem.student.Student;
@RestController
@RequestMapping("/app")
public class StudentController {

		List<Student> studentList = new ArrayList<>();
		
		@GetMapping("/student/getdetails")
	    public List<Student> getStudentDetails() {
	    	return studentList;
	    }
		
		@PostMapping("/student/savedetails")
		public String saveStudentDetails(@RequestBody Student student) {
			studentList.add(student);
			return "Student added: " + student;
		}
		
		@DeleteMapping("/student/deletestudent/{id}")
		public String deleteStudentDetails(@PathVariable int id) {
			
			Iterator<Student> iterator = studentList.iterator();
			while(iterator.hasNext()) {
				Student student = iterator.next();
				if(student.getStudentId()==id) {
					iterator.remove();
					return "Student deleted: "+student;
				}
			}
			return "Record not found!!";
		}
		
		@PutMapping("/student/updatestudent/{id}")
		public String updateStudentDetails(@PathVariable int id, @RequestBody Student student) {
	    Iterator<Student> iterator = studentList.iterator();
	    while ( iterator.hasNext()){
	    	Student student1 = iterator.next();
	    	if(student1.getStudentId()== id) {
	    		student1.setStudentName(student1.getStudentName());
	    		student1.setStudentId(student1.getStudentId());
	    		student1.setStudentBranch(student1.getStudentBranch());
	    		
	    	}
	    }
			return null;
		}
}
