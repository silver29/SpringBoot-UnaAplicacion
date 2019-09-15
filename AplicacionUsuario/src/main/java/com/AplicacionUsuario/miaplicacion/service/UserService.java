package com.AplicacionUsuario.miaplicacion.service;

import javax.validation.Valid;

import com.AplicacionUsuario.miaplicacion.entity.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
}
