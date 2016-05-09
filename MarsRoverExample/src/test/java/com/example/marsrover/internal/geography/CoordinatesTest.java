package com.example.marsrover.internal.geography;

import org.junit.Assert;
import org.junit.Test;


public class CoordinatesTest {

	@Test
	public void testSetXAxis() {
		//given
		Coordinates coordinates = Coordinates.createNewInstance(2, 2);
		//when
		Coordinates actual = coordinates.setXAxis(3);
		//then
		Assert.assertEquals(3, actual.getXAxis());
		Assert.assertEquals(2, actual.getYAxis());
	}

	@Test
	public void testSetYAxis() {
		//given
		Coordinates coordinates = Coordinates.createNewInstance(2, 2);
		//when
		Coordinates actual = coordinates.setYAxis(3);
		//then
		Assert.assertEquals(2, actual.getXAxis());
		Assert.assertEquals(3, actual.getYAxis());		
	}

}
