package com.smart.home;

public class Lights extends SmartHomeDevice{
	
	int brightness;
	LightColor lc;
	
	public Lights(int brightness,LightColor lc,int identification,String Location) {
		super(DeviceType.LIGHTS,identification,Location);
		
		this.brightness=brightness;
		this.lc=lc;
	}

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	public LightColor getLc() {
		return lc;
	}

	public void setLc(LightColor lc) {
		this.lc = lc;
	}
	
	public String toString()
	{
		return DeviceType.LIGHTS.toString()+" "+this.lc+" "+this.brightness+" "+this.key;
	}
}