package com.zoho.StudentsManagements.Repository;

import com.zoho.StudentsManagements.Model.StudentLogin;

public interface StudentRepository {
	public  void createstudentdetails(StudentLogin studentLogin) throws Exception;
	public void  deletestudent(int id) throws Exception;
	public void updatestudent(StudentLogin studentLogin) throws Exception;
	
}
