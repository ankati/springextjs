

package com.extjspoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extjspoc.dao.LoginDAO;

@Service
public class LoginService {

	@Autowired
	private LoginDAO loginDAO;
	
	public boolean validateCredentials() {
		return loginDAO.validateCredentials();
	}

}
