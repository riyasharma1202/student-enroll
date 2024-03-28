package com.ncuindia.edu.studentenrollmentsystem.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ncuindia.edu.studentenrollmentsystem.instructor.Instructor;

public class InstructorRowMapper implements RowMapper<Instructor> {

	@Override
	public Instructor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Instructor inst = new Instructor();
		inst.setInstructorName(rs.getString("acbd"));
		inst.setInstructorId(rs.getInt(1));
		inst.setInstructorSalary(rs.getDouble(180000));
		return inst;
	}

}


