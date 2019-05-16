package calendar.app;

import java.util.*;

public class Invite {

	public void sendInviteToUser(Scanner s)
	{
		Access_Calendar ac = Access_Calendar.getInstance();
		
		System.out.println("Enter event id");
		int e_id = s.nextInt();
		System.out.println("Enter user id");
		int u_id = s.nextInt();
		
		HashMap<Integer,User> hm = ac.event_UserList.getOrDefault(e_id, new HashMap<Integer,User>());
		
		hm.put(u_id,ac.user.get(u_id));
		
		ac.event_UserList.put(e_id, hm);
		
		ArrayList<Integer> al = ac.user_event.getOrDefault(u_id, new ArrayList<Integer>());
		al.add(e_id);
		ac.user_event.put(u_id, al);
	}
	
	public void giveResponse(Scanner s)
	{
		Access_Calendar ac = Access_Calendar.getInstance();
		
		System.out.println("Enter event id");
		int e_id = s.nextInt();
		System.out.println("Enter user id");
		int u_id = s.nextInt();
		
		HashMap<Integer,User> hm = ac.event_UserList.getOrDefault(e_id, new HashMap<Integer,User>());
		
		User u = hm.get(u_id);
		System.out.println("Enter response for this event");
		String str = s.next().toString().toUpperCase();
		u.res = Response.valueOf(str);
		//u.res = res;
		
		hm.put(u_id, u);
		ac.event_UserList.put(e_id, hm);
	}
}
