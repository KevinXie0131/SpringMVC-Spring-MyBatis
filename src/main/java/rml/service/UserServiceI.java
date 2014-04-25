package rml.service;

import java.util.List;

import rml.model.User;

public interface UserServiceI {

	public User getUserById(String id);

	List<User> getAll();

	List<User> getAll2();

	List<User> getAll3();

}
