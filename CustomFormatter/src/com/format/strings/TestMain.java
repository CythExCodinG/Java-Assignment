package com.format.strings;

public class TestMain {
	public static String processText(String text,StringFormatter f) {
		return f.stringFormat(text);
	}
	public static void main(String[] args) {
		
		StringFormatter reverse=input->{
			return new StringBuilder(input).reverse().toString();
		};
		
		StringFormatter uppercase=String::toUpperCase;
		
		System.out.println( processText("Rohit", uppercase));
		System.out.println( processText("tob iah ayk", reverse));
	}
}
