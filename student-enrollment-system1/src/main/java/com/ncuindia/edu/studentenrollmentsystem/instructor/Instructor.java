package com.ncuindia.edu.studentenrollmentsystem.instructor;

public class Instructor {

	String instructorName;
	int instructorId;
	double instructorSalary;
	
	public Instructor() {
		
	}

	
	public Instructor(String instructorName, int instructorId, double instructorSalary) {
		super();
		this.instructorName = instructorName;
		this.instructorId = instructorId;
		this.instructorSalary = instructorSalary;
	}


	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public double getInstructorSalary() {
		return instructorSalary;
	}

	public void setInstructorSalary(double instructorSalary) {
		this.instructorSalary = instructorSalary;
	}

	@Override
	public String toString() {
		return "Instructor [instructorName=" + instructorName + ", instructorId=" + instructorId + ", instructorSalary="
				+ instructorSalary + "]";
	}
	
	
}
