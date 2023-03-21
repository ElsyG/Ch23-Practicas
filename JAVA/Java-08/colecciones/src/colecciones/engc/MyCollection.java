package colecciones.engc;

import java.util.*;
 // que es una interfaz
public class MyCollection {

	public static void main(String[] args) {
		MyCollection c =new MyCollection();
		//imprimir(c.listaCollections());
		//imprimir(c.setCollections());
		//wrapperClass();//algo que esta envolvieno algo y lo mejora
		mapCollections();
	}
	
	private static void mapCollections() {
		Map miMap = new HashMap(); //es un conjunto que esta formado de 2 conjuntos
		miMap.put("Juan", "valor1");
		miMap.put("María", "valor2");
		miMap.put("Karla", "valor3");
		miMap.put("Tomas", "valor3");
		
		imprimir(miMap.keySet());
		imprimir(miMap.values());
	}
	
	
	Set setCollections() {
		Set miSet = new HashSet();
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.add("cuatro");
		miSet.add("cinco");
			
		//miSet.clear();
		
		Object a [] = miSet.toArray();
		int i = 0;
		System.out.println("Mi arreglo " + a [i]);
		
		System.out.println("Tamaño de la lista " + miSet.size());
		
		return miSet;	
		 
		
	}
	
		
	private List listaCollections() {
		List miLista = new ArrayList();
		System.out.println(miLista + "Tamaño de la lista antes " + miLista.size());
		System.out.println("esta vacía " + miLista.isEmpty());
		miLista.add("1");
		miLista.add(0,2);
		miLista.add(3);
		miLista.add(0, "Pato");
		
		miLista.set(0, miLista);
		miLista.remove(2);
		
		System.out.println(miLista + "Tamaño de la lista después " + miLista.size());
		System.out.println("esta vacía " + miLista.isEmpty());
		
		boolean e = miLista.contains(3);
		System.out.println("--> " + e);
		
		return miLista;
	}
	
	private static void imprimir(Collection collection) {
		for (Object elementos : collection) {
			System.out.println("elementos " + elementos);
	}
	}
	
	static void wrapperClass(){
		//byte, short, char, long, float, int, double
		byte numeroB =-128;
		System.out.println("Tamaño de un byte:  " + Byte.SIZE);
		System.out.println("Valor Max: " + Byte.MAX_VALUE);
		System.out.println("Valor Min: " + Byte.MIN_VALUE);
		System.out.println("--> " + numeroB);
		
		int numeroI = 2147483647;
		System.out.println("Tamaño de un entero bytes : " + Integer.BYTES);
		System.out.println("Valor Max: " + Integer.MAX_VALUE);
		System.out.println("Valor Min: " + Integer.MIN_VALUE);
		System.out.println("--> " + numeroI);
		
		short numeroJ = 32767;
		System.out.println("Tamaño de un short bytes : " + Short.BYTES);
		System.out.println("Valor Max: " + Short.MAX_VALUE);
		System.out.println("Valor Min: " + Short.MIN_VALUE);
		System.out.println("--> " + numeroJ);
		
		
		System.out.println("Tamaño de un long bytes : " + Long.BYTES);
		System.out.println("Valor Max: " + Long.MAX_VALUE);
		System.out.println("Valor Min: " + Long.MIN_VALUE);
		
	}
	
}
