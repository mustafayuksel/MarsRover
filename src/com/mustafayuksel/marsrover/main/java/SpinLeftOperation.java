package com.mustafayuksel.marsrover.main.java;

public class SpinLeftOperation implements IOperation{

	@Override
	public void doCommand(Rover rover) {
		rover.spinLeft();
	}
}