package com.subrutin.snakeladder.model;

public class Player {
	
	public Player(String name) {
		super();
		this.name = name;
		this.position=0;
	}

	private String name;
	
	private int position;
	
	public int move(int step) {
		position = position+step>100?position: position+step;
		return position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	

}
