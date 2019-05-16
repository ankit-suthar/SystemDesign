package calendar.app;

import java.util.*;

public class Update_Portal {

	//update event
	public void updateEvent(Scanner s)
	{
		Access_Calendar ac = Access_Calendar.getInstance();
		
		System.out.println("Enter id of an event to update");
		int id = s.nextInt();
		
		if(ac.event.containsKey(id))
		{
			System.out.println("Enter new location of event - "+ac.event.get(id).title);
			s.nextLine();
			String location = s.nextLine();
			Event e = ac.event.get(id);
			e.location = location;
			ac.event.remove(id);
			ac.event.put(id, e);
			/*
			HashMap<Integer,User> hm = ac.event_UserList.get(id);
			ac.event_UserList.put(id, hm);
			*/
		}
		else
		{
			System.out.println("this "+id+" event doesn't exist");
		}
	}
	
	//cancle event
	public void cancelEvent(Scanner s)
	{
		Access_Calendar ac = Access_Calendar.getInstance();
		
		System.out.println("Enter id of event to cancel - ");
		int id = s.nextInt();
		
		if(ac.event.containsKey(id))
		{
			ac.event.remove(id);
			ac.event_UserList.remove(id);
			
			 Set<Map.Entry<Integer,ArrayList<Integer>>> set = ac.user_event.entrySet();
			 
			 Iterator<Map.Entry<Integer,ArrayList<Integer>>> itr = set.iterator();
			 
			 while(itr.hasNext())
			 {
				 Map.Entry<Integer,ArrayList<Integer>> ent  = itr.next();
				 ArrayList<Integer> al = ent.getValue();
				 
				 if(al.contains((Integer)id))
				 {
					 al.remove((Integer)id);
				 }
			 }
		}
		else
		{
			System.out.println("this "+id+" event doesn't exist");
		}
		//s.close();
	}
}
