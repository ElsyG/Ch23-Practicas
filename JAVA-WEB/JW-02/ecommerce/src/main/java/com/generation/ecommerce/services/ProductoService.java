package com.generation.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;

@Service

public class ProductoService {
	//creo el objeto del ProductoRepository -- Instancio
	private final ProductoRepository productoRepository;
	
	//cableo con Autowired --Cableo
	@Autowired
	
	//Utilizo ese objeto como parametro de mi construsctor --Inyecto
	public ProductoService (ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}	
	
	
//Create (Metodo para agregar un objeto del tipo Producto y guardarlo en la base de datos. Si el producto existe, no deberia actualizar la Base de datos porque seria un objeto duplicado.
    
    public void crearProducto(Producto prod) { //objeto del tipo producto
        Optional<Producto> productoBuscado = 
                productoRepository.findByNombre(prod.getNombre());
        if (productoBuscado.isPresent()) {
            throw new IllegalStateException("El producto con el nombre "
                    + "[" + prod.getNombre() + "] ya existe.");
        } else {
            productoRepository.save(prod);
        }//else //if 
    }//addProducto	
	
	
	//Read (leer una lista de producto)
	public List<Producto> leerProducto() {
		return productoRepository.findAll();
	}
		
	public Producto leerProducto(Long prodId) {
		return productoRepository.findById(prodId).orElseThrow(()-> new IllegalStateException("El Producto " + "con el id " + prodId + " no existe.") );
	    }//getProducto


	
	
	
	//Update
	public void actualizarProducto(String nombre, String descripcion, String URL_Imagen, double precio){
		//si el producto existe
		if(productoRepository.existsById(proId)) {//entonces lo modifico
			Producto productoABuscar = productoRepository.getById(proId);
			if (nombre !=null)productoABuscar.setNombre(nombre);
			if (nombre !=null)productoABuscar.setDescripcion(descripcion);
		}
	}
	
	//Delete
	//	public void eliminarProducto(){
	
//

}
