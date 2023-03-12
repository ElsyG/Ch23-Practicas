package hilos.engc.pruebas;

import hilos.engc.formarunnable.Hilo2;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo2 ht = new Hilo2("Jorge");
		Thread th = new Thread(ht);
		th.start();
		
		new Thread(new Hilo2("Carlos")).start();
		new Thread(new Hilo2("Valen")).start();
	}

}
