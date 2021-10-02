package com.mustafayuksel.marsrover.main.java;

public class Grid {
	private Coordinates coordinates;

	public Grid(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public boolean isValidCoordinates(Coordinates roverCoordinate) {
		return isGreaterThanLowerCoordinates(roverCoordinate) && isInTheGrid(roverCoordinate);
	}

	private boolean isGreaterThanLowerCoordinates(Coordinates roverCoordinate) {
		return roverCoordinate.getX() >= 0 && roverCoordinate.getY() >= 0;
	}

	private boolean isInTheGrid(Coordinates roverCoordinate) {
		return roverCoordinate.getX() <= coordinates.getX() && roverCoordinate.getY() <= coordinates.getY();
	}
}