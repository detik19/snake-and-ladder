package com.subrutin.snakeladder.service.impl;

import com.subrutin.snakeladder.model.Board;
import com.subrutin.snakeladder.model.Player;
import com.subrutin.snakeladder.service.GameService;

public class GameServiceImpl implements GameService {

	private Board board;
	
	private boolean isFinish;
	
	private int round;
	
	private int playerNumber;

	public GameServiceImpl(Board board) {
		super();
		this.board = board;
		isFinish=false;
		round=0;
		this.playerNumber = board.getPlayers().length;

	}


	@Override
	public void startGame() {
		
		while(!isFinish) {
			//select player 1
			//roll dice
			//move x point
			//snake/ladder
			//win?
			//stop game
		}
		
		
	}


	@Override
	public Player selectPlayer(int round) {
		//round = 1,2,3,4
		//player = 3
		//round =1 -> 1
		//round=2->2
		//round=4 -> 1
		int fullRound = round/playerNumber;
		int selectedPlayer = round - fullRound*playerNumber;
		Player  player = board.getPlayers()[selectedPlayer];
		return player;
	}

}
