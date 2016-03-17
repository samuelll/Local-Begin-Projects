package md.home.cady;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Conexiune extends JFrame implements Runnable {
			static private Socket conexiune;
			static private ObjectOutputStream output;
			static private ObjectInputStream input;

	public static void main(String[] args) {
			new Thread(new Conexiune("Testare Conexiune")).start();
			new Thread(new Server()).start();
	}
	public Conexiune(String name){
			super(name);
			setLayout(new FlowLayout());
			setSize(300, 300);
			setVisible(true);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JTextField text = new JTextField(40);
			JButton buton = new JButton("Trimite");				
			add(text);
			add(buton);
			
			buton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent actiune){
					if(actiune.getSource()==buton){
						transmiteData(text.getText());
					}
				}
			});		
	}
	@Override
	public void run() {
			try {
			while(true){	
				conexiune = new Socket(InetAddress.getByName("127.0.0.1"), 1234);				
				output = new ObjectOutputStream(conexiune.getOutputStream());
				input = new ObjectInputStream(conexiune.getInputStream());
				JOptionPane.showMessageDialog(null, (String)input.readObject());
				}
			} catch (IOException e) {			
			} catch (HeadlessException e) {
			} catch (ClassNotFoundException e) {
			}		
	}
	public static void transmiteData(Object obiecte){
			try {
				output.flush();
				output.writeObject(obiecte);
			} catch (IOException e) {
			}	
	}
}
