package com.smart.home;

import java.util.Scanner;

public class Operate {
	

	public static void main(String[] args) 
	{
		Add_Interface_and_Device o = new Add_Interface_and_Device();
		Command_System c = new Command_System();
		Connect_and_Disconnect cd = new Connect_and_Disconnect();
		Print_Device p = new Print_Device();
		
		Home hm = Home.getInstance();
		
		while(true)
		{
			System.out.println("1 - Add Interface Device \n 2 - Add Smart Home Device \n 3 - Print Connected Devices\n "
					+ "4 - Give Command \n 5 - Connect Device to Interface \n 6 - Disconnect Device to Interface \n 100 - Exit");
		
			Scanner s = new Scanner(System.in);
		
			int input = s.nextInt();
			s.nextLine();
		
			if(input==1)
			{
				o.addInterfaceDevice(s,hm);
			}
			else if(input==2)
			{
				System.out.println("1 - Add Light \n 2- Add Fan \n 3 - Add General Electricals\n");
			
				int in = s.nextInt();
				s.nextLine();
			
				if(in==1)
					o.addLights(s,hm);
			
				else if(in==2)
					o.addFans(s, hm);
			
				else if(in==3)
					o.addGeneralElectricals(s, hm);
			}
		
			else if(input==3)
			{
				p.printConnectedDevices(hm);
			}
		
				else if(input==4)
				{
					c.giveCommand(s, hm);
				}
				else if(input==5)
				{
					cd.connectDeviceToInterface(s, hm);
				}
				else if(input==6)
				{
					cd.disconnectDeviceToInterface(s, hm);
				}
				else
				{
					break;
				}
		} //while end
		
	}//main end
}