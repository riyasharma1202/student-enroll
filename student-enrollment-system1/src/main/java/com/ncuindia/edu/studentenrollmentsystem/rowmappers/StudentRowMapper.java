package com.ncuindia.edu.studentenrollmentsystem.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ncuindia.edu.studentenrollmentsystem.student.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std = new Student();
		std.setStudentName(rs.getString("abc"));
		std.setStudentBranch(rs.getString("btech"));
		std.getStudentId();
		return null;
	}

}
