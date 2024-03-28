package com.ncuindia.edu.studentenrollmentsystem.coursecontroller;

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

import com.ncuindia.edu.studentenrollmentsystem.course.Course;
import com.ncuindia.edu.studentenrollmentsystem.student.Student;

@RestController
@RequestMapping("/app")
public class CourseController {

	List<Course> courseList = new ArrayList<>();
	
	@GetMapping("/course/getdetails")
    public List<Course> getCourseDetails() {
    	return courseList;
    }
	
	@PostMapping("/course/savedetails")
	public String saveCourseDetails(@RequestBody Course course) {
		courseList.add(course);
		return "Course added: " + course;
	}
	
	@DeleteMapping("/course/deletecourse/{id}")
	public String deleteCourseDetails(@PathVariable int id) {
		
		Iterator<Course> iterator = courseList.iterator();
		while(iterator.hasNext()) {
			Course course = iterator.next();
			if(course.getCourseId()==id) {
				iterator.remove();
				return "Course deleted: "+course;
			}
		}
		return "Record not found!!";
	}
	
	@PutMapping("/course/updatecourse/{id}")
	public String updateCourseDetails(@PathVariable int id, @RequestBody Course course) {
    Iterator<Course> iterator = courseList.iterator();
    while ( iterator.hasNext()){
    	Course course1 = iterator.next();
    	if(course1.getCourseId()== id) {
    		course1.setCourseName(course1.getCourseName());
    		course1.setCourseId(course1.getCourseId());
    		course1.setCourseCredits(course1.getCourseCredits());
    		
    		
    	}
    }
		return null;
	}
}
