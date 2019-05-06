package com.smart.home;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Print_Device {
	
	public void printConnectedDevices(Home hm)
	{
		Set<Map.Entry<Integer,ArrayList<InterfaceDevice>>> set = hm.homeDeviceToInterface.entrySet();
		
		Iterator<Map.Entry<Integer,ArrayList<InterfaceDevice>>> itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer,ArrayList<InterfaceDevice>> entry = itr.next();
			
			int id = entry.getKey();
			
			ArrayList<InterfaceDevice> al = entry.getValue();
			
			System.out.print(id+" "+hm.listOfSHD.get(id).dt+" "+hm.listOfSHD.get(id).Location+" --> ");
			
				for(int i=0;i<al.size();i++)
				{
					System.out.print(al.get(i).id+" "+al.get(i).name+" "+al.get(i).Location);
				
					if(i!=al.size()-1)
						System.out.print(",");
				}
		 }
	}
}
