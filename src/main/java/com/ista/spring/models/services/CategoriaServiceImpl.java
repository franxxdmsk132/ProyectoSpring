package com.ista.spring.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ista.spring.models.dao.ICategoriaDao;
import com.ista.spring.models.entity.Categoria;
import org.springframework.transaction.annotation.Transactional;
@Service
public class CategoriaServiceImpl implements ICategoriaService{

	@Autowired
	private ICategoriaDao categoriaDao;
	@Override
	@Transactional (readOnly= true)
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) categoriaDao.findAll();
	}
	@Override
	@Transactional
	public Categoria save( Categoria categoria) {		
		// TODO Auto-generated method stub
		return categoriaDao.save(categoria);
	}
	@Override
	@Transactional (readOnly= true)
	public Categoria findById(Long id) {
		// TODO Auto-generated method stub
		return categoriaDao.findById(id).orElse(null);
	}
	@Override
	
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaDao.deleteById(id);
		
	}

}

