package com.authentication.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.model.User;
import com.authentication.service.UserService;

@RestController
public class HomeController {

	@Autowired
	UserService service;
	
	@GetMapping("/test")
    public String test() {
        return "Testing message   ";
    }

	@GetMapping("/get")
	public List<User> users(){
		return service.getUsers();
	}
}
