package com.game.entity;

public class Ladder {
	private int feetPos, headPos;

	public int getFeetPos() {
		return feetPos;
	}

	public int getHeadPos() {
		return headPos;
	}

	public Ladder(int feetPos, int headPos) {
		this.feetPos = feetPos;
		this.headPos = headPos;
	}
}
