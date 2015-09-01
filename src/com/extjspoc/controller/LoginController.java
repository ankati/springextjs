package com.extjspoc.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.extjspoc.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<Boolean> login(String some) throws IOException {
		return new ResponseEntity<Boolean>(loginService.validateCredentials(), HttpStatus.OK);
    }
	
}