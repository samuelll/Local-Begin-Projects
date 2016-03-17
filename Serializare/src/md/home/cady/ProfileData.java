package md.home.cady;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProfileData implements Serializable {
		private String Login;
		private String password;
	
	
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
