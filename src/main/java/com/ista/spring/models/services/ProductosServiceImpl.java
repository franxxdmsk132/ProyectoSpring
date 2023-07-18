package com.ista.spring.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.spring.models.dao.IProductosDao;
import com.ista.spring.models.entity.Productos;
@Service
public class ProductosServiceImpl implements IProductoService{

	
	@Autowired
	private IProductosDao productosDao;
	@Override
	@Transactional (readOnly= true)
	public List<Productos> findAll() {
		// TODO Auto-generated method stub
		return (List<Productos>) productosDao.findAll();
	}
	@Override
	@Transactional
	public Productos save(Productos productos) {
		// TODO Auto-generated method stub
		return productosDao.save(productos);
	}
	@Override
	@Transactional (readOnly= true)
	public Productos findById(Long id) {
		// TODO Auto-generated method stub
		return productosDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productosDao.deleteById(id);
		
	}
	
}
