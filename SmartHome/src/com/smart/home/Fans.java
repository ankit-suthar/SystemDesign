package com.smart.home;

public class Fans extends SmartHomeDevice{
	
	int speed;
	
	public Fans(int speed,int identification,String location) {
		super(DeviceType.FANS,identification,location);
		
		this.speed=speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String toString()
	{
		return DeviceType.FANS.toString()+" "+this.speed+" "+this.key;
	}
}