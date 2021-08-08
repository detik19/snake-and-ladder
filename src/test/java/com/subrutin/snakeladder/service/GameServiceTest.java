package com.subrutin.snakeladder.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import com.subrutin.snakeladder.model.Board;
import com.subrutin.snakeladder.model.Dice;
import com.subrutin.snakeladder.model.Player;
import com.subrutin.snakeladder.service.impl.GameServiceImpl;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.subrutin.snakeladder")
public class GameServiceTest {

	private Board board;
	
	private GameService gameService;

	@BeforeEach
	void setupThis() {
		int[] cells = new int[101];
		cells[3]=40;

		cells[41]=20;
		cells[6]=2;

		board = new Board(cells, new Player[] {new Player("A"),
				new Player("B"),new Player("C")});
		gameService = new GameServiceImpl(board);
	}

//	@Test
//	public void testSelectPlayer() {
//		Player player = gameService.selectPlayer(0);
//		assertEquals("A", player.getName());
//		player = gameService.selectPlayer(1);
//		assertEquals("B", player.getName());
//		player = gameService.selectPlayer(2);
//		assertEquals("C", player.getName());
//		player = gameService.selectPlayer(4);
//		assertEquals("B", player.getName());
//	}
	
//	@Test
//	public void testMovePlayer() {
//		Player player = gameService.selectPlayer(0);
//		gameService.movePlayer(player, 3);
//		
//		Player player2 = gameService.selectPlayer(1);
//		gameService.movePlayer(player2, 1);
//		
//		Player player3 = gameService.selectPlayer(2);
//		gameService.movePlayer(player3, 6);
//	}
	
	@Test
	public void testPlay() {
		gameService.startGame();
	}
}
