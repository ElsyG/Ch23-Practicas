package com.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Mi clase Producto se convierte en una entidad JPA (persistencia de datos)
	@Entity
	
	//Especificar de forma correcta el nombre de la tabla
	@Table(name="Producto")

public class Producto {
	
	@Id//el campo id es la primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //el campo id sera generado automaticamente por la DB
	@Column(name="id", unique = true, nullable = false) //especifica el nombre de la columna en la DB
	
	//Atributos
	private Long id;
	private String nombre;
	private String descripcion;
	private String URL_Imagen;
	private double precio;
	
	
	//contructor vacío para el jackson(serializar y desarializar un obj java a json)
	
	public Producto() {
		
	}
	

	//constructor con parámetros
	public Producto(Long id, String nombre, String descripcion, String uRL_Imagen, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.URL_Imagen = URL_Imagen;
		this.precio = precio;
	}// cierre de constructor vacío
	
	public Producto(Long id, String nombre, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	//getters y setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getURL_Imagen() {
		return URL_Imagen;
	}

	public void setURL_Imagen(String uRL_Imagen) {
		URL_Imagen = uRL_Imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//toString (sobreescritura de métodos)
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", URL_Imagen="
				+ URL_Imagen + ", precio=" + precio + "]"; 
	}
	
	
	
	
	
}
