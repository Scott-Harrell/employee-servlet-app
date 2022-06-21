package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Employee;
import com.revature.util.HibernateUtil;

public class EmployeeDao {

	// CRUD methods
	
	// Create (Think that in the service layer we'll have a register()
	public int insert(Employee e) {
		
		// Grab the session object
		Session ses = HibernateUtil.getSession();
		
		// Begin transaction
		Transaction tx = ses.beginTransaction();
		
		// Capture the PK returned when the session methof save() is called
		int pk = (int) ses.save(e);
		
		// return the pk
		return pk;
	}
	
	//Read
	public List<Employee> findAll(){
		
	}
	
	public boolean update(Employee e) {
		return false;
	}
}
