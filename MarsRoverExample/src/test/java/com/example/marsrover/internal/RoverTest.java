package com.example.marsrover.internal;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.example.marsrover.internal.geography.Coordinates;
import com.example.marsrover.internal.geography.Direction;
import com.example.marsrover.internal.geography.Plateaue;

public class RoverTest {

	@Test
	public void testCreateNewInstance_InsideBoundary() {
		Rover rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(9, 5), Direction.E);
		Assert.assertEquals(9, rover.getCoordinates().getXAxis());
		Assert.assertEquals(5, rover.getCoordinates().getYAxis());
		Assert.assertEquals(Direction.E, rover.getRoverDirection());

	}

	@Test(expected = OutOfPlateauBoundaryException.class)
	public void testCreateNewInstance_BeyondXBoundary() {
		Rover rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(11, 5), Direction.E);
	}

	@Test(expected = OutOfPlateauBoundaryException.class)
	public void testCreateNewInstance_BeyondYBoundary() {
		Rover rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(11, 6), Direction.E);
	}

	@Test
	public void testRoverInput() {
		Rover rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(1, 2), Direction.N);
		System.out.println(
				rover.roverInput("LMMMLMLMMMMMMMMMMMMRMLMLMMLMMMRMMMMMMLMMMMMMMMMMLMMMMMMM"));
	}

}
