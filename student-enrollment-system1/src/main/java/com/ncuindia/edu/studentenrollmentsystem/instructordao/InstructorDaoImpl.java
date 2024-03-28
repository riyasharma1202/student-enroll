package com.ncuindia.edu.studentenrollmentsystem.instructordao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ncuindia.edu.studentenrollmentsystem.instructor.Instructor;
import com.ncuindia.edu.studentenrollmentsystem.rowmappers.InstructorRowMapper;
@Repository
public class InstructorDaoImpl implements InstructorDao{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	@Override
	public List<Instructor> getInstructorFromDB() {
		String query ="select * from instructor";
		RowMapper<Instructor> rowMapper = new InstructorRowMapper();
		List<Instructor> instructor =jdbcTemplate.query(query,new BeanPropertyRowMapper<Instructor>(Instructor.class));
		return null;
	}

	@Override
	public Instructor saveInstructorToDB(Instructor instructor) {
		String query ="insert into instructor values(?,?,?)";
		Object records[]= {instructor.getInstructorName(), instructor.getInstructorId(),instructor.getInstructorSalary()};
		jdbcTemplate.update(query,records);
		System.out.println("Records added successfully! "+ instructor.getInstructorName());
		return null;
	}

	@Override
	public Instructor deleteInstructorFromDB(int id) {
		String sql =" delete from instructor where idinstructor =?";
		int noOfRowDeleted = jdbcTemplate.update(sql,id);
		return null;
	}

	@Override
	public void updateInstructorInDB(int id, String name) {
		String sql ="Update instructor set nameinstructor =? where idinstructor =?";
		int noOfRowUpdated=jdbcTemplate.update(sql,name,id);
		System.out.println("Updated Rows: "+ noOfRowUpdated);

		
	}

}
