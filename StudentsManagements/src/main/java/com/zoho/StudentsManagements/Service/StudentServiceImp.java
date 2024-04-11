package com.zoho.StudentsManagements.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.StudentsManagements.Model.StudentLogin;
import com.zoho.StudentsManagements.Repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public void createstudentdetails(StudentLogin studentLogin) throws Exception {
		studentRepository.createstudentdetails(studentLogin);

	}

	@Override
	public void deletestudent(int id) throws Exception {
		studentRepository.deletestudent(id);
		
	}

	@Override
	public void updatestudent(StudentLogin studentLogin) throws Exception {
		studentRepository.updatestudent(studentLogin);

	}

}
