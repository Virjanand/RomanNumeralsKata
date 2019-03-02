package com.virjanand.romanNumeral;

public class ArabicNumber {

	private int number;
	private StringBuilder romanNumber;
	
	public ArabicNumber(int number) {
		this.number = number;
		romanNumber = new StringBuilder();
	}

	public String toRoman() {
		extract(1000, "M");
		extract(500, "D");
		extract(100, "C");
		extract(50, "L");
		extract(10, "X");
		extract(5, "V");
		extract(1, "I");
		return romanNumber.toString();
	}
	
	private void extract(int romanLetterNumber, String romanLetter) {
		prependLetters(romanLetterNumber);
		while (number >= romanLetterNumber) {
			number -= romanLetterNumber;
			romanNumber.append(romanLetter);
			prependLetters(romanLetterNumber);
		}
	}

	private void prependLetters(int romanLetterNumber) {
		prependLetter(romanLetterNumber, 100, "C");
		prependLetter(romanLetterNumber, 10, "X");
		prependLetter(romanLetterNumber, 1, "I");
	}

	private void prependLetter(int romanLetterNumber, int magnitude, String romanLetter) {
		if (number - romanLetterNumber < 0 && number - romanLetterNumber >= -1 * magnitude && number % (5 * magnitude) >= 4 * magnitude) {
			number += magnitude;
			romanNumber.append(romanLetter);
		}
	}
}
