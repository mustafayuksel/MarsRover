package com.mustafayuksel.marsrover.main.java;

public class SpinRightOperation implements IOperation {

	@Override
	public void doCommand(Rover rover) {
		rover.spinRight();
	}
}