package calendar.app;

public enum Response {
ACCEPT,DECLINE,NEUTRAL;

	public String toString()
	{
		switch(this)
		{
			case ACCEPT:
				return "ACCEPT";
			case DECLINE:
				return "DECLINE";
			case NEUTRAL:
				return "NEUTRAL";
			default:
				return "";
		}
	}
}