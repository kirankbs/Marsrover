package com.example.marsrover.internal.geography;

/**
 * 
 * 
 *
 * Coordinates are X and Y axis for the Rover on given Mars Plateaue.
 * X and Y Axis can be updated if rover is inside Plateaue.
 */
public final class Coordinates {

	private final int xAxis;
	private final int yAxis;

	private Coordinates(final int x, final int y) {
		this.xAxis = x;
		this.yAxis = y;
	}

	public static Coordinates createNewInstance(final int x, final int y) {
		return new Coordinates(x, y);
	}

	public int getXAxis() {
		return xAxis;
	}

	public int getYAxis() {
		return yAxis;
	}

	public Coordinates setXAxis(int x) {
		return Coordinates.createNewInstance(x, yAxis);
	}

	public Coordinates setYAxis(int y) {
		return Coordinates.createNewInstance(xAxis, y);
	}

	@Override
	public String toString() {
		return "Coordinates [xAxis=" + xAxis + ", yAxis=" + yAxis + "]";
	}

}
