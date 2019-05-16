package calendar.app;

import java.text.*;
import java.util.*;

public class Create_Portal {

	//create event
	public void createEvent(Scanner s)
	{
		Access_Calendar ac = Access_Calendar.getInstance();
		
		System.out.println("Enter Event Id");
		int E_id=s.nextInt();
		
		System.out.println("Enter Owner Id");
		int O_id=s.nextInt();
		
		if(!ac.user.containsKey(O_id))
		{
			System.out.println("User "+O_id+" doesn't exist, please create user");
			return;
		}
		
		System.out.println("Enter Location");
		String location=s.next();
		
		System.out.println("Enter Title");
		String title=s.next();
		
		System.out.println("Enter Start Date in 'dd/MM/yyyy' format");
		String date1 = s.next();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Date s_dt=null;
		
    try {
			s_dt = df.parse(date1);
		}
		catch (ParseException e1) {
			System.out.println(e1);
			e1.printStackTrace();
		}
    
    System.out.println("Enter End Date in 'dd/MM/yyyy' format");
    date1 = s.next();
		df = new SimpleDateFormat("dd/MM/yyyy");
		Date e_dt=null;
		
		try {
			e_dt = df.parse(date1);
		}
		catch (ParseException e1) {
			System.out.println(e1);
			e1.printStackTrace();
		}
    
    Event e = new Event(s_dt, e_dt, location,O_id, title,E_id);
    ac.event_UserList.put(e.event_id, new HashMap<Integer,User>());
    ac.event.put(e.event_id, e);
	}
	
	public void createUser(Scanner s)
	{		
		Access_Calendar ac = Access_Calendar.getInstance();
		
		System.out.println("Enter User Id");
		int U_id=s.nextInt();
		s.nextLine();
		System.out.println("Enter User Name");
		String U_name=s.next();
		User u = new User(U_id,U_name);
		
		ac.user.put(U_id,u);
		//s.close();
	}
	
	public void addUserToEvent(int event_id,User u)
	{
		Access_Calendar ac = Access_Calendar.getInstance();
		
		HashMap<Integer,User> hm = ac.event_UserList.getOrDefault(event_id, new HashMap<Integer,User>());
		hm.put(u.user_id, u);
		ac.event_UserList.put(event_id, hm);
	}	
}