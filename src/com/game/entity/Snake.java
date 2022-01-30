package com.game.entity;

public class Snake {
	private int tailPos, headPos;

	public int getTailPos() {
		return tailPos;
	}

	public int getHeadPos() {
		return headPos;
	}
	
	public Snake(int headPos, int tailPos) {
		this.tailPos = tailPos;
		this.headPos = headPos;
	}
}
