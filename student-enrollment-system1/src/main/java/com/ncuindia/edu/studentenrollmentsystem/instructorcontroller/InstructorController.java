package com.ncuindia.edu.studentenrollmentsystem.instructorcontroller;

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

import com.ncuindia.edu.studentenrollmentsystem.instructor.Instructor;
import com.ncuindia.edu.studentenrollmentsystem.student.Student;

@RestController
@RequestMapping("/app")
public class InstructorController {

	List<Instructor> instructorList = new ArrayList<>();
	
	@GetMapping("/instructor/getdetails")
    public List<Instructor> getInstructorDetails() {
    	return instructorList;
    }
	
	@PostMapping("/instructor/savedetails")
	public String saveInstructorDetails(@RequestBody Instructor instructor) {
		instructorList.add(instructor);
		return "Instructor added: " + instructor;
	}
	
	@DeleteMapping("/instructor/deleteInstructor/{id}")
	public String deleteInstructorDetails(@PathVariable int id) {
		
		Iterator<Instructor> iterator = instructorList.iterator();
		while(iterator.hasNext()) {
			Instructor instructor = iterator.next();
			if(instructor.getInstructorId()==id) {
				iterator.remove();
				return "Instructor deleted: "+instructor;
			}
		}
		return "Record not found!!";
	}
	
	@PutMapping("/instructor/updateinstructor/{id}")
	public String updateInstructorDetails(@PathVariable int id, @RequestBody Instructor instructor) {
    Iterator<Instructor> iterator = instructorList.iterator();
    while ( iterator.hasNext()){
    	Instructor instructor1 = iterator.next();
    	if(instructor1.getInstructorId()== id) {
    		instructor1.setInstructorId(instructor1.getInstructorId());
    		instructor1.setInstructorName(instructor1.getInstructorName());
    		instructor1.setInstructorSalary(instructor1.getInstructorSalary());
    		
    	}
    }
		return null;
	}
	
}
