package com.smart.home;

public class SmartHomeDevice {

	DeviceType dt;
	String Location="";
	ActivationKeyword key;
	InterfaceDevice id;
	int identification;
	
	public SmartHomeDevice(DeviceType dt,int identification,String Location)
	{
		this.dt=dt;
		this.key = ActivationKeyword.OFF;
		this.identification=identification;
		this.Location=Location;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public ActivationKeyword getKey() {
		return key;
	}

	public void setKey(ActivationKeyword key) {
		this.key = key;
	}

	public InterfaceDevice getId() {
		return id;
	}

	public void setId(InterfaceDevice id) {
		this.id = id;
	}
	
	public DeviceType getDt() {
		return dt;
	}

	public int getIdentification() {
		return identification;
	}

	public boolean equals(Object obj)
	{
		return (this.identification==((SmartHomeDevice)obj).identification);
	}
	/*
	public String toString()
	{
		
		if(this instanceof Lights)
		{
			Lights l = (Lights) this;
			return l.brightness+" "+l.lc+" "+DeviceType.LIGHTS.toString();//+" "+l.id.name;
		}
		else if(this instanceof Fans)
		{
			Fans f = (Fans) this;
			return f.speed+" "+DeviceType.FANS.toString();
		}
		else if(this instanceof GeneralElectricals)
		{
			//GeneralElectricals g = (GeneralElectricals) this;
			return DeviceType.GENERALELECTRICALS.toString();
		}
		else
			return "";
	}
	*/
}