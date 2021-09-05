package com.technoelevate.EMPLOYEECONTROLLER.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.technoelevate.EMPLOYEECONTROLLER.DAO.EmployeeDetailsDAO;
import com.technoelevate.EMPLOYEECONTROLLER.DTO.EmployeeDetails;
@Component
public class Service implements ServiceLayer {
	@Autowired
	EmployeeDetailsDAO dao;
	
	@Override
	public boolean serviceToInsert(EmployeeDetails empd) {
		if(empd==null) {
			return false;
		}
		return dao.createDetails(empd);
	}
	
	@Override
	public EmployeeDetails serviceToAuthenticate(EmployeeDetails empd) {
		EmployeeDetails loginInfo=dao.authenticateDetails(empd);
		if(empd.getUser().equalsIgnoreCase(loginInfo.getUser())&&(empd.getPasskey().equals(loginInfo.getPasskey()))) {
			return loginInfo;
		}
		else
		return null;
	}
@Override
	public List<EmployeeDetails> alldetails() {
		List<EmployeeDetails> list =dao.getDetails();
		return list;
	}
	@Override
	public boolean serviceDelete(EmployeeDetails empd) {
		if(empd==null) {
			return false;
		}
		return dao.deleteDetails(empd);
	}
@Override
public EmployeeDetails serviceToSearch(EmployeeDetails empd) {
	EmployeeDetails loginInfo=dao.searchDetails(empd);
		return loginInfo;
}
@Override
public boolean serviceToUpdate(EmployeeDetails empd) {
	
	return dao.updateDetails(empd);
}
}
