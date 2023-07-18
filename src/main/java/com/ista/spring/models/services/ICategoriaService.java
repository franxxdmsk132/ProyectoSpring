package com.ista.spring.models.services;

import java.util.List;

import com.ista.spring.models.entity.Categoria;

public interface ICategoriaService {
public List<Categoria> findAll();
	
	public Categoria save(Categoria categoria);
	
	public Categoria findById(Long id);
	
	public void delete(Long id);

}
