package com.technoelevate.EMPLOYEECONTROLLER.SERVICE;

import java.util.List;

import com.technoelevate.EMPLOYEECONTROLLER.DTO.EmployeeDetails;

public interface ServiceLayer {
	public boolean serviceToInsert(EmployeeDetails empd);
	
	public EmployeeDetails serviceToAuthenticate(EmployeeDetails empd);
	
	public boolean serviceDelete(EmployeeDetails empd);
	
	public List<EmployeeDetails> alldetails();
	
	public EmployeeDetails serviceToSearch(EmployeeDetails empd);
	
	 public boolean serviceToUpdate(EmployeeDetails empd);
}
