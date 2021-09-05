package com.technoelevate.EMPLOYEECONTROLLER.DTO;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class EmployeeDetails implements Serializable {
	private String empid;
	private String first_name;
	private String last_name;
	private String user;
	private String passkey;
	private String number;
	
	
}
