package com.zoho.StudentsManagements.Service;

import com.zoho.StudentsManagements.Model.StudentLogin;

public interface StudentService {
	public  void createstudentdetails(StudentLogin studentLogin) throws Exception;
	public void deletestudent(int id) throws Exception;
	public void updatestudent(StudentLogin studentLogin) throws Exception;

}
