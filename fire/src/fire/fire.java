package fire;

public class fire {
	public static void main(String args[]){
		Thread fir1 = new Thread(new actiuni("1"));
		Thread fir2 = new Thread(new actiuni("2"));
		Thread fir3 = new Thread(new actiuni("3"));
		Thread fir4 = new Thread(new actiuni("4"));
		fir1.start();
		fir2.start();
		fir3.start();
		fir4.start();
	}
}
