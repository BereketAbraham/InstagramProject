package edu.mum.cs.InstagramProject.service;

import java.util.List;

import edu.mum.cs.InstagramProject.domain.User;

public interface UserService {
	
	public User getUser(Long UserId);

	public User saveUser(User User);

	public User updateUser(User User);

	public User deleteUser(Long UserId);

	public List<User> getUserList();
	
}
