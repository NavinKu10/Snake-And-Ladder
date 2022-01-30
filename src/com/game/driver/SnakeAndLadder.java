package com.game.driver;

import java.util.*;
import com.game.entity.*;
import com.game.service.*;

public class SnakeAndLadder {
	public static void main(String[] args) {
		int numOfSnake, numOfLadder, numOfPlayer, counter = 0;
		List<Snake> snakePositions = new ArrayList<>();
		List<Ladder> ladderPositions = new ArrayList<>();
		List<Player> players = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		numOfSnake = scan.nextInt();
		scan.nextLine();
		
		counter = numOfSnake;
		while(counter-->0) {
			int initialPos = scan.nextInt();
			int finalPos = scan.nextInt();
			snakePositions.add(new Snake(initialPos, finalPos));
			scan.nextLine();
		}
		
		numOfLadder = scan.nextInt();
		scan.nextLine();
		
		counter = numOfLadder;
		while(counter-->0) {
			int initialPos = scan.nextInt();
			int finalPos = scan.nextInt();
			ladderPositions.add(new Ladder(initialPos, finalPos));
			scan.nextLine();
		}
		
		numOfPlayer = scan.nextInt();
		scan.nextLine();
		
		counter = numOfPlayer;
		while(counter-->0) {
			String name = scan.next();
			players.add(new Player(name));
		}
		
		scan.close();
		
		Board board = new Board(10, 10, numOfSnake, numOfLadder, numOfLadder);
		RunGame runTheGame = new RunGame(board, snakePositions, ladderPositions, players);
		
		System.out.println("Game Has Started!");
		
		runTheGame.letTheGameBegin();
		
		System.out.println("Game Has Ended! Thank you for playing");
		
	}
}
