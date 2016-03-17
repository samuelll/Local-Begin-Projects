import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Citire {
	static String[][] masiv = new String[6][5];
	static Scanner scane;	
	public static void main(String args[]){				
		openFile();
		readFile();
		showFile();		
	}		
	private static void openFile(){
		try{
			scane = new Scanner(new File("res//fisier.txt"));
		}
		catch(Exception Ex){
			JOptionPane.showMessageDialog(null, "A aparut o eroare!");
		}
	}	
	private static void readFile(){
		while(scane.hasNext()){
			for(int row=0; row<masiv.length; row++){
				for(int col=0; col<masiv[row].length; col++){
					masiv[row][col] = scane.next();					
				}
			}
		}
	}	
	private static void showFile(){
		for(int row=0; row<masiv.length; row++){
			for(int col=0; col<masiv[row].length; col++){
				System.out.print(masiv[row][col]+ "   ");
			}
				System.out.println();
		}		
	}	
}
