package com.subrutin.snakeladder.service;

import com.subrutin.snakeladder.model.Player;

public interface GameService {
		
	public void startGame();
	
	public Player selectPlayer(int round);
	

}
