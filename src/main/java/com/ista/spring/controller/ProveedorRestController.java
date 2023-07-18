package com.ista.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ista.spring.models.entity.Proveedor;
import com.ista.spring.models.services.IProveedorService;

@CrossOrigin(origins=("http://localhost:4200"))
@RestController
@RequestMapping("/api")
public class ProveedorRestController {
	@Autowired
	private IProveedorService proveedorService;
	@GetMapping("/proveedor")
	public List<Proveedor> indext(){
		return proveedorService.findAll();
		
	}
	//Buscar el cliente por id
	@GetMapping("/proveedor/{id}")
	public Proveedor show(@PathVariable Long id) {
		
		return proveedorService.findById(id);
	
	}
	//Guardar un proveedor
	@PostMapping("/proveedor")
	@ResponseStatus(HttpStatus.CREATED)
	public Proveedor create(@RequestBody Proveedor provedor) {
		return proveedorService.save(provedor);
	}
	
	//Editar un proveedor
		@PutMapping("/proveedor/{id}")
		@ResponseStatus(HttpStatus.CREATED)
		public Proveedor update(@RequestBody Proveedor provedor, @PathVariable Long id) {
			Proveedor clienteActual= proveedorService.findById(id);
			clienteActual.setDireccion(provedor.getDireccion());
			clienteActual.setNombre(provedor.getNombre());
			clienteActual.setTelefono(provedor.getTelefono());
			return proveedorService.save(clienteActual);
			
		}
	//Eliminar un proveedor
		@DeleteMapping("/proveedor/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			proveedorService.delete(id); 
		}

}
