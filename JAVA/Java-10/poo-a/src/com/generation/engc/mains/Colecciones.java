package com.generation.engc.mains;

import java.util.*;

public class Colecciones {

	public static void main(String[] args) {
		ArrayList <String>collection = new ArrayList<String>(); //list, no se puede instanciar una interfaz.
		collection.add("colecciones");
		collection.add("cohorte");
		/*collection.add(15.15);
		collection.add('a');*/
		
		for (int i = 0; i < collection.size(); i++) {
		System.out.println(collection.get(i));		
	}
}
}
