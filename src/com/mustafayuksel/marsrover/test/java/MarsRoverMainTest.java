package com.mustafayuksel.marsrover.test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import org.junit.Test;

import com.mustafayuksel.marsrover.main.java.Constants;
import com.mustafayuksel.marsrover.main.java.MarsRoverMain;
import com.mustafayuksel.marsrover.main.java.Rover;

public class MarsRoverMainTest {

	@Test
	public void whenRoverMovesValidDirectionThenReturnsThePosition() throws IOException {
		// given
		String input = "5 5\n" + "1 2 N\n" + "LMLMLMLMM\n" + "3 3 E\n" + "MMRMMRMRRM";

		// when
		List<Rover> roverList = MarsRoverMain.followInstructions(new BufferedReader(new StringReader(input)));

		// then
		assertEquals("1 3 N", roverList.get(0).toString());
		assertEquals("5 1 E", roverList.get(1).toString());
	}

	@Test
	public void whenRoverMovesInvalidDirectionThenThrowException() {
		// given
		String input = "5 5\n" + "1 2 N\n" + "LMLMKMLMM\n" + "3 3 E\n" + "MMRMMRMRRM";

		// when
		String exMessage = "";
		try {

			MarsRoverMain.followInstructions(new BufferedReader(new StringReader(input)));
		} catch (IOException | IllegalStateException ex) {
			exMessage = ex.getMessage();
		}

		// then
		assertEquals(Constants.UNKNOWN_ORIENTATION, exMessage);
	}
}