package calendar.app;

import java.util.*;

public class calendar {

	public static void main(String[] args) {
		Create_Portal cp = new Create_Portal();
		View_Portal vp = new View_Portal();
		Update_Portal up = new Update_Portal();
		Invite invt = new Invite();
		
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1 - create event");
			System.out.println("2 - update event");
			System.out.println("3 - cancel event");
			System.out.println("4 - create user");
			System.out.println("5 - List of attendee of a particular event");
			System.out.println("6 - List of event of a user for given date");
			System.out.println("7 - View all user");
			System.out.println("8 - View all event");
			System.out.println("9 - Add user to an event");
			System.out.println("10 - Give response from a user");
			
			int n = s.nextInt();
			s.nextLine();
			if(n==1)
				cp.createEvent(s);
			else if(n==2)
				up.updateEvent(s);
			else if(n==3)
				up.cancelEvent(s);
			else if(n==4)
				cp.createUser(s);
			else if(n==5)
				vp.listOfAttendee(s);
			else if(n==6)
				vp.listOfEvent(s);
			else if(n==7)
				vp.viewAllUser();
			else if(n==8)
				vp.viewAllEvent();
			else if(n==9)
				invt.sendInviteToUser(s);
			else if(n==10)
				invt.giveResponse(s);
			else
				break;
		}
		s.close();
	}
}