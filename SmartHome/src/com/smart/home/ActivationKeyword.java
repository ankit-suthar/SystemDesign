package com.smart.home;

public enum ActivationKeyword {
	ON,OFF;
	
	public String toString(){
    switch(this){
    case ON :
        return "ON";
    case OFF :
        return "OFF";
    }
    return null;
	}
}