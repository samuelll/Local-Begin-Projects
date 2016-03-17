package md.home.cady;

public class Sync {
		private static int a;
	public static void main(String[] args) {
		Thread t1 = new Thread(new Number());
		Thread t2 = new Thread(new Number());
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Operation Interrupted!");
			System.exit(1);
		}
		System.out.println(a);
	}
	public static synchronized void increaseNumber(){
		a++;
	}
}
