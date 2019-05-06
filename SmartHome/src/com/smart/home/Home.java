package com.smart.home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Home {
	
	private static Home home;
	
	Map<Integer,InterfaceDevice> listOfID = new HashMap<Integer,InterfaceDevice>();
	
	Map<Integer,SmartHomeDevice> listOfSHD = new HashMap<Integer,SmartHomeDevice>();
	
	Map<Integer,ArrayList<SmartHomeDevice>> interfaceToHomeDevice = new HashMap<Integer,ArrayList<SmartHomeDevice>>();
	
	Map<Integer,ArrayList<InterfaceDevice>> homeDeviceToInterface = new HashMap<Integer,ArrayList<InterfaceDevice>>();
	
	
	private Home()
	{
		
	}
	
	public static Home getInstance()
	{
		if(home==null)
		{
			home = new Home();
		}
		return home; 
	}
	
	public boolean addIntefaceDevice(String name,int ID,String location)
	{				
		InterfaceDevice id = new InterfaceDevice(name,ID,location);
		
		if(!this.listOfID.containsKey(ID))
		{
			this.listOfID.put(ID, id);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//lights
	public boolean addLights(int brightness,LightColor lc,int identification,String location)
	{
		Lights lghts = new Lights(brightness,lc,identification,location);
		
		if(!this.listOfSHD.containsKey(identification))
		{
			this.listOfSHD.put(identification, lghts);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//fans
	public boolean addFans(int speed,int identification,String location)
	{
		Fans fns = new Fans(speed,identification,location);
		
		if(!this.listOfSHD.containsKey(identification))
		{
			this.listOfSHD.put(identification, fns);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//General Electricals
	public boolean addGeneralElectricals(int identification,String location)
	{
		GeneralElectricals ge = new GeneralElectricals(identification,location);
		
		if(!this.listOfSHD.containsKey(identification))
		{
			this.listOfSHD.put(identification, ge);
			return true;
		}
		else
		{
			return false;
		}
	}
}