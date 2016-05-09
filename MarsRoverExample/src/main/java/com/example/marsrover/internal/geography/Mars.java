package com.example.marsrover.internal.geography;

import com.example.marsrover.api.Planet;

public class Mars implements Planet{
	
	private Mars() {}
	
	public static Mars createNewInstance(){
		return new Mars();
	}
	
	@Override
	public Plateaue getDefaultPlateau() {
		return Plateaue.createNewDefaultPlateaueInstance();
	}
	
	@Override
	public Plateaue getNewPlateau(int xLimit,int yLimit) {
		return Plateaue.createNewPlateaueInstance(xLimit, yLimit);
	}

}
