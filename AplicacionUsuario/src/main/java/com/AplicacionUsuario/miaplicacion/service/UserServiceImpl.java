package com.AplicacionUsuario.miaplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AplicacionUsuario.miaplicacion.entity.User;
import com.AplicacionUsuario.miaplicacion.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;
	
	@Override
	public Iterable<User> getAllUsers() {
		
		return repository.findAll();
	}

}
