package calendar.app;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class View_Portal {

	public void listOfAttendee(Scanner s)
	{
		System.out.println("Enter Event Id");
		int event_id = s.nextInt();
		
		Access_Calendar ac = Access_Calendar.getInstance();
		
		if(ac.event.containsKey(event_id))
		{
			HashMap<Integer,User> hm = ac.event_UserList.get(event_id);
			
			Set<Map.Entry<Integer, User>> entry = hm.entrySet();
			
			Iterator<Map.Entry<Integer, User>> itr = entry.iterator();
			
			while(itr.hasNext())
			{
				Map.Entry<Integer, User> ent = itr.next();
				
				User u = ent.getValue();
				System.out.println(u.user_name+" "+u.res);
			}			
		}
		else
		{
			System.out.println("this "+event_id+" event doesn't exist");
		}
	}
	
	public void listOfEvent(Scanner s)
	{
		Access_Calendar ac = Access_Calendar.getInstance();
		
		System.out.println("Enter User Id");
		int user_id = s.nextInt();
		
		if(ac.user.containsKey(user_id))
		{
			System.out.println("Enter date range - Start Date  - End Date");
			
			System.out.println("Enter Start Date in 'dd/MM/yyyy' format");
	    String date1 = s.next();
	    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date dt1=null;
			
			try {
				dt1 = df.parse(date1);
			}
			catch (ParseException e1) {
				System.out.println(e1);
				e1.printStackTrace();
			}
			
			System.out.println("Enter End Date in 'dd/MM/yyyy' format");
	    date1 = s.next();
	    df = new SimpleDateFormat("dd/MM/yyyy");
			Date dt2=null;
			
			try {
				dt2 = df.parse(date1);
			}
			catch (ParseException e1) {
				System.out.println(e1);
				e1.printStackTrace();
			}
			
			ArrayList<Integer> al = ac.user_event.getOrDefault(user_id,new ArrayList<Integer>());
			
			for(int i=0;i<al.size();i++)
			{
				int id = al.get(i);
				
				Event e = null;
				
				if(ac.event.containsKey(id))
				{
					e = ac.event.get(id);
				}
				else
				{
					System.out.println("this "+id+" event doesn't exist");
					break;
				}
				
				Date st_dt = e.start;
				//Date ed_dt = e.end;
				
				if (st_dt.compareTo(dt1) > 0 && st_dt.compareTo(dt2) < 0) 
	        System.out.print(e.title+" ");
			}
			System.out.println();
		}
		else
		{
			System.out.println("this user "+user_id+" doesn't exist");
		}
	}
	
	public void viewAllUser()
	{
		Access_Calendar ac = Access_Calendar.getInstance();
		
		System.out.println(ac.user);
	}
	
	public void viewAllEvent()
	{
		Access_Calendar ac = Access_Calendar.getInstance();
		
		System.out.println(ac.event);
	}
}
