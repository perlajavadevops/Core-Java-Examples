package com.pgr.java8features;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		String name = "Dhruvika";
		// String name = null;
		// System.out.println(name.length());
		Optional op = Optional.ofNullable(name);

		Optional.of(name).isPresent();

		System.out.println(op.isPresent());

	}
}
