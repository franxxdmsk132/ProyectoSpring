package com.ista.spring.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.spring.models.dao.IProveedorDao;
import com.ista.spring.models.entity.Proveedor;

import org.springframework.transaction.annotation.Transactional;
@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	private IProveedorDao ProveedorDao;
	@Override
	@Transactional (readOnly= true)
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return (List<Proveedor>) ProveedorDao.findAll();
	}
	@Override
	@Transactional
	public Proveedor save(Proveedor cliente) {
		// TODO Auto-generated method stub
		return ProveedorDao.save(cliente);
	}
	@Override
	@Transactional (readOnly= true)
	public Proveedor findById(Long id) {
		// TODO Auto-generated method stub
		return ProveedorDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ProveedorDao.deleteById(id);
		
	}

}
