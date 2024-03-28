package com.ncuindia.edu.studentenrollmentsystem.courseservice;

import java.util.List;

import com.ncuindia.edu.studentenrollmentsystem.course.Course;

public interface CourseService {

	public List<Course> getCourse();
	public void insertCourse(Course course);
	public String removeCourse(int id);
	public String modifyCourse();
}
