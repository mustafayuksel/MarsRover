package com.mustafayuksel.marsrover.main.java;

public class RoverBuilder {
	
	private String[] roverOrientationArray;
	private Grid grid;
	
	public RoverBuilder(String[] roverOrientationArray, Grid grid) {
		this.roverOrientationArray = roverOrientationArray;
		this.grid = grid;
	}
	
	public Rover build() {
		int directionIndex = 2;

		Coordinates roverCoordinates = new Coordinates(
				Integer.parseInt(roverOrientationArray[Constants.X_COORDINATE_INDEX]),
				Integer.parseInt(roverOrientationArray[Constants.Y_COORDINATE_INDEX]));
		Direction direction = Direction.valueOf(roverOrientationArray[directionIndex]);
		return new Rover(roverCoordinates, direction, grid);
	}
}