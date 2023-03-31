package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;//cablea
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT })

@RestController//le vamos a decir que es un controller para soportar http

@RequestMapping(path = "miOtzo/productos/" )   //indica la ruta o URL de nuestro endpoint //es una anotacion para mapear la ruta a donde van a ir a parar los http


public class ProductoController {
	
	//Declara la instancia de la clase ProductoService que se utiliza para acceder a los métodos definidos ahí. Se declara como final porque su valor no será cambiado después de inicializar para que esta instancia no cambié durante la ejecución del programa.
	
	//Instancia de la clase "ProductoService"
	private final ProductoService productoServicio;// esta es mi instancia, no nos llames nosotros te llamamos
	
	@Autowired	//Constructor con ese objeto como parametro
	public ProductoController (ProductoService productoServicio) {
		this.productoServicio = productoServicio;
	} 
	
	
	
	//HTTP GET
	@GetMapping
	public List<Producto> getProductos() {
		return productoServicio.leerProducto();// un objeto tiene un método y lo instancio para que despues lo llamé
	}
	
//	//HTTP POST
	@PostMapping
    public void postProducto(@RequestBody Producto prod) {
        productoServicio.crearProducto(prod);
    }
//	
//	//HTTP PUT
//	@PutMapping
//	public void putProduct() {
//		
//	}
//	
//	//HTTP DELETE
//	@DeleteMapping
//	public void deleteProducto() {
//		
//	}

}
