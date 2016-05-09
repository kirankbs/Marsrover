package com.example.marsrover.internal.commands;

import com.example.marsrover.internal.Rover;

public interface RoverCommand {

	Rover action(Rover rover);
	
}
