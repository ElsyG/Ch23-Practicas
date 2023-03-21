package hilos.engc.pruebas;

import hilos.engc.formathread.Hilo1;

public class TestThread {

	public static void main(String[] args) { //primer proceso main
		Thread h = new Hilo1("Elsy"); //segundo proceso el objeto h
		h.start();
		Thread h0 = new Hilo1("Pamela"); //segundo proceso el objeto h
		h0.start();
		Thread h1 = new Hilo1("Valen"); //segundo proceso el objeto h
		h1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(h.getState());
	}
	
}
