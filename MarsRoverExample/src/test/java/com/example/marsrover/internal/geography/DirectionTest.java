package com.example.marsrover.internal.geography;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class DirectionTest {
	private Direction expected;
	private Direction actual;

	@After
	public void tearDown() {
		expected = null;
		actual = null;
	}

	@Test
	public void testEastRight() {
		// given
		expected = Direction.S;
		//when
		actual = Direction.E.right();
		//then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEastLeft() {
		// given
		expected = Direction.N;
		//when
		actual = Direction.E.left();
		//then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testWestRight() {
		// given
		expected = Direction.N;
		//when
		actual = Direction.W.right();
		//then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testWestLeft() {
		// given
		expected = Direction.S;
		//when
		actual = Direction.W.left();
		//then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testNorthRight() {
		// given
		expected = Direction.E;
		//when
		actual = Direction.N.right();
		//then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testNorthLeft() {
		// given
		expected = Direction.W;
		//when
		actual = Direction.N.left();
		//then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSouthRight() {
		// given
		expected = Direction.W;
		//when
		actual = Direction.S.right();
		//then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSouthLeft() {
		// given
		expected = Direction.E;
		//when
		actual = Direction.S.left();
		//then
		Assert.assertEquals(expected, actual);
	}

}
