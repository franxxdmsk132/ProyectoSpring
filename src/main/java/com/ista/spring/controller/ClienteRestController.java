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

import com.ista.spring.models.entity.Cliente;
import com.ista.spring.models.services.IClienteService;

@CrossOrigin(origins=("http://localhost:4200"))
@RestController
@RequestMapping("/api")

public class ClienteRestController {
	@Autowired
	//Listar todos las Categorias
	private IClienteService clienteService;
	@GetMapping("/cliente")
	public List<Cliente> indext(){
		return clienteService.findAll();
	}
	//Buscar la Categoria por id
	@GetMapping("/cliente/{id}")
	public Cliente show(@PathVariable Long id) {
		return clienteService.findById(id);
	}
	//Guardar una Categoria
	@PostMapping("/cliente")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	//Editar una Categoria
		@PutMapping("/cliente/{id}")
		@ResponseStatus(HttpStatus.CREATED)
		public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
			Cliente clienteActual= clienteService.findById(id);
			clienteActual.setNombre(cliente.getNombre());
			clienteActual.setApellido(cliente.getApellido());
			clienteActual.setEmail(cliente.getEmail());

			return clienteService.save(clienteActual);
		}
	//Eliminar una Categoria
		@DeleteMapping("/cliente/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			clienteService.delete(id); 
		}

}
