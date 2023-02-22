package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GiraffeTest {
	@Test
	public void testInitialState() {
		Giraffe giraffe = new Giraffe();
		assertTrue(giraffe.isAlive());
		assertEquals(giraffe.howHungry(), 50);
	}
		@Test
		public void giraffeDead() {
			Giraffe giraffe = new Giraffe();
			assertTrue(giraffe.isAlive());
			giraffe.runs();
			giraffe.runs();
			if(giraffe.howHungry() <= 100);
			assertTrue(giraffe.isAlive() == false);
		}
}