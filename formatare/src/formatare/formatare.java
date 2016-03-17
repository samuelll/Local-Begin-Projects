package formatare;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class formatare {
	
		static Formatter formator;
		static Scanner scane;
		
	public static void main(String args[]){
		try{
			formator = new Formatter("res//fisier.txt");
			scane = new Scanner(System.in);
			System.out.println("Anul nasterii:");
			int a = (int)Double.parseDouble(scane.next());
			System.out.println("Numele dumneavoastra:");
			String b = scane.next();
			
			formator.format("Numele: %s \nanul nasterii: %d \n\n", b, a);
			formator.close();
		}
		catch(Exception Ex){
			JOptionPane.showMessageDialog(null, "A aparut o eroare");
		}
	}
}
