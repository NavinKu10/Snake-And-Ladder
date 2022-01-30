package com.game.entity;

public class Player {
	private int initialPos, finalPos;
	private String name;
	private boolean wonOrNot;
	
	public Player(String name) {
		this.finalPos = 0;
		this.initialPos = 0;
		this.wonOrNot = false;
		this.name = name;
	}
	
	public int getInitialPos() {
		return initialPos;
	}
	public void setInitialPos(int initialPos) {
		this.initialPos = initialPos;
	}
	public int getFinalPos() {
		return finalPos;
	}
	public void setFinalPos(int finalPos) {
		this.finalPos = finalPos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isWonOrNot() {
		return wonOrNot;
	}
	public void setWonOrNot(boolean wonOrNot) {
		this.wonOrNot = wonOrNot;
	}	
}
