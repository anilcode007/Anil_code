package com.technoelevate.EMPLOYEECONTROLLER.DAO;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.technoelevate.EMPLOYEECONTROLLER.DTO.EmployeeDetails;
@Component
public class EmployeeDetailsDAO  implements DAOInterface{
	ApplicationContext context=new ClassPathXmlApplicationContext("com/technoelevate/EMPLOYEECONTROLLER/DAO/config.xml");
	JdbcTemplate template=context.getBean("myTemplate",JdbcTemplate.class);

	public boolean createDetails(EmployeeDetails empd) {
		boolean insert=false;
		try {
			String query="Insert into details values(?,?,?,?,?,?)";
			template.update(query,empd.getEmpid(),empd.getFirst_name(),empd.getLast_name(),empd.getUser(),empd.getPasskey(),empd.getNumber());
		insert=true;
		}
		
		catch( Exception e){
			e.printStackTrace();
		}
		return insert;
		
	}
	
	public EmployeeDetails authenticateDetails(EmployeeDetails empd) {
		String id =empd.getEmpid();
			String query="SELECT * FROM  details where empid=?";
		return template.queryForObject(query,new RowMapperImp(),id);
	}
	
	@Override
	public boolean deleteDetails(EmployeeDetails empd) {
		boolean insert=false;
		String id =empd.getEmpid();
		System.out.println(id);
		try {
			String query="Delete from  details where empid=?";
			template.update(query,id);
			insert=true;
		}
		catch( Exception e){
			e.printStackTrace();
		}
		return insert;
	}
	
	public List<EmployeeDetails> getDetails() {
		RowMapper<EmployeeDetails> mapper=new RowMapperImp();
		String q="SELECT * FROM employee.DETAILS;";
		List<EmployeeDetails> list=template.query(q, mapper);
		return list;
}

@Override
	public EmployeeDetails searchDetails(EmployeeDetails empd) {
	String id =empd.getEmpid();
	String query="SELECT * FROM  details where empid=?";
return template.queryForObject(query,new RowMapperImp(),id);
		
	}
@Override
public boolean updateDetails(EmployeeDetails empd) {
	boolean insert=false;
	String id =empd.getEmpid();
	String fn =empd.getFirst_name();
	String ln =empd.getLast_name();
	String user =empd.getUser();
	String pass =empd.getPasskey();
	String num =empd.getNumber();
	try {
		String query="Update details set first_name=?,last_name=?,user=?,passkey=?,number=? where empid=?";
		template.update(query,fn,ln,user,pass,num,id);
		insert=true;
	}
	catch( Exception e){
		e.printStackTrace();
	}
	return insert;
}
}
