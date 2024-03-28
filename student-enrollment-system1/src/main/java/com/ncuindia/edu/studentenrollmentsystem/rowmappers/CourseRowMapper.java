package com.ncuindia.edu.studentenrollmentsystem.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ncuindia.edu.studentenrollmentsystem.course.Course;

public class CourseRowMapper implements RowMapper<Course> {

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		Course cr = new Course();
		cr.setCourseName(rs.getString("MFW"));
		cr.setCourseId(rs.getInt(1));
		cr.setCourseCredits(rs.getInt(12));
		
		return null;
	}

	
}
