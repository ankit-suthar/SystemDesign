package com.smart.home;

import java.util.ArrayList;
import java.util.Scanner;

public class Command_System {

	public void giveCommand(Scanner s,Home hm)
	{
		System.out.println("Enter Interface ID");
		int ID = s.nextInt();
		
		System.out.println("Enter Device ID");
		int dID = s.nextInt();
		
		SmartHomeDevice shd = hm.listOfSHD.get(dID);
		InterfaceDevice ifd = hm.listOfID.get(ID);
		
		ArrayList<SmartHomeDevice> a1 = hm.interfaceToHomeDevice.get(ID);
		a1.remove((SmartHomeDevice)shd);
		
		ArrayList<InterfaceDevice> a2 = hm.homeDeviceToInterface.get(dID);
		a2.remove((InterfaceDevice)ifd);
		
		if(shd instanceof Lights)
		{
			Lights l = (Lights)shd;
			
			String command = s.next();
			boolean numeric = true;
			Integer intensity=null;
			
			try
			{
				intensity = Integer.parseInt(command);
			}
			catch(NumberFormatException e)
			{
				numeric = false;
			}
			
			if(numeric)
			{
				if(l.key==ActivationKeyword.ON)
				{
					if(intensity>=1 && intensity<=10)
					{
						l.brightness=intensity;
						System.out.println("Brightness Set to "+intensity);
					}
					else
					{
						System.out.println("Brigtness range is not proper");
					}
				}
				else
				{
					System.out.println("Please, swtich on bulb first");
				}
			}
			else
			{
				if(l.key==ActivationKeyword.ON)
				{
					System.out.println("Bulb is already on");
				}
				else
				{
					l.key=ActivationKeyword.ON;
					System.out.println("Bulb turned on");
				}
			}
			
			hm.listOfSHD.put(dID,l);
			hm.listOfID.put(ID,ifd);
			
			a1.add(l);
			hm.interfaceToHomeDevice.put(ID,a1);
			
			a2.add(ifd);
			hm.homeDeviceToInterface.put(dID, a2);
		}
		else if(shd instanceof Fans)
		{
			Fans f = (Fans)shd;
			
			String command = s.next();
			boolean numeric = true;
			Integer speed=null;
			
			try
			{
				speed = Integer.parseInt(command);
			}
			catch(NumberFormatException e)
			{
				numeric = false;
			}
			
			if(numeric)
			{
				if(f.key==ActivationKeyword.ON)
				{
					if(speed>=1 && speed<=5)
					{
						f.speed=speed;
						System.out.println("Speed set to "+speed);
					}
					else
					{
						System.out.println("Speed range is not proper");
					}
				}
				else
				{
					System.out.println("Please, switch on fan first");
				}
			}
			else
			{
				if(f.key==ActivationKeyword.ON)
				{
					System.out.println("Fan is already on");
				}
				else
				{
					f.key=ActivationKeyword.ON;
					System.out.println("Fan turned on");
				}
			}
			
			hm.listOfSHD.put(dID,f);
			hm.listOfID.put(ID,ifd);
			
			a1.add(f);
			hm.interfaceToHomeDevice.put(ID,a1);
			
			a2.add(ifd);
			hm.homeDeviceToInterface.put(dID, a2);
			
		}
		else if(shd instanceof GeneralElectricals)
		{
			GeneralElectricals g = (GeneralElectricals)shd;
			
			if(g.key==ActivationKeyword.ON)
			{
				System.out.println("General Electrical is already on");
			}
			else
			{
				g.key=ActivationKeyword.ON;
				System.out.println("General Eletrical turned on");
			}
			
			hm.listOfSHD.put(dID,g);
			hm.listOfID.put(ID,ifd);
			
			a1.add(g);
			hm.interfaceToHomeDevice.put(ID,a1);
			
			a2.add(ifd);
			hm.homeDeviceToInterface.put(dID, a2);
		}
	}
	
}
