package com.snake.ladder;

import java.util.Scanner;

public class Game {
	
	private void startGame()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first player name");
		String name1 = s.nextLine();
		
		Player p1 = new Player(name1);
		
		System.out.println("Enter second player name");
		String name2 = s.nextLine();
		
		Player p2 = new Player(name2);
		
		Play p = new Play();
		p.startGame(p1, p2);
		s.close();
	}

	public static void main(String[] args) {
		Game g = new Game();
		
		g.startGame();
	}
}