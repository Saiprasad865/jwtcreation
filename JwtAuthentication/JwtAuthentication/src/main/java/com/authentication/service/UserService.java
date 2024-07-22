package com.authentication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.authentication.model.User;

@Service
public class UserService {

	private List<User> users=new ArrayList<>();

	public UserService() {
		super();
		users.add(new User(UUID.randomUUID().toString(),"vishal","vish@dev"));
		users.add(new User(UUID.randomUUID().toString(),"saiprasad","saiprasad@dev"));
		users.add(new User(UUID.randomUUID().toString(),"mahesh","mahesh@dev"));
	}
	
	public List<User> getUsers(){
		return users;
	}
}
