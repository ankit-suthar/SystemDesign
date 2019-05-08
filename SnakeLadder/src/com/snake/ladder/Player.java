package com.snake.ladder;

public class Player {

	String name;
	int currValue;
	
	public Player(String name)
	{
		this.name=name;
		this.currValue=1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
