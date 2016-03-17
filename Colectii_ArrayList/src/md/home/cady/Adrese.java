package md.home.cady;

public class Adrese {
			private int numar;
			private String name;

	public Adrese(String name, int numar) {
			this.numar = numar;
			this.name = name;		
	}
	public int getNumar() {
		return numar;
	}
	public void setNumar(int numar) {
		this.numar = numar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
