package com.example.marsrover.internal.commands;

import com.example.marsrover.internal.Rover;

public class RightCommand implements RoverCommand {

	@Override
	public Rover action(Rover rover) {
		return Rover.createNewInstance(rover.getRoverPlateaue(), rover.getCoordinates(),
				rover.getRoverDirection().right());
	}

}
