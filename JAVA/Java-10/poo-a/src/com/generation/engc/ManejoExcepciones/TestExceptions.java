package com.generation.engc.ManejoExcepciones;

public class TestExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Division d = new Division(4,0);
			d visualizadorD();
				
		}catch(OpExceptions e) {
			System.out.printlne.getMessage();
		}
	}

}
