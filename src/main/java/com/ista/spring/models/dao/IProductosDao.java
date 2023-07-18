package com.ista.spring.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.spring.models.entity.Productos;

public interface IProductosDao extends CrudRepository<Productos, Long>{

}
