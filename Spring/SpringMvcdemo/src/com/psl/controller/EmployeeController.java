package com.psl.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.bean.Employee;
import com.psl.service.EmployeeService;

@Controller
@RequestMapping(value="/emp")
public class EmployeeController {
	
	private EmployeeService service;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String showHomePage(Model model){
		System.out.println("coltrollers homepage method");
		model.addAttribute("employee", new Employee());
		
		 List<Employee> list=service.getALLEmployees();
	        for (Employee employee : list) {
	                        System.out.println(employee);
	        }
		return "home";
	}
	
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String register(Employee e){
		System.out.println("coltroller register "+e.getName());
		service.addEmployee(e);
		
		return "redirect:/emp/home";
	}
	
	
	@RequestMapping(value="/{empName}", method=RequestMethod.GET)
	public String showEmpPage(@PathVariable String empName,@RequestParam(value="addr") String addr1,@RequestParam String dept){
		System.out.println("showEmpPage "+ empName+ " lives in "+addr1+" and from department "+dept);
		
		return "emp";
	}


	public EmployeeService getService() {
		return service;
	}


	public void setService(EmployeeService service) {
		this.service = service;
	}

}
