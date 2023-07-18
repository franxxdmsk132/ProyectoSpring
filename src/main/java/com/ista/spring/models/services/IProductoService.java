package com.ista.spring.models.services;

import java.util.List;

import com.ista.spring.models.entity.Productos;

public interface IProductoService {
	
public List<Productos> findAll();
	
	public Productos save(Productos cliente);
	
	public Productos findById(Long id);
	
	public void delete(Long id);

}
