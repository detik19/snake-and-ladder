package com.subrutin.snakeladder.model;

public class Board {

	private int[] cells;
	
	private Player[] players;
	
	

	public Board(int[] cells, Player[] players) {
		super();
		this.cells = cells;
		this.players = players;
	}

	public int[] getCells() {
		return cells;
	}

	public void setCells(int[] cells) {
		this.cells = cells;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}
	
	
}

