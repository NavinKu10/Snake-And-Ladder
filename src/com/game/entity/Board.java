package com.game.entity;

public class Board {
	private int row, column, numOfSnake, numOfLadder, numOfPlayer;

	public Board(int row, int column, int numOfSnake, int numOfLadder, int numOfPlayer) {
		this.row = row;
		this.column = column;
		this.numOfSnake = numOfSnake;
		this.numOfLadder = numOfLadder;
		this.numOfPlayer = numOfPlayer;
	}	
}
