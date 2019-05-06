package com.smart.home;

import java.util.Scanner;

public class Add_Interface_and_Device {
	
	public void printMessage(boolean val,String deviceType,String name,String location,int id)
	{
		if(val)
			System.out.println(deviceType+" - "+name+" - ID: "+id+" added to "+location);
		else
			System.out.println(deviceType+" "+name+" "+id+" already avalilable, give some different id");
	}
	
	public int returnID(Scanner s,String Info)
	{
		System.out.println(Info);
		return s.nextInt();
	}
	
	public String returnLocation(Scanner s,String Info)
	{
		s.nextLine();
		System.out.println(Info);
		String str =  s.nextLine();
		return str;
	}

	public void addInterfaceDevice(Scanner s,Home hm)
	{
		System.out.println("Enter Interface Device Name");
		String interfaceDevice = s.nextLine();
		
		int interfaceID = returnID(s,"Enter id of interface device");
		
		String location = returnLocation(s,"Enter Location");
		
		boolean val = hm.addIntefaceDevice(interfaceDevice,interfaceID,location);
		
		printMessage(val,"Interface",interfaceDevice,location,interfaceID);
	}
	
	public void addLights(Scanner s,Home hm)
	{
		int ident = returnID(s,"Enter Identification Number of Light");
		
		String location = returnLocation(s,"Enter Device Location");
				
		System.out.println("Enter Brightness");
		int b = s.nextInt();
		
		System.out.println("Enter Light Color");
		LightColor lc = LightColor.valueOf(s.next().toUpperCase());
		
		boolean val = hm.addLights(b,lc,ident,location);
		
		printMessage(val,"Smart Home Device","Light",location,ident);
	}
	
	public void addFans(Scanner s,Home hm)
	{
		int ident = returnID(s,"Enter Identification Number of Fan");
		
		String location = returnLocation(s,"Enter Device Location");
		
		System.out.println("Enter Speed of Fan");
		int b = s.nextInt();

		boolean val = hm.addFans(b,ident,location);
		
		printMessage(val,"Smart Home Device","Fan",location,ident);
	}
	
	public void addGeneralElectricals(Scanner s,Home hm)
	{		
		int ident = returnID(s,"Enter Identification Number of General Electrical");
		
		String location = returnLocation(s,"Enter Device Location");
		
		boolean val = hm.addGeneralElectricals(ident,location);
		
		printMessage(val,"Smart Home Device","General Electrical",location,ident);
	}	
}