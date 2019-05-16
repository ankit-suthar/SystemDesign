package calendar.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {
	
	Date start;
	Date end;
	String location;
	int Owner_Id;
	List<User> li;
	String title;
	int event_id;
	
	public Event(Date start, Date end, String location, int owner_Id, String title,int event_id) {
		this.start = start;
		this.end = end;
		this.location = location;
		Owner_Id = owner_Id;
		this.li = new ArrayList<User>();
		this.title = title;
		this.event_id = event_id;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<User> getLi() {
		return li;
	}

	public void setLi(List<User> li) {
		this.li = li;
	}
	
	public String toString()
	{
		return this.Owner_Id+" "+this.location+" "+this.title+" "+this.start+" "+this.end;
	}
}