package proiect;

public class Prima {
public static void main(String args[]) {		
	Adoua s = new Adoua();
	s.Atreia();
	s.a = count(s.a);
	s.b = count(s.b);
	s.c = count(s.c);
	s.Apatra(s.a, s.b, s.c);
	}
public static int count(int x) {	
	x = x * x * x;
	return x;	
	}
}
