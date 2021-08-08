package com.subrutin.snakeladder.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;



@RunWith(JUnitPlatform.class)
@SelectPackages("com.subrutin.snakeladder")
public class DiceTest {
	
	@Test
	public void testRoll() {
		
		Dice dice = new Dice();
		for(int i=0;i<100;i++) {
			int value = dice.roll();
			assertEquals(true, value<=6&&value>=1);
		}
			

		
	}

}
