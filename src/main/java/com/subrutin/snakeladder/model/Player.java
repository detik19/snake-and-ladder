package com.subrutin.snakeladder.model;

public class Player {
	
	private String name;
	
	private int position;
	
	public int move(int step) {
		position +=step;
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
