package com.mustafayuksel.marsrover.main.java;

public class GridBuilder {
	private String[] coordinatesArray;

	public GridBuilder(String[] coordinatesArray) {
		this.coordinatesArray = coordinatesArray;
	}

	public Grid build() {
		Coordinates coordinates = new Coordinates(Integer.parseInt(coordinatesArray[Constants.X_COORDINATE_INDEX]),
				Integer.parseInt(coordinatesArray[Constants.Y_COORDINATE_INDEX]));
		return new Grid(coordinates);
	}
}