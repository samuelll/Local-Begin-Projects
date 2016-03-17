package md.home.cady;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
		static private ServerSocket server;
		static private Socket conexiune;
		static private ObjectOutputStream output;
		static private ObjectInputStream input;
	@Override
	public void run() {
		try {
			server = new ServerSocket(1234, 99);
			conexiune = server.accept();
		while(true){	
			output = new ObjectOutputStream(conexiune.getOutputStream());
			input = new ObjectInputStream(conexiune.getInputStream());
			output.writeObject("Ati introdus: "+(String)input.readObject());
			}
		} catch (IOException e) {			
		} catch (HeadlessException e) {
		} catch (ClassNotFoundException e) {
		}		
	}
}
