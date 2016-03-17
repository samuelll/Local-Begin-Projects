package md.home.cady;

import java.util.ArrayList;
import java.util.Random;

public class Collections_ArrayList {
		private static ArrayList<Adrese> adresa = new ArrayList<Adrese>();
		private static Random x = new Random();
		
	public static void main(String[] args) {
		for(int i=0; i<200; i++){
			adresa.add(new Adrese("Adresa ",x.nextInt(100)));
		}
		for(Adrese a: adresa){
			System.out.println(a.getName()+" "+ a.getNumar());
		}
	}

}
