package com.mustafayuksel.marsrover.main.java;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Orientation {
	L, R, M;

	public static Orientation fromString(final String name) {
		Orientation orientation = Stream.of(values())
				.collect(Collectors.toMap(Orientation::toString, Function.identity())).get(name);
		if (orientation == null) {
			throw new IllegalStateException(Constants.UNKNOWN_ORIENTATION);
		}
		return orientation;
	}
}