package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.User;

@Repository
public interface ILoginRepository extends JpaRepository<User, Integer>{

	public User addUser(User user);
	public User removeUser(User user);
	public User validateUser(User user);
}
