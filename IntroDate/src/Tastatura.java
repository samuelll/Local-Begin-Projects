import javax.swing.JOptionPane;

public class Tastatura {
	int a, b, c, d;
	String k, l, m, n;
	
	public void Scan(){
		
		k = JOptionPane.showInputDialog("Introduceti primul numar");
		l = JOptionPane.showInputDialog("Introduceti al doilea numar");
		m = JOptionPane.showInputDialog("Introduceti al treilea numar");
		n = JOptionPane.showInputDialog("Introduceti al patrulea numar");
		a = Integer.parseInt(k);
		b = Integer.parseInt(l);
		c = Integer.parseInt(m);
		d = Integer.parseInt(n);
		
	}
	
public void Scan(int a, int b, int c, int d){
		
		JOptionPane.showMessageDialog(null, a);
		JOptionPane.showMessageDialog(null, b);
		JOptionPane.showMessageDialog(null, c);
		JOptionPane.showMessageDialog(null, d);
		
	}
}	
