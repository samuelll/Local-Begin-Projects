package fire;
import java.util.Random;

public class actiuni implements Runnable {
		int time;
		String nume;
		Random numar = new Random();
		
	public actiuni(String nume){
		this.nume = nume;
		time = numar.nextInt(2048);
	}	
	public void run(){
		System.out.printf("Firul %s doarme %d\n", nume, time);
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Firul %s s-a trezit\n", nume);
	}
}
