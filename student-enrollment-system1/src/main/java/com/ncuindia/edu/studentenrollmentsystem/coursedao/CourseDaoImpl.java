package com.ncuindia.edu.studentenrollmentsystem.coursedao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ncuindia.edu.studentenrollmentsystem.course.Course;
import com.ncuindia.edu.studentenrollmentsystem.rowmappers.CourseRowMapper;
@Repository

public class CourseDaoImpl implements CourseDao {

private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	@Override
	public List<Course> getCourseFromDB() {
		String query ="select * from course";
		RowMapper<Course> rowMapper = new CourseRowMapper();
		List<Course> course =jdbcTemplate.query(query,new BeanPropertyRowMapper<Course>(Course.class));
		return null;
	}

	@Override
	public Course saveCourseToDB(Course course) {
		String query ="insert into student values(?,?,?)";
		Object records[]= {course.getCourseName(),course.getCourseId(),course.getCourseCredits()};
		jdbcTemplate.update(query,records);
		System.out.println("Records added successfully! "+ course.getCourseName());
		return null;
	}

	@Override
	public Course deleteCourseFromDB(int id) {
		String sql =" delete from course where idcourse =?";
		int noOfRowDeleted = jdbcTemplate.update(sql,id);
		return null;
	}

	@Override
	public void updateCourseInDB(int id, String name) {
		String sql ="Update course set namecourse =? where idcourse =?";
		int noOfRowUpdated=jdbcTemplate.update(sql,name,id);
		System.out.println("Updated Rows: "+ noOfRowUpdated);

	}

}
