package md.home.cady;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Accounts {
			private static ArrayList<ProfileData> profil = new ArrayList<ProfileData>();	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
			profil = (ArrayList<ProfileData>) Deserializare("fisier");
			System.out.println(profil.size());
			ProfileData profile = new ProfileData();
			profile.setLogin(JOptionPane.showInputDialog(null, "Login / e-mail:"));
			profile.setPassword(JOptionPane.showInputDialog(null, "Password:"));
			profil.add(profile);
		for(ProfileData d: profil){
			System.out.println(d.getLogin()+"  "+d.getPassword());
		}
			System.out.println(profil.size());
			Serializare("fisier", profil);
	}	
	private static Object Deserializare(String fisier) {
			Object returneazaObiect = null;
		try {
			FileInputStream fileIntrare = new FileInputStream(fisier+".ser");
			ObjectInputStream citesteFile = new ObjectInputStream(fileIntrare);
			returneazaObiect = citesteFile.readObject();			
			fileIntrare.close();
			citesteFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Input/output error!");
			System.exit(2);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not Found!");
			System.exit(3);
		}
			return returneazaObiect;		
	}
	private static void Serializare(String fisier, Object obiectScriere) {
		try {
			FileOutputStream fileIesire = new FileOutputStream(fisier+".ser");
			ObjectOutputStream scrieFile = new ObjectOutputStream(fileIesire);
			scrieFile.writeObject(obiectScriere);			
			fileIesire.close();
			scrieFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Input/output error!");
			System.exit(2);
		}		
	}
}