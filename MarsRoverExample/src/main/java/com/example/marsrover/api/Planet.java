package com.example.marsrover.api;

import com.example.marsrover.internal.geography.Plateaue;

public interface Planet {
	
	Plateaue getNewPlateau(int xLimit,int yLimit);

	Plateaue getDefaultPlateau();

}
