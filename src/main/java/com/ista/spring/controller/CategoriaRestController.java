package com.ista.spring.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.ista.spring.models.entity.Categoria;
import com.ista.spring.models.services.ICategoriaService;

@CrossOrigin(origins=("http://localhost:8080"))
@RestController
@RequestMapping("/api")

public class CategoriaRestController {
	@Autowired
	//Listar todos las Categorias
	private ICategoriaService categoriaService;
	@GetMapping("/categoria")
	public List<Categoria> indext(){
		return categoriaService.findAll();
	}
	//Buscar la Categoria por id
	@GetMapping("/categoria/{id}")
	public Categoria show(@PathVariable Long id) {
		return categoriaService.findById(id);
	}
	//Guardar una Categoria
	@PostMapping("/categoria")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria create(@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	}
	//Editar una Categoria
		@PutMapping("/categoria/{id}")
		@ResponseStatus(HttpStatus.CREATED)
		public Categoria update(@RequestBody Categoria categoria, @PathVariable Long id) {
			Categoria clienteActual= categoriaService.findById(id);
			clienteActual.setDescripcion(categoria.getDescripcion());
			return categoriaService.save(clienteActual);
		}
	//Eliminar una Categoria
		@DeleteMapping("/categoria/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			categoriaService.delete(id); 
		}

}
