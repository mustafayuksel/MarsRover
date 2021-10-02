package com.mustafayuksel.marsrover.main.java;

public class MoveOperation implements IOperation {

	@Override
	public void doCommand(Rover rover) {
		rover.move();
	}
}