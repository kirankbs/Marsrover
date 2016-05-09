package com.example.marsrover.internal.commands;

import com.example.marsrover.internal.Rover;
import com.example.marsrover.internal.utility.RoverBoundaryValidator;

public class MoveCommand implements RoverCommand {

	@Override
	public Rover action(Rover rover) {
		return Move.valueOf(rover.getRoverDirection().name()).move(rover);
	}

	private enum Move {
		E {
			@Override
			public Rover move(Rover rover) {
				if (RoverBoundaryValidator.isEXinBounds_Move(rover)) {
					int xNew = rover.getCoordinates().getXAxis() + rover.step();
					return Rover.createNewInstance(rover.getRoverPlateaue(),
							rover.getCoordinates().setXAxis(xNew), rover.getRoverDirection());
				}
				return rover;
			}
		},
		W {
			@Override
			public Rover move(Rover rover) {
				if (RoverBoundaryValidator.isWXinBounds_Move(rover)) {
					int xNew = rover.getCoordinates().getXAxis() - rover.step();
					return Rover.createNewInstance(rover.getRoverPlateaue(),
							rover.getCoordinates().setXAxis(xNew), rover.getRoverDirection());
				}
				return rover;
			}
		},
		N {
			@Override
			public Rover move(Rover rover) {
				if (RoverBoundaryValidator.isNYinBounds_Move(rover)) {
					int yNew = rover.getCoordinates().getYAxis() + rover.step();
					return Rover.createNewInstance(rover.getRoverPlateaue(),
							rover.getCoordinates().setYAxis(yNew), rover.getRoverDirection());
				}
				return rover;
			}
		},
		S {
			@Override
			public Rover move(Rover rover) {
				if (RoverBoundaryValidator.isSYinBounds_Move(rover)) {
					int yNew = rover.getCoordinates().getYAxis() - rover.step();
					return Rover.createNewInstance(rover.getRoverPlateaue(),
							rover.getCoordinates().setYAxis(yNew), rover.getRoverDirection());
				}
				return rover;
			}
		};
		public abstract Rover move(Rover rover);
	}

}
