package proiect;
import javax.swing.JOptionPane;

public class Adoua {
	int a, b, c;
	String s1, s2, s3;	
public void Atreia() {	
	s1 = JOptionPane.showInputDialog("Primul numar:");
	s2 = JOptionPane.showInputDialog("Al doilea numar:");
	s3 = JOptionPane.showInputDialog("Al treilea numar:");	
	a = Integer.parseInt(s1);
	b = Integer.parseInt(s2);
	c = Integer.parseInt(s3);
	}
public void Apatra (int a, int b, int c) {	
	JOptionPane.showMessageDialog(null, "Primul numar cubic= " +a);
	JOptionPane.showMessageDialog(null, "Al doilea numar cubic= " +b);
	JOptionPane.showMessageDialog(null, "Al treilea numar cubic= " +c);
	}
}
