package model1;

public class LoginCredential {
	String username;
	String password;
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) {
		// TODO Auto-generated method stub
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) {
		// TODO Auto-generated method stub

		this.password = password;
		
	}

	public boolean checkLogin() {
		// TODO Auto-generated method stub
		if(username.equals("madhu") && password.equals("madhu127"))
			return true;
		else
			return false;
	}

}
