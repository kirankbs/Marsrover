package com.example.marsrover.client;

import com.example.marsrover.api.Planet;
import com.example.marsrover.internal.Rover;
import com.example.marsrover.internal.geography.Coordinates;
import com.example.marsrover.internal.geography.Direction;
import com.example.marsrover.internal.geography.Mars;
import com.example.marsrover.internal.geography.Plateaue;

public class NASA {
	
	public static void main(String[] args) {
		Planet mars = Mars.createNewInstance();
		Plateaue plateaue = mars.getDefaultPlateau();
		Coordinates coordinates = Coordinates.createNewInstance(0, 0);
		
		Rover rover = Rover.createNewInstance(plateaue,coordinates,Direction.E);
		System.out.println(rover.roverInput("RM"));
	}
	

}
