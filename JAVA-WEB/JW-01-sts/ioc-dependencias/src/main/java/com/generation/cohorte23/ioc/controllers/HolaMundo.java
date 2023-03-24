package com.generation.cohorte23.ioc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //anotacion que indica que esta clase es un controlador //RestController una clase cerebro
@RequestMapping("/")//aqui se guarda lo que retorna, hace que mapee las clases-metodos y lo pueda enviar en una base de datos
public class HolaMundo {
 public String hola() {
	return "Hola mundo desde SpringBoot";
 }
}
