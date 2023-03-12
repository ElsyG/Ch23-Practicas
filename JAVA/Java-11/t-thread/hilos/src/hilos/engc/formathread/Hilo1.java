package hilos.engc.formathread;

public class Hilo1 extends Thread {

	public Hilo1(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Inicia el Thread o Hilo " + this.getName());
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Termina el Thread o Hilo " + this.getName());
	}

}
