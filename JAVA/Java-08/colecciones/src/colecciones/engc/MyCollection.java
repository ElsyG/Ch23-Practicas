package colecciones.engc;

public class MyCollection {

	public static void main(String[] args) {
	
		wrapperClass();//algo que esta envolvieno algo y lo mejora

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
