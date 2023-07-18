package com.ista.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.spring.models.entity.Productos;
import com.ista.spring.models.services.IProductoService;

@CrossOrigin(origins=("http://localhost:8080"))
@RestController
@RequestMapping("/api")

public class ProductosRestController {
	@Autowired
	//Listar todos los clientes
	private IProductoService productoService;
	@GetMapping("/productos")
	public List<Productos> indext(){
		return productoService.findAll();
		
	}
	//Buscar el cliente por id
	@GetMapping("/productos/{id}")
	public Productos show(@PathVariable Long id) {
		
		return productoService.findById(id);
	
	}
	//Guardar un proveedor
	@PostMapping("/productos")
	@ResponseStatus(HttpStatus.CREATED)
	public Productos create(@RequestBody Productos productos) {
		return productoService.save(productos);
	}
	
	//Editar un proveedor
		@PutMapping("/productos/{id}")
		@ResponseStatus(HttpStatus.CREATED)
		public Productos update(@RequestBody Productos productos, @PathVariable Long id) {
			Productos clienteActual= productoService.findById(id);
			clienteActual.setDescripcion(productos.getDescripcion());
		
			return productoService.save(clienteActual);
			
		}
	//Eliminar un proveedor
		@DeleteMapping("/productos/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			productoService.delete(id); 
		}

}

