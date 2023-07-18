package com.ista.spring.models.services;

import java.util.List;

import com.ista.spring.models.entity.Proveedor;

public interface IProveedorService {
	public List<Proveedor> findAll();
	
	public Proveedor save(Proveedor cliente);
	
	public Proveedor findById(Long id);
	
	public void delete(Long id);
	
}
