package com.extjspoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extjspoc.dao.EmployeeDAO;
import com.extjspoc.domain.Employee;
@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	public void save(Employee p) {
		employeeDAO.save(p);
	}

}
