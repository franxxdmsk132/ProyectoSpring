package com.ista.spring.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.spring.models.entity.Categoria;

public interface ICategoriaDao extends CrudRepository<Categoria, Long> {

}
