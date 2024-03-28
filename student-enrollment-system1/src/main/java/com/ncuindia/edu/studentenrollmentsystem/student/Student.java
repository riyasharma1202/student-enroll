package com.ncuindia.edu.studentenrollmentsystem.student;

public class Student {

	String studentName;
	int studentId;
	String studentBranch;
	
	public Student() {
		
	}
	

	public Student(String studentName, int studentId, String studentBranch) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentBranch = studentBranch;
	}


	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentBranch=" + studentBranch
				+ "]";
	}
	
}
