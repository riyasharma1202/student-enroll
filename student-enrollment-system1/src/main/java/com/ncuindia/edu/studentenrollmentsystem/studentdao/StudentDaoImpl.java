package com.ncuindia.edu.studentenrollmentsystem.studentdao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ncuindia.edu.studentenrollmentsystem.rowmappers.StudentRowMapper;
import com.ncuindia.edu.studentenrollmentsystem.student.Student;
@Repository
public class StudentDaoImpl implements StudentDao {
    
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	@Override
	public List<Student> getStudentFromDB() {
		String query ="select * from studemt";
		RowMapper<Student> rowMapper = new StudentRowMapper();
		List<Student> student =jdbcTemplate.query(query,new BeanPropertyRowMapper<Student>(Student.class));
		return null;
	}

	@Override
	public Student saveStudentToDB(Student student) {
		String query ="insert into student values(?,?,?)";
		Object records[]= {student.getStudentName(),student.getStudentBranch(),student.getStudentId()};
		jdbcTemplate.update(query,records);
		System.out.println("Records added successfully! "+ student.getStudentName());
		return null;
	}

	@Override
	public Student deleteStudentFromDB(int id) {
		String sql =" delete from studemt where idstudent =?";
		int noOfRowDeleted = jdbcTemplate.update(sql,id);
		return null;
	}

	@Override
	public void updateStudentInDB(int id, String name) {
		String sql ="Update student set namestudent =? where idstudemt =?";
		int noOfRowUpdated=jdbcTemplate.update(sql,name,id);
		System.out.println("Updated Rows: "+ noOfRowUpdated);

	}

}
