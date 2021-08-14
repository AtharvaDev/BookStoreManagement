package com.project.service;

import com.project.entities.User;

public interface ILoginService {

	public User addUser(User user);
	public User removeUser(User user);
	public User validateUser(User user);
}
