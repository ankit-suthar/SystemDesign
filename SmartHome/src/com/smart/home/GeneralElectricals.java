package com.smart.home;

public class GeneralElectricals extends SmartHomeDevice{
	
	public GeneralElectricals(int identification,String location) {
		super(DeviceType.GENERALELECTRICALS,identification,location);
	}
	
	public String toString()
	{
		return DeviceType.GENERALELECTRICALS.toString()+" "+this.key;
	}
}