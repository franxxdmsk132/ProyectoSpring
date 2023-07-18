package com.ista.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ista.spring.controller.ProveedorRestController;
import com.ista.spring.models.entity.Proveedor;
import com.ista.spring.models.services.ProveedorServiceImpl;

@SpringBootApplication
public class ProyectoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringApplication.class, args);
		System.out.println("------------------------------------------------------------0w0---------------------------------------------------------------------");
		
	}
}
