package com.format.strings;

import java.util.function.Predicate;

@FunctionalInterface
public interface StringFormatter {
	String stringFormat(String input);
	
}
