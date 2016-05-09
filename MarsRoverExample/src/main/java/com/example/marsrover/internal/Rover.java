package com.example.marsrover.internal;

import com.example.marsrover.internal.commands.LeftCommand;
import com.example.marsrover.internal.commands.MoveCommand;
import com.example.marsrover.internal.commands.RightCommand;
import com.example.marsrover.internal.commands.RoverCommand;
import com.example.marsrover.internal.geography.Coordinates;
import com.example.marsrover.internal.geography.Direction;
import com.example.marsrover.internal.geography.Plateaue;
import com.example.marsrover.internal.utility.RoverBoundaryValidator;
import com.example.marsrover.internal.utility.RoverInputMessageRouter;

public class Rover {
	private final Plateaue roverPlateaue;
	private final Coordinates coordinates;
	private final Direction direction;
	private static Rover rover;
	private final int step;

	private Rover(Plateaue p, Coordinates coordinates, Direction direction, int step) {
		this.roverPlateaue = p;
		this.coordinates = coordinates;
		this.direction = direction;
		this.step = step;
	}

	public static final Rover createNewInstance(Plateaue p, Coordinates coordinates,
			Direction direction) {
		RoverBoundaryValidator.isXinBounds(coordinates, p);
		RoverBoundaryValidator.isYinBounds(coordinates, p);
		
		rover = new Rover(p, coordinates, direction, 1);
		return rover;
	}

	public Plateaue getRoverPlateaue() {
		return roverPlateaue;
	}

	public Direction getRoverDirection() {
		return direction;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public int step() {
		return step;
	}

	public Rover setRoverStep(int s) {
		return new Rover(roverPlateaue, coordinates, direction, s);
	}

	public String roverInput(String input) {

		for (String s : input.split("")) {
			RoverInputMessageRouter.valueOf(s).action(rover);
		}
		return rover.getCoordinates().getXAxis() + " " + rover.getCoordinates().getYAxis()
				+ " " + rover.getRoverDirection();
	}

	public Rover right() {
		RoverCommand command = new RightCommand();
		rover = command.action(this);
		return rover;
	}

	public Rover left() {
		RoverCommand command = new LeftCommand();
		rover = command.action(this);
		return rover;
	}

	public Rover move() {
		RoverCommand command = new MoveCommand();
		rover = command.action(this);
		return rover;
	}

	@Override
	public String toString() {
		return "Rover [roverPlateaue=" + roverPlateaue + ", direction=" + direction + "]";
	}

}
