package com.zoho.StudentsManagements.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zoho.StudentsManagements.Model.StudentLogin;
@Repository
public class StudentRepoImp implements StudentRepository{
@Autowired
private JdbcTemplate  jdbcTemplate;

	@Override
	public void createstudentdetails(StudentLogin studentLogin) throws Exception {
		String query="insert into StudentDetails(id,student_name,age,blood_group) values (?,?,?,?)" ;
		jdbcTemplate.update(query,studentLogin.getId(),studentLogin.getStudentName(),studentLogin.getAge(),studentLogin.getBloodGroup());
	
	}

	@Override
	public void  deletestudent(int id) throws Exception {
		String query="delete from  StudentDetails where id=?";
		jdbcTemplate.update(query, id);
	}

	@Override
	public void updatestudent(StudentLogin studentLogin) throws Exception {
		String query="update StudentDetails set student_name=?,age=?,blood_group=? where id=?";
		jdbcTemplate.update(query,studentLogin.getStudentName(),studentLogin.getAge(),studentLogin.getBloodGroup(),studentLogin.getId() );
	}

}
