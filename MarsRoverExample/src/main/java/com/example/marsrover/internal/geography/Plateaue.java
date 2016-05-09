package com.example.marsrover.internal.geography;

public class Plateaue {

	private final int xAxisLimit;
	private final int yAxisLimit;

	private Plateaue(int xAxisLimit, int yAxisLimit) {
		this.xAxisLimit = xAxisLimit;
		this.yAxisLimit = yAxisLimit;
	}

	public static Plateaue createNewDefaultPlateaueInstance() {
		return new Plateaue(10, 5);
	}

	public static Plateaue createNewPlateaueInstance(int xLimit, int yLimit) {
		return new Plateaue(xLimit, yLimit);
	}

	public int getXAxisLimit() {
		return xAxisLimit;
	}

	public int getYAxisLimit() {
		return yAxisLimit;
	}

	public Plateaue setXAxisLimit(int xLimit) {
		return Plateaue.createNewPlateaueInstance(xLimit, yAxisLimit);
	}

	public Plateaue setYAxisLimit(int yLimit) {
		return Plateaue.createNewPlateaueInstance(xAxisLimit, yLimit);
	}

	@Override
	public String toString() {
		return "Plateaue [xAxisLimit=" + xAxisLimit + ", yAxisLimit=" + yAxisLimit + "]";
	}

}
