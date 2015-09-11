package com.extjspoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.extjspoc.dao.UserService;
import com.extjspoc.domain.Employee;
import com.extjspoc.domain.User;
import com.extjspoc.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private UserService UserService;
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public @ResponseBody
	ResponseEntity<Boolean> login1(String some) {
		Employee Employee = new Employee();
		Employee.setName("sdsdfg");
		employeeService.save(Employee);
		return null;
	}

	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public @ResponseBody
	ResponseEntity<Boolean> login2(String some) {
		User User =new User();
		User.setId(1);
		User.setName("sdgd");
		User.setSalary(12);
		 UserService.saveUser(User);
		return null;
	}

}
