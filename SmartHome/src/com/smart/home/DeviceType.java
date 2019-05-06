package com.smart.home;

public enum DeviceType {
	GENERALELECTRICALS , LIGHTS , FANS;
	
	public String toString(){
    switch(this){
    case GENERALELECTRICALS :
        return "GENERALELECTRICALS";
    case LIGHTS :
        return "LIGHTS";
    case FANS :
        return "FANS";
    }
    return null;
	}
}
