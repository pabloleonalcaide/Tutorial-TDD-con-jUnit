package main;

import java.util.Arrays;
import java.util.List;

/**
 * Example class to work with jUnit and TDD
 * 
 * @author pablo
 *
 */
public class RomanNumbers {

	private final static List<String> ROMAN_SIMBOLS = Arrays.asList("I", "V", "X", "L", "C", "D","M");

	/**
	 * Transform natural number into roman
	 * 
	 * @param natural number
	 * @return roman number
	 */
	public String naturalToRoman(Integer natural) {

		char[] charNumber = natural.toString().toCharArray();
		int inc = 0;
		String result = "";
		for (int i = charNumber.length -1; i >= 0 ; i--) {
			String roman = changeNumber(Character.getNumericValue(charNumber[i]), 0+inc, 1+inc, 2+inc);
			result = roman + result;
			inc +=2;
		}
		return result;

	}

	/**
	 * 
	 * @param startNumber
	 * @param naturalNumber
	 * @param startRomanNumber
	 * @param romanIncrement
	 * @return
	 */
	private String add(int startNumber, int naturalNumber, String startRomanNumber, String romanIncrement) {
		for (int i = startNumber; i <= naturalNumber; i++) {
			startRomanNumber += romanIncrement;
		}
		return startRomanNumber;
	}

	/**
	 * Convert unit
	 * 
	 * @param natural
	 * @return
	 */
	private String changeNumber(int natural, int x, int y, int z) {
		switch (natural) {
		case 4:
			return ROMAN_SIMBOLS.get(x) + ROMAN_SIMBOLS.get(y);
		case 9:
			return ROMAN_SIMBOLS.get(x) + ROMAN_SIMBOLS.get(z);
		}
		if (natural <= 3) {
			return add(1, natural, "", ROMAN_SIMBOLS.get(x));
		}
		if (natural <= 8) {
			return add(6, natural, ROMAN_SIMBOLS.get(y), ROMAN_SIMBOLS.get(x));
		}
		return null;

	}

}
