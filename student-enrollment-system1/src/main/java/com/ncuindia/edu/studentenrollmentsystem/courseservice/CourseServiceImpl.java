package com.ncuindia.edu.studentenrollmentsystem.courseservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncuindia.edu.studentenrollmentsystem.course.Course;
import com.ncuindia.edu.studentenrollmentsystem.coursecontroller.CourseController;
@Service
public class CourseServiceImpl implements CourseService {

	private CourseController coursecontroller;
	@Autowired
	public CourseServiceImpl(CourseController coursecontroller) {
		this.coursecontroller=coursecontroller;
	}
	public CourseServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<Course> getCourse() {
		coursecontroller.getCourseDetails();
		return null;
	}

	@Override
	public void insertCourse(Course course) {
		System.out.println("Course added: " + coursecontroller.saveCourseDetails(course));

	}

	@Override
	public String removeCourse(int id) {
		return coursecontroller.deleteCourseDetails(id);
	}

	@Override
	public String modifyCourse() {
		return coursecontroller.updateCourseDetails(0, null);
	}

}
