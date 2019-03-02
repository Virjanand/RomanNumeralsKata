package com.virjanand.romanNumeral;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArabicNumeralToRomanTest {

	@Test
	void one_givesI() {
		ArabicNumber arabic = new ArabicNumber(1);
		assertEquals("I", arabic.toRoman());
	}
	
	@Test
	void two_givesII() {
		ArabicNumber arabic = new ArabicNumber(2);
		assertEquals("II", arabic.toRoman());
	}
	
	@Test
	void five_givesV() {
		ArabicNumber arabic = new ArabicNumber(5);
		assertEquals("V", arabic.toRoman());
	}

	@Test
	void four_givesIV() {
		ArabicNumber arabic = new ArabicNumber(4);
		assertEquals("IV", arabic.toRoman());
	}
	
	@Test
	void six_givesVI() {
		ArabicNumber arabic = new ArabicNumber(6);
		assertEquals("VI", arabic.toRoman());
	}
	
	@Test
	void ten_givesX() {
		ArabicNumber arabic = new ArabicNumber(10);
		assertEquals("X", arabic.toRoman());
	}
	
	@Test
	void nine_givesIX() {
		ArabicNumber arabic = new ArabicNumber(9);
		assertEquals("IX", arabic.toRoman());
	}
	
	@Test
	void eleven_givesXI() {
		ArabicNumber arabic = new ArabicNumber(11);
		assertEquals("XI", arabic.toRoman());
	}
	
	@Test
	void fourteen_givesXIV() {
		ArabicNumber arabic = new ArabicNumber(14);
		assertEquals("XIV", arabic.toRoman());
	}
	
	@Test
	void sixteen_givesXVI() {
		ArabicNumber arabic = new ArabicNumber(16);
		assertEquals("XVI", arabic.toRoman());
	}
	
	@Test
	void nineteen_givesXIX() {
		ArabicNumber arabic = new ArabicNumber(19);
		assertEquals("XIX", arabic.toRoman());
	}
	
	@Test
	void twentyone_givesXXI() {
		ArabicNumber arabic = new ArabicNumber(21);
		assertEquals("XXI", arabic.toRoman());
	}

	@Test
	void fifty_givesL() {
		ArabicNumber arabic = new ArabicNumber(50);
		assertEquals("L", arabic.toRoman());
	}

	@Test
	void fourty_givesXL() {
		ArabicNumber arabic = new ArabicNumber(40);
		assertEquals("XL", arabic.toRoman());
	}

	@Test
	void thirtynine_givesXXXIX() {
		ArabicNumber arabic = new ArabicNumber(39);
		assertEquals("XXXIX", arabic.toRoman());
	}
	
	@Test
	void sixty_givesLX() {
		ArabicNumber arabic = new ArabicNumber(60);
		assertEquals("LX", arabic.toRoman());
	}

	@Test
	void hundred_givesC() {
		ArabicNumber arabic = new ArabicNumber(100);
		assertEquals("C", arabic.toRoman());
	}

	@Test
	void ninetynine_givesXCIX() {
		ArabicNumber arabic = new ArabicNumber(99);
		assertEquals("XCIX", arabic.toRoman());
	}

	@Test
	void threehundredninetynine_givesCCCXCIX() {
		ArabicNumber arabic = new ArabicNumber(399);
		assertEquals("CCCXCIX", arabic.toRoman());
	}
	
	@Test
	void fivehundred_givesD() {
		ArabicNumber arabic = new ArabicNumber(500);
		assertEquals("D", arabic.toRoman());
	}

	@Test
	void fourhundred_givesCD() {
		ArabicNumber arabic = new ArabicNumber(400);
		assertEquals("CD", arabic.toRoman());
	}
	
	@Test
	void eighthundredninetynine_givesDCCCXCIX() {
		ArabicNumber arabic = new ArabicNumber(899);
		assertEquals("DCCCXCIX", arabic.toRoman());
	}

	@Test
	void thousand_givesM() {
		ArabicNumber arabic = new ArabicNumber(1000);
		assertEquals("M", arabic.toRoman());
	}
	
	@Test
	void ninehundredninetynine_givesCMXCIX() {
		ArabicNumber arabic = new ArabicNumber(999);
		assertEquals("CMXCIX", arabic.toRoman());
	}
	
	@Test
	void twothousandnineteen_givesMMXIX() {
		ArabicNumber arabic = new ArabicNumber(2019);
		assertEquals("MMXIX", arabic.toRoman());
	}
}
