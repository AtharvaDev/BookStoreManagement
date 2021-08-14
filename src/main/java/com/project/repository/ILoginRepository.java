package com.project.repository;

import com.project.entities.User;

public interface ILoginRepository {

	public User addUser(User user);
	public User removeUser(User user);
	public User validateUser(User user);
}
