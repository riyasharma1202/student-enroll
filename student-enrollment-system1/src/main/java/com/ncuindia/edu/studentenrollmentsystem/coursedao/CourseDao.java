package com.ncuindia.edu.studentenrollmentsystem.coursedao;

import java.util.List;

import com.ncuindia.edu.studentenrollmentsystem.course.Course;

public interface CourseDao {

	public List<Course> getCourseFromDB();
	public  Course saveCourseToDB(Course course);
	public Course deleteCourseFromDB(int id);
	public void updateCourseInDB(int id,String name);

}
