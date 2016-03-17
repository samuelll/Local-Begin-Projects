package md.home.cady;

public class Number implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10000; i++){
			Sync.increaseNumber();
		}
	}
}
