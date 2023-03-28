package com.generation.cohorte23.jpa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.cohorte23.jpa.models.UsuarioModel;
import com.generation.cohorte23.jpa.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired

		UsuarioRepository usuarioRepositorio;
	public ArrayList<UsuarioModel> obtenerPorPrioridad (Integer prioridad){
		return usuarioRepositorio.findByPrioridad(prioridad);
	}
	public ArrayList<UsuarioModel> ListarUsuarios() {
		return (ArrayList<UsuarioModel>) usuarioRepositorio.findAll();

	}
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepositorio.save(usuario);
	}
	public Optional<UsuarioModel> obtenerPorId(Long id){
		return usuarioRepositorio.findById(id);
	}
	
	UsuarioRepository usuarioRepository;
	

	public boolean eliminarUsuario(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
}