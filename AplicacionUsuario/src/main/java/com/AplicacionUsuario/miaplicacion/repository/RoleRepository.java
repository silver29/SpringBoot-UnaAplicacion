package com.AplicacionUsuario.miaplicacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AplicacionUsuario.miaplicacion.entity.Role;
import com.AplicacionUsuario.miaplicacion.entity.User;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {

}
