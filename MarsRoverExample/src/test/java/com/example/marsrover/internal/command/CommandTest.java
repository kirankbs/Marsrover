package com.example.marsrover.internal.command;

import org.junit.Assert;
import org.junit.Test;

import com.example.marsrover.internal.Rover;
import com.example.marsrover.internal.geography.Coordinates;
import com.example.marsrover.internal.geography.Direction;
import com.example.marsrover.internal.geography.Plateaue;

public class CommandTest {

	private Rover rover;

	@Test
	public void testRoverLeftCommand() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(7, 3), Direction.E);
		Direction roverExpected = Direction.N;
		// when
		Direction roverActual = rover.left().getRoverDirection();
		// then
		Assert.assertEquals(roverExpected, roverActual);
	}

	@Test
	public void testRoverRightCommand() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(7, 3), Direction.E);
		Direction roverExpected = Direction.S;
		// when
		Direction roverActual = rover.right().getRoverDirection();
		// then
		Assert.assertEquals(roverExpected, roverActual);
	}

	@Test
	public void testRoverEastMoveCommand_InsideBoundary() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(9, 5), Direction.E);
		// when
		rover = rover.move();
		// then
		Assert.assertEquals(10, rover.getCoordinates().getXAxis());
		Assert.assertEquals(5, rover.getCoordinates().getYAxis());
	}
	@Test
	public void testRoverEastMoveCommand_BeyondBoundary() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(10, 5), Direction.E);
		// when
		rover = rover.move();
		// then
		Assert.assertEquals(10, rover.getCoordinates().getXAxis());
		Assert.assertEquals(5, rover.getCoordinates().getYAxis());
	}
	@Test
	public void testRoverEastMoveCommand_AtOrigin() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(0, 0), Direction.E);
		// when
		rover = rover.move();
		// then
		Assert.assertEquals(1, rover.getCoordinates().getXAxis());
		Assert.assertEquals(0, rover.getCoordinates().getYAxis());
	}

	
	@Test
	public void testRoverWestMoveCommand_InsideBoundary() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(1, 5), Direction.W);
		// when
		rover = rover.move();
		// then
		Assert.assertEquals(0, rover.getCoordinates().getXAxis());
		Assert.assertEquals(5, rover.getCoordinates().getYAxis());
	}
	@Test
	public void testRoverWestMoveCommand_BeyondBoundary() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(10, 5), Direction.W);
		// when
		rover = rover.move();
		// then
		Assert.assertEquals(10, rover.getCoordinates().getXAxis());
		Assert.assertEquals(5, rover.getCoordinates().getYAxis());
	}
	@Test
	public void testRoverWestMoveCommand_AtOrigin() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(0, 0), Direction.W);
		// when
		rover = rover.move();
		// then
		Assert.assertEquals(0, rover.getCoordinates().getXAxis());
		Assert.assertEquals(0, rover.getCoordinates().getYAxis());
	}
	
	@Test
	public void testRoverNorthMoveCommand_InsideBoundary() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(10, 4), Direction.N);
		// when
		rover = rover.move();
		// then
		Assert.assertEquals(10, rover.getCoordinates().getXAxis());
		Assert.assertEquals(5, rover.getCoordinates().getYAxis());
	}
	@Test
	public void testRoverNorthMoveCommand_BeyondBoundary() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(10, 5), Direction.N);
		// when
		rover = rover.move();
		// then
		Assert.assertEquals(10, rover.getCoordinates().getXAxis());
		Assert.assertEquals(5, rover.getCoordinates().getYAxis());
	}
	@Test
	public void testRoverNorthMoveCommand_AtOrigin() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(0, 0), Direction.N);
		// when
		rover = rover.move();
		// then
		Assert.assertEquals(0, rover.getCoordinates().getXAxis());
		Assert.assertEquals(1, rover.getCoordinates().getYAxis());
	}
	
	@Test
	public void testRoverSouthMoveCommand_InsideBoundary() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(1, 4), Direction.S);
		// when
		rover = rover.move();
		// then
		Assert.assertEquals(1, rover.getCoordinates().getXAxis());
		Assert.assertEquals(3, rover.getCoordinates().getYAxis());
	}
	@Test
	public void testSouthNorthMoveCommand_BeyondBoundary() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(10, 0), Direction.S);
		// when
		rover = rover.move();
		// then
		Assert.assertEquals(10, rover.getCoordinates().getXAxis());
		Assert.assertEquals(0, rover.getCoordinates().getYAxis());
	}
	@Test
	public void testSouthNorthMoveCommand_AtOrigin() {
		// given
		rover = Rover.createNewInstance(Plateaue.createNewDefaultPlateaueInstance(),
				Coordinates.createNewInstance(0, 0), Direction.S);
		// when
		rover = rover.move();
		// then
		Assert.assertEquals(0, rover.getCoordinates().getXAxis());
		Assert.assertEquals(0, rover.getCoordinates().getYAxis());
	}
}
