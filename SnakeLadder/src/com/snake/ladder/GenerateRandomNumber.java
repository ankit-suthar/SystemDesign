package com.snake.ladder;

public class GenerateRandomNumber {

	public static int getRandomNumber()
	{
		int val = Integer.MAX_VALUE;
		
		while(val<1 || val>6)
			val = (int) (Math.random()*10);
		return val;
	}
}
