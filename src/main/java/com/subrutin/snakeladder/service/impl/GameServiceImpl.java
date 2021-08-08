package com.subrutin.snakeladder.service.impl;

import com.subrutin.snakeladder.model.Board;
import com.subrutin.snakeladder.model.Dice;
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
			Player player = selectPlayer(round);
			int diceValue = Dice.roll();
			int currentlyPos = movePlayer(player, diceValue);
			if(currentlyPos==100) {
				isFinish=true;
			}else 
				round++;
		}
		
		
	}


	private int movePlayer(Player player, int diceValue) {
		int initialPosition = player.getPosition();
		int position = player.move(diceValue);
		movedBySnakeOrLadder(player, position);
		//<player_name> rolled a <dice_value> and moved from <initial_position> to <final_position>
		System.out.println(player.getName() +" rolled a "+diceValue+" and moved from "+initialPosition+" to "+player.getPosition());
		return player.getPosition();
	}


	private void movedBySnakeOrLadder(Player player, int currentlyPos) {
		int ladderOrSnakePos = board.getSnakeAndLadderPos(currentlyPos);
		if(ladderOrSnakePos!=0) 
			movedBySnakeOrLadder(player, ladderOrSnakePos);
		else
			player.setPosition(currentlyPos);
		
	}


	private Player selectPlayer(int round) {
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
