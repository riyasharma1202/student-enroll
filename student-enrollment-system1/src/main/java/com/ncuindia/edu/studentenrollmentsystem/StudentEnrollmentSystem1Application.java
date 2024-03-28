package com.ncuindia.edu.studentenrollmentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.ncuindia.edu.studentenrollmentsystem.coursedao.CourseDao;
import com.ncuindia.edu.studentenrollmentsystem.coursedao.CourseDaoImpl;
import com.ncuindia.edu.studentenrollmentsystem.courseservice.CourseService;
import com.ncuindia.edu.studentenrollmentsystem.courseservice.CourseServiceImpl;
import com.ncuindia.edu.studentenrollmentsystem.instructordao.InstructorDao;
import com.ncuindia.edu.studentenrollmentsystem.instructordao.InstructorDaoImpl;
import com.ncuindia.edu.studentenrollmentsystem.instructorservice.InstructorService;
import com.ncuindia.edu.studentenrollmentsystem.instructorservice.InstructorServiceImpl;
import com.ncuindia.edu.studentenrollmentsystem.studentdao.StudentDao;
import com.ncuindia.edu.studentenrollmentsystem.studentdao.StudentDaoImpl;
import com.ncuindia.edu.studentenrollmentsystem.studentservice.StudentService;
import com.ncuindia.edu.studentenrollmentsystem.studentservice.StudentServiceImpl;
@ComponentScan
@SpringBootApplication
public class StudentEnrollmentSystem1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentEnrollmentSystem1Application.class, args);	
	}
	@Bean
	CourseService courseservice() {
		return new CourseServiceImpl();
	}
	
	@Bean
	CourseDao coursedao() {
		return new CourseDaoImpl();
	}
	@Bean
	StudentService studentservice() {
		return new StudentServiceImpl();
	}
	@Bean
	StudentDao StudentDao() {
		return new StudentDaoImpl();
	}
	@Bean
	InstructorService instructorservice() {
		return new InstructorServiceImpl();
	}
	@Bean
	InstructorDao instructordao() {
		return new InstructorDaoImpl();
	}
}
