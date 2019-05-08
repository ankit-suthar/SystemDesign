package com.snake.ladder;

import java.util.HashMap;

public class Play {

	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	
	public Play()
	{
		hm.put(3, 23);
		hm.put(21, 67);
		hm.put(35, 89);
		hm.put(39, 15);
		hm.put(96, 45);
	}
	
	public void rollOut(String info,Player p,int die)
	{
		System.out.print(info);
		die = GenerateRandomNumber.getRandomNumber();
		System.out.println(die);
		
		p.currValue += die;
		System.out.println();
	}
	
	public void getRepeatCall(String info,Player p,int die)
	{
		while(die==6)
		{
			if(p.currValue>=100)
				break;
			
			rollOut(info,p,die);
			
			if(p.currValue>=100)
				break;
		}			
		
		if(hm.containsKey(p.currValue))
			p.currValue = hm.get(p.currValue);
	}
	
	public void startGame(Player p1,Player p2)
	{
		int die=0;
		
		while(true)
		{
			rollOut("Player 1 turn : ",p1,die);
			
			if(p1.currValue>=100)
			{
				System.out.println(p1.name+" won the game");
				break;
			}
			
			getRepeatCall("Player 1 turn : ",p1,die);
			
			rollOut("Player 2 turn : ",p2,die);
			
			if(p2.currValue>=100)
			{
				System.out.println(p2.name+" won the game");
				break;
			}
			
			getRepeatCall("Player 2 turn : ",p2,die);
		}
		
		System.out.println(p1.currValue+" "+p2.currValue);
	}
}