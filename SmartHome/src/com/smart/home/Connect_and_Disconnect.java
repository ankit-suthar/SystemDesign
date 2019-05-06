package com.smart.home;

import java.util.ArrayList;
import java.util.Scanner;

public class Connect_and_Disconnect {

	public void connectDeviceToInterface(Scanner s,Home hm)
	{
		System.out.println("Enter Interface Device ID");
		int ID = s.nextInt();
		
		System.out.println("Enter identification of a home device");
		int ident = s.nextInt();
		
		SmartHomeDevice ss = hm.listOfSHD.get(ident); 
				
		ArrayList<SmartHomeDevice> shd = hm.interfaceToHomeDevice.getOrDefault(ID, new ArrayList<SmartHomeDevice>());
		
		if(shd.contains(ss))
		{
			System.out.println("Device "+ ident +" already assigned to "+ID);
		}
		else
		{
			shd.add(ss);
			hm.interfaceToHomeDevice.put(ID,shd);
		}	
		
		InterfaceDevice tt = hm.listOfID.get(ID); 
		
		ArrayList<InterfaceDevice> intd = hm.homeDeviceToInterface.getOrDefault(ident, new ArrayList<InterfaceDevice>());
		
		if(intd.contains(tt))
		{
			System.out.println("Interface "+ ID +"already has "+ident);
		}
		else
		{
			intd.add(tt);
			hm.homeDeviceToInterface.put(ident,intd);
		}	
	}
	
	
	public void disconnectDeviceToInterface(Scanner s,Home hm)
	{
		System.out.println("Enter Interface Device ID");
		int ID = s.nextInt();
		
		System.out.println("Enter identification of a home device");
		int ident = s.nextInt();
		
		SmartHomeDevice ss = hm.listOfSHD.get(ident); 
		
		ArrayList<SmartHomeDevice> shd = hm.interfaceToHomeDevice.getOrDefault(ID, new ArrayList<SmartHomeDevice>());
		
		if(shd.contains(ss))
		{
			shd.remove((SmartHomeDevice)ss);
			if(shd.size()>0)
				hm.interfaceToHomeDevice.put(ID,shd);
			else
				hm.interfaceToHomeDevice.remove(ID);
		}
		else
		{
			System.out.println("Device "+ ident +"not assigned to "+ID);
		}	
		
		InterfaceDevice tt = hm.listOfID.get(ID); 
		
		ArrayList<InterfaceDevice> intd = hm.homeDeviceToInterface.getOrDefault(ident, new ArrayList<InterfaceDevice>());
		
		if(intd.contains(tt))
		{
			intd.remove((InterfaceDevice)tt);
			if(intd.size()>0)
				hm.homeDeviceToInterface.put(ident,intd);
			else
				hm.homeDeviceToInterface.remove(ident);
		}
		else
		{
			System.out.println("Interface "+ ID +"not has "+ident);
		}
	}
	
}
