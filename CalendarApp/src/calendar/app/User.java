package calendar.app;

//import java.util.*;

public class User {
	
	int user_id;
	String user_name;
	Response res;
	
	public User(int user_id, String user_name) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.res = Response.NEUTRAL;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String toString()
	{
		return this.user_name+" "+this.user_id;
	}
}