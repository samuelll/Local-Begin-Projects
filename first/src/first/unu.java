package first;

public class unu {
	public static void main(String args[]) {
		doi y = new doi();
		y.trei();
		y.a = count(y.a);
		y.b = count(y.b);
/*		y.c = count(y.c);
		y.d = count(y.d);
		y.e = count(y.e);
		y.f = count(y.f);
		y.g = count(y.g);
		y.h = count(y.h);
		y.i = count(y.i);
		y.j = count(y.j);
*/
	}
	public static int count(int x) {
		if (x < 0) {
			System.out.println(x);
		}
		return x;
	}

}
