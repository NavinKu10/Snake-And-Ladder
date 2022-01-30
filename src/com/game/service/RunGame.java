package com.game.service;

import java.util.*;

import com.game.entity.Board;
import com.game.entity.Ladder;
import com.game.entity.Player;
import com.game.entity.Snake;

public class RunGame {
	
	private List<Snake> snakePositions;
	private List<Ladder> ladderPositions;
	private List<Player> players;
	private Board board;
	private boolean gameFinished;
	
	public RunGame(Board board, List<Snake> snakePositions, List<Ladder> ladderPositions, List<Player> players) {
		// TODO Auto-generated constructor stub
		this.snakePositions = snakePositions;
		this.ladderPositions = ladderPositions;
		this.players = players;
		this.board = board;
		this.gameFinished = false;
	}
	
	public int rollTheDice() {
		return new Random().nextInt(6) + 1;
	}
	
	public void letTheGameBegin() {
		// TODO Auto-generated method stub
		int currentIndex = 0;
		while(gameFinished==false) {
			Player currentPlayer = players.get(currentIndex);
			int diceNumber = rollTheDice();
			int nextPosition = currentPlayer.getFinalPos()+diceNumber>100?currentPlayer.getFinalPos():currentPlayer.getFinalPos()+diceNumber;
			boolean nextFromSnake = true, nextFromLadder = true;
			System.out.println(currentPlayer.getName()+"'s turn now");
			System.out.println(currentPlayer.getName()+" rolled a "+diceNumber);
			
			while(nextFromSnake == true||nextFromLadder == true) {
				nextFromSnake = false;
				nextFromLadder = false;
				for(Snake snakes:snakePositions) {
					if(snakes.getHeadPos()==nextPosition) {
						nextPosition = snakes.getTailPos();
						nextFromSnake = true;
						System.out.println(currentPlayer.getName()+" was bitten by a snake at "+ snakes.getHeadPos());
					}
				}
				for(Ladder ladders:ladderPositions) {
					if(ladders.getFeetPos()==nextPosition) {
						nextPosition = ladders.getHeadPos();
						nextFromLadder = true;
						System.out.println(currentPlayer.getName()+" climbed a ladder at "+ ladders.getFeetPos());
					}
				}
			}
			
			currentPlayer.setInitialPos(currentPlayer.getFinalPos());
			currentPlayer.setFinalPos(nextPosition);
			
			System.out.println(currentPlayer.getName()+" moved from "+currentPlayer.getInitialPos()+" to "+currentPlayer.getFinalPos());
			
			//check if won 
			if(nextPosition==100) {
				gameFinished=true;
				System.out.println(currentPlayer.getName()+" wins the game");
			}
			
			currentIndex = (currentIndex+1)%players.size();
		}
		
		return;
	}
	
}
