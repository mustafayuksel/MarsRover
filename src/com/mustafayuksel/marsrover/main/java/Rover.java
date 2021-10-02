package com.mustafayuksel.marsrover.main.java;

public class Rover {
	private Coordinates coordinates;
	private Direction direction;
	private Grid grid;

	public Rover(Coordinates coordinates, Direction direction, Grid grid) {
		this.coordinates = coordinates;
		this.direction = direction;
		this.grid = grid;
	}

	public void spinLeft() {
		direction = direction.left();
	}

	public void spinRight() {
		direction = direction.right();
	}

	public void move() {
		Coordinates newCoordinates = prepareNewCoordinates();
		if (grid.isValidCoordinates(newCoordinates)) {
			coordinates = newCoordinates;
		}
	}

	private Coordinates prepareNewCoordinates() {
		switch (direction) {
		case N:
			return new Coordinates(coordinates.getX(), coordinates.getY() + 1);
		case S:
			return new Coordinates(coordinates.getX(), coordinates.getY() - 1);
		case W:
			return new Coordinates(coordinates.getX() - 1, coordinates.getY());
		case E:
			return new Coordinates(coordinates.getX() + 1, coordinates.getY());
		default:
			throw new IllegalStateException(Constants.UNKNOWN_DIRECTION);
		}
	}

	@Override
	public String toString() {
		return coordinates.getX() + " " + coordinates.getY() + " " + direction.toString();
	}
}