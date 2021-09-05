package com.technoelevate.EMPLOYEECONTROLLER.DAO;

import java.util.List;

import com.technoelevate.EMPLOYEECONTROLLER.DTO.EmployeeDetails;

public interface DAOInterface {
	public boolean createDetails(EmployeeDetails empd);
	
	public EmployeeDetails authenticateDetails(EmployeeDetails empd);
	
	public boolean deleteDetails(EmployeeDetails empd);
	
	public List<EmployeeDetails> getDetails();
	
	public EmployeeDetails searchDetails(EmployeeDetails empd);
	
	public boolean updateDetails(EmployeeDetails empd);
}
