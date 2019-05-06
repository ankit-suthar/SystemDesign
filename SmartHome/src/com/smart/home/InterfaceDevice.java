package com.smart.home;

public class InterfaceDevice {

		String name;
		int id;
		String Location="";
		ActivationKeyword key; 
		
		public InterfaceDevice(String name,int id,String Location)
		{
			this.id=id;
			this.name=name;
			this.key = ActivationKeyword.ON;
			this.Location=Location;
		}

		public String getName() {
			return name;
		}
		
		public int getId() {
			return id;
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
		
		public String toString()
		{
			return this.name+" "+this.Location+" "+this.key.toString();
		}
		
		public boolean equals(Object obj)
		{
			return (this.id==((InterfaceDevice)obj).id);
		}
}