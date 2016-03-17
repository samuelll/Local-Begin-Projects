import java.util.Scanner;

public class Taste {
	int a, b, c, d;
	public void Scan(){
		System.out.println("Introduceti primul numar");
		Scanner k = new Scanner(System.in);
		a = k.nextInt();
		System.out.println("Introduceti al doilea numar");
		b = k.nextInt();
		System.out.println("Introduceti al treilea numar");
		c = k.nextInt();
		System.out.println("Introduceti al patrulea numar");
		d = k.nextInt();
		k.close();
	}
}	
