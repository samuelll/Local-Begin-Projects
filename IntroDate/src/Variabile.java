
public class Variabile {
	public static void main(String args[]){
		Tastatura z = new Tastatura();
		z.Scan();
		z.a = count(z.a);
		z.b = count(z.b);
		z.c = count(z.c);
		z.d = count(z.d);
		
		z.Scan(z.a, z.b, z.c, z.d);	
	}
	
	
	public static int count(int x){
		x = x * 2;
/*		if (x % 2 == 0){
			System.out.println("Acesta este un numar par");
		} else {
			System.out.println("Acesta este un numar impar");
		}
*/				
		return x;
	}
	

}
