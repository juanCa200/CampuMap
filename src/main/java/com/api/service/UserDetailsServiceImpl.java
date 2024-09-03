package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.stereotype.Service;

import com.api.entity.Usuarios;
import com.api.repository.RepositoryUsuario;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	RepositoryUsuario repositorio;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuarios usuarios = repositorio.findByCodigo(username);
		UserBuilder builder = null;
		
		if (usuarios != null) {
			builder = User.withUsername(username);
			builder.disabled(false);
			builder.password(usuarios.getPassword());
			builder.authorities(new SimpleGrantedAuthority("ROLE_USER"));

		} else {
			throw new UsernameNotFoundException("Usuario no encontrado");
		}
		return builder.build();
	}
	
	
}
