package com.technoelevate.EMPLOYEECONTROLLER.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.technoelevate.EMPLOYEECONTROLLER.DTO.EmployeeDetails;

public class RowMapperImp implements RowMapper<EmployeeDetails> {
	
	EmployeeDetails empd;
@Override
public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
	EmployeeDetails empd=new EmployeeDetails();
	empd.setEmpid(rs.getString(1));
	empd.setFirst_name(rs.getString(2));
	empd.setLast_name(rs.getString(3));
	empd.setUser(rs.getString(4));
	empd.setPasskey(rs.getString(5));
	empd.setNumber(rs.getString(6));
//	System.out.println(rs.getString(1));
//	System.out.println(rs.getString(2));
//	System.out.println(rs.getString(3));
//	System.out.println(rs.getString(4));
//	System.out.println(rs.getString(5));
	return empd;
}
}
