package com.extjspoc.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.extjspoc.domain.User;
@Component
public interface UserService {
	
	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(String id);
	public List<User> getAllUser();
}
