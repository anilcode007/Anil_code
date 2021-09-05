package com.technoelevate.EMPLOYEECONTROLLER;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.technoelevate.EMPLOYEECONTROLLER.DTO.EmployeeDetails;
import com.technoelevate.EMPLOYEECONTROLLER.SERVICE.Service;

@Controller
@ComponentScan("com.technoelevate.EMPLOYEECONTROLLER.SERVICE")
@ComponentScan("com.technoelevate.EMPLOYEECONTROLLER.DAO")
public class EmployeeController {
	@Autowired
	Service service;
	
	@GetMapping(path="/home")
	public String home() {
		return "createAccount";
	}
	
	@PostMapping(path="/create")
	public String addDetails(ModelMap map,EmployeeDetails empd) {
		if(empd.getEmpid()!=(null)&&empd.getEmpid()!=(""))  {
		service.serviceToInsert(empd);
		map.addAttribute("empd",empd);
		return "empDetails";}
		else 
			return "error";
	}
	
	@GetMapping(path="/login")
	public String login() {
		return "Login";
	}
	
	@PostMapping(path="/loginc")
	public String login(ModelMap map,EmployeeDetails empd,HttpServletRequest request) {
		if(empd.getEmpid()!=(null)&&empd.getEmpid()!=("")) {
		EmployeeDetails loginInfo=service.serviceToAuthenticate(empd);
		HttpSession session=request.getSession();
		session.setAttribute("empd",loginInfo);
		if(loginInfo!=null) {
			map.addAttribute("empd",loginInfo);
			map.addAttribute("msg","LOGIN SUCCESSFULL");
			return "LoginDetails";
		}
		else
			return "UnLogin";
			}
		else {
			 return "error";
		}
		}
	
	@PostMapping(path="/details")
	public String showDetails() {
		return "ShowDetails";
	}
	
	@PostMapping(path="/showdetails")
	public String allDetails(ModelMap map) {

		List<EmployeeDetails> details=service.alldetails();
		map.addAttribute("empd", details);
		return "alldetails";
	}
	
	@PostMapping(path="/searchdetails")
	public String search(ModelMap map,EmployeeDetails empd) {
		if(empd.getEmpid()!=(null)&&empd.getEmpid()!=("")) {
		EmployeeDetails loginInfo=service.serviceToSearch(empd);
			map.addAttribute("empd",loginInfo);
			return "search";}
		else {
			 return "error";
		}
		}
	
	@PostMapping(path="/delete")
	public String delete(ModelMap map,EmployeeDetails empd) {
		boolean in=service.serviceDelete(empd);
		if(in==true) {
			return "Delete";
		}
		else
		return "error";
	}
	
	@PostMapping(path="/logout")
	public String logout() {
		return "Logout";
	}
	
	@PostMapping(path="/update")
	public String update() {
		return "update";
	}
	
	@PostMapping(path="/updated")
	public String updated(EmployeeDetails empd,ModelMap map) {
		boolean in=service.serviceToUpdate(empd);
		if(in==true) {
			map.addAttribute("msg","UPDATE SUCCESSFULL");
			return "Updated";
		}
		else {
			return "error";
		}
		 
	}
}
