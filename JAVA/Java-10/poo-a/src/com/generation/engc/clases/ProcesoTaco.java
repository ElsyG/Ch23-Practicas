package com.generation.engc.clases;

public class ProcesoTaco {

	public String prepararTaco(String tipoDeTortilla, String tamanioDeTortilla, String guisado) {
		String prepararTaco = tipoDeTortilla + tamanioDeTortilla + guisado;
		return prepararTaco;
	}
	
	public float venderTaco (float precio, int numeroDeTortilla) {
		float venderTaco = precio * numeroDeTortilla;
		return venderTaco;
}
}

