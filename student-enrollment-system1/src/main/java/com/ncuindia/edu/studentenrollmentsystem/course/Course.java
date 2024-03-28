package com.ncuindia.edu.studentenrollmentsystem.course;

public class Course {

	String courseName;
	int courseId;
	int courseCredits;
	
	public Course() {
		
	}

	public Course(String courseName, int courseId, int courseCredits) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.courseCredits = courseCredits;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getCourseCredits() {
		return courseCredits;
	}

	public void setCourseCredits(int courseCredits) {
		this.courseCredits = courseCredits;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseId=" + courseId + ", courseCredits=" + courseCredits + "]";
	}
	
	
}
