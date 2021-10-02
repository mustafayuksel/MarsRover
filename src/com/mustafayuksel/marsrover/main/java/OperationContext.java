package com.mustafayuksel.marsrover.main.java;

public class OperationContext {

	public void executeCommand(Orientation orientation, Rover rover) {
		getOperation(orientation).doCommand(rover);
	}

	private IOperation getOperation(Orientation orientation) {
		switch (orientation) {
		case L:
			return new SpinLeftOperation();
		case R:
			return new SpinRightOperation();
		case M:
			return new MoveOperation();
		}
		throw new IllegalStateException(Constants.UNKNOWN_ORIENTATION);
	}
}