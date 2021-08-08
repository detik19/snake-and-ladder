package com.subrutin.snakeladder.model;

import java.util.Random;

public class Dice {

	public static int roll() {
		Random random = new Random();
		int number= random.nextInt(6)+1;
		return number;
	}
	

	
	
}
