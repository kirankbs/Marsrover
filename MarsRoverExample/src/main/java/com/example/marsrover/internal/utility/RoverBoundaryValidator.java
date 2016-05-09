package com.example.marsrover.internal.utility;

import com.example.marsrover.internal.OutOfPlateauBoundaryException;
import com.example.marsrover.internal.Rover;
import com.example.marsrover.internal.geography.Coordinates;
import com.example.marsrover.internal.geography.Plateaue;

public final class RoverBoundaryValidator {


	public static boolean isEXinBounds_Move(Rover rover) {
		int rX = rover.getCoordinates().getXAxis();
		int pX = rover.getRoverPlateaue().getXAxisLimit();

		return rX >= 0 && rX < pX;
	}
	public static boolean isWXinBounds_Move(Rover rover) {
		int rX = rover.getCoordinates().getXAxis();
		int pX = rover.getRoverPlateaue().getXAxisLimit();

		return rX > 0 && rX <= pX;
	}

	public static boolean isXinBounds(Coordinates co, Plateaue pl) {
		int rX = co.getXAxis();
		int pX = pl.getXAxisLimit();
		
		if (!(rX >= 0 && rX <= pX)) {
			throw new OutOfPlateauBoundaryException(
					" X Should be Inside Plateaue Boundary");
		}

		return rX >= 0 && rX <= pX;
	}


	public static boolean isNYinBounds_Move(Rover rover) {
		int rY = rover.getCoordinates().getYAxis();
		int pY = rover.getRoverPlateaue().getYAxisLimit();

		return rY >= 0 && rY < pY;
	}
	public static boolean isSYinBounds_Move(Rover rover) {
		int rY = rover.getCoordinates().getYAxis();
		int pY = rover.getRoverPlateaue().getYAxisLimit();

		return rY > 0 && rY <= pY;
	}

	public static boolean isYinBounds(Coordinates co, Plateaue pl) {
		int rY = co.getYAxis();
		int pY = pl.getYAxisLimit();
		
		if (!(rY >= 0 && rY <= pY)) {
			throw new OutOfPlateauBoundaryException(
					" Y should be Inside Plateaue Boundary");
		}

		return rY >= 0 && rY <= pY;
	}
}
