package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	@Test
	public void catMinusNineLives() {
		Cat cat = new Cat();
		for(int i = 0; i < 9; i++) {
		cat.runs();
		cat.runs();
		}
		assertTrue(!cat.isAlive());
	}
}