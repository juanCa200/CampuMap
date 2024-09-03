package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Usuarios;

public interface RepositoryUsuario extends JpaRepository<Usuarios,Long> {
  public Usuarios findByCodigo(String codigo);
}
