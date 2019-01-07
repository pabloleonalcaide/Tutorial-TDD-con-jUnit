package main;
/**
 * Example class to work with jUnit and TDD
 * @author pablo
 *
 */
public class RomanNumbers {

	/**
	 * Transform natural number into roman
	 * @param natural number
	 * @return roman number
	 */
	public String naturalToRoman(Integer natural) { 
		
		char[] charNumber = natural.toString().toCharArray();
		
		if(charNumber.length >= 2) {
			String romanUnit = sendUnit(Character.getNumericValue(charNumber[1]));
			String romanTen = sendTens(Character.getNumericValue(charNumber[0]));
			return romanTen + romanUnit;
			
		}else if (charNumber.length == 1) {
			return sendUnit(Character.getNumericValue(charNumber[0]));
		}		
		return null;
	}
	
	/**
	 * Convert unit
	 * @param natural
	 * @return
	 */
	private String sendUnit(int natural) {
		switch (natural) {
			case 4: return "IV";
			case 9: return "IX";
		}
		if(natural <= 3) {
			return addI(1, natural, "");
		}
		if (natural <= 8) {
			return addI(6, natural, "V");
		}
		return null;
	}
	/**
	 * 
	 * @param startNumber
	 * @param naturalNumber
	 * @param startRomanNumber
	 * @return
	 */
	private String addI(int startNumber, int naturalNumber, String startRomanNumber) {
		String result = startRomanNumber;
		for(int i=startNumber; i<= naturalNumber; i++) {
			result += "I";
		}
		return result;
		
	}
	/**
	 * 
	 * @param startNumber
	 * @param naturalNumber
	 * @param startRomanNumber
	 * @return
	 */
	private String addX(int startNumber, int naturalNumber, String startRomanNumber) {
		String result = startRomanNumber;
		for(int i=startNumber; i<= naturalNumber; i++) {
			result += "X";
		}
		return result;
		
	}
	/**
	 * 
	 * @param ten
	 * @return
	 */
	private String sendTens(int ten) {
		switch (ten) {
			case 4: return "XL";
			case 9: return "XC";
		}
		if(ten <= 3) {
			return addX(1, ten, "");
		}
		if (ten <= 8) {
			return addX(6, ten, "L");
		}
		return null;
	}
}
