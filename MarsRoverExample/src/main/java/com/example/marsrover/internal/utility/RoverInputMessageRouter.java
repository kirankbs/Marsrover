package com.example.marsrover.internal.utility;

import com.example.marsrover.internal.Rover;

public enum RoverInputMessageRouter {
	L {
		@Override
		public Rover action(Rover rover) {
			return rover.left();
		}
	},
	R {

		@Override
		public Rover action(Rover rover) {
			return rover.right();
		}

	},
	M {

		@Override
		public Rover action(Rover rover) {
			return rover.move();
		}

	};
	public abstract Rover action(Rover rover);
}

