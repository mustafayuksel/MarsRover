package com.mustafayuksel.marsrover.main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MarsRoverMain {

	private static final String INPUT_FILE_NAME = "input.txt";

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME))) {
			followInstructions(br).forEach(rover -> System.out.println(rover.toString()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Rover> followInstructions(BufferedReader br) throws IOException {
		List<Rover> roverList = new ArrayList<>();
		Grid grid = new GridBuilder(br.readLine().split(" ")).build();

		while (br.ready()) {
			String orientationLine = br.readLine();
			if (orientationLine != null) {
				roverList.add(orientRoverWithInstructions(br, grid, orientationLine));
			} else {
				break;
			}
		}
		return roverList;
	}

	private static Rover orientRoverWithInstructions(BufferedReader br, Grid grid, String orientationLine)
			throws IOException {
		Rover rover = new RoverBuilder(orientationLine.split(" "), grid).build();
		for (char instruction : br.readLine().toCharArray()) {
			new OperationContext().executeCommand(Orientation.fromString(String.valueOf(instruction)), rover);
		}
		return rover;
	}
}