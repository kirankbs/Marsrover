package com.example.marsrover.internal.geography;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.example.marsrover.api.Planet;

public class MarsPlateaueTest {

	private Planet mars=Mars.createNewInstance();
	private Plateaue plateaue;

	@After
	public void tearDown() {
		mars = null;
		plateaue = null;
	}

	@Test
	public void testCreateNewDefaultPlateaueInstance() {
		// given
		int x = 10;
		int y = 5;
		// when
		plateaue = mars.getDefaultPlateau();
		// then
		Assert.assertEquals(x, plateaue.getXAxisLimit());
		Assert.assertEquals(y, plateaue.getYAxisLimit());
	}

	@Test
	public void testCreateNewPlateaueInstance() {
		// given
		int x = 20;
		int y = 30;
		//when
		plateaue = mars.getNewPlateau(x, y);
		// then
		Assert.assertEquals(x, plateaue.getXAxisLimit());
		Assert.assertEquals(y, plateaue.getYAxisLimit());

	}

	@Test
	public void testSetXAxisLimit() {
		//given
		int x = 10;
		plateaue = mars.getDefaultPlateau();
		int y = plateaue.getYAxisLimit();
		//when
		plateaue = plateaue.setXAxisLimit(x);
		//then
		Assert.assertEquals(x, plateaue.getXAxisLimit());
		Assert.assertEquals(y, plateaue.getYAxisLimit());
	}

	@Test
	public void testSetYAxisLimit() {
		//given
		int y = 10;
		plateaue = mars.getDefaultPlateau();
		int x = plateaue.getXAxisLimit();
		//when
		plateaue = plateaue.setYAxisLimit(y);
		//then
		Assert.assertEquals(x, plateaue.getXAxisLimit());
		Assert.assertEquals(y, plateaue.getYAxisLimit());
	}

}
