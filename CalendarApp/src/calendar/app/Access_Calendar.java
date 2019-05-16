package calendar.app;

import java.util.*;

public class Access_Calendar {

	private static Access_Calendar acc_cal;
	
	Map<Integer,User> user = new HashMap<Integer,User>();
	
	Map<Integer,Event> event = new HashMap<Integer,Event>();
	
	Map<Integer,HashMap<Integer,User>> event_UserList = new HashMap<Integer,HashMap<Integer,User>>();
	
	Map<Integer,ArrayList<Integer>> user_event = new HashMap<Integer,ArrayList<Integer>>();
	
	private Access_Calendar()
	{
		
	}
	
	public static Access_Calendar getInstance()
	{
		if(acc_cal==null)
			acc_cal = new Access_Calendar();
		
		return acc_cal;
	}
}