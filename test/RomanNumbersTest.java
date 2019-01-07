package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import main.RomanNumbers;

class RomanNumbersTest {
	private RomanNumbers romanNumbers = new RomanNumbers();
	@Test
	public void pasar1Aromano() {
		String romano = romanNumbers.naturalToRoman(1);		
		assertEquals(romano, "I");
	}
	
	@Test
	public void pasar2Aromano() {
		String romano = romanNumbers.naturalToRoman(2);
		assertEquals(romano, "II");
	}
	
	@Test
	public void pasar3Aromano() {
		String romano = romanNumbers.naturalToRoman(3);
		assertEquals(romano, "III");
	}
	
	@Test
	public void pasar4Aromano() {
		String romano = romanNumbers.naturalToRoman(4);
		assertEquals(romano, "IV");
	}
	
	@Test
	public void pasar5Aromano() {
		String romano = romanNumbers.naturalToRoman(5);
		assertEquals(romano, "V");
	}
	@Test
	public void pasar6Aromano() {
		String romano = romanNumbers.naturalToRoman(6);
		assertEquals(romano, "VI");
	}
	@Test
	public void pasar7Aromano() {
		String romano = romanNumbers.naturalToRoman(7);
		assertEquals(romano, "VII");
	}
	@Test
	public void pasar8Aromano() {
		String romano = romanNumbers.naturalToRoman(8);
		assertEquals(romano, "VIII");
	}
	@Test
	public void pasar9Aromano() {
		String romano = romanNumbers.naturalToRoman(9);
		assertEquals(romano, "IX");
	}
	@Test
	public void pasar10Aromano() {
		String romano = romanNumbers.naturalToRoman(10);		
		assertEquals(romano, "X");
	}
	
	@Test
	public void pasar11Aromano() {
		String romano = romanNumbers.naturalToRoman(11);
		assertEquals(romano, "XI");
	}
	
	@Test
	public void pasar12Aromano() {
		String romano = romanNumbers.naturalToRoman(12);
		assertEquals(romano, "XII");
	}
	
	@Test
	public void pasar13Aromano() {
		String romano = romanNumbers.naturalToRoman(13);
		assertEquals(romano, "XIII");
	}
	
	@Test
	public void pasar14Aromano() {
		String romano = romanNumbers.naturalToRoman(14);
		assertEquals(romano, "XIV");
	}
	@Test
	public void pasar15Aromano() {
		String romano = romanNumbers.naturalToRoman(15);
		assertEquals(romano, "XV");
	}
	@Test
	public void pasar16Aromano() {
		String romano = romanNumbers.naturalToRoman(16);
		assertEquals(romano, "XVI");
	}
	@Test
	public void pasar17Aromano() {
		String romano = romanNumbers.naturalToRoman(17);
		assertEquals(romano, "XVII");
	}
	@Test
	public void pasar18Aromano() {
		String romano = romanNumbers.naturalToRoman(18);
		assertEquals(romano, "XVIII");
	}
	@Test
	public void pasar19Aromano() {
		String romano = romanNumbers.naturalToRoman(19);
		assertEquals(romano, "XIX");
	}
	@Test
	public void pasar20Aromano() {
		String romano = romanNumbers.naturalToRoman(20);
		assertEquals(romano, "XX");
	}
	
	@Test
	public void verify20to29() {
		List<Integer> naturalNumbers = Arrays.asList(20,21,22,23,24,25,26,27,28,29);
		
		List romanNumbersList = (List) ((Collection<Integer>) naturalNumbers).stream().
				map( number -> romanNumbers.naturalToRoman(number)).collect(Collectors.toList());
		
		assertEquals(romanNumbersList.get(0), "XX");
		assertEquals(romanNumbersList.get(1), "XXI");
		assertEquals(romanNumbersList.get(2), "XXII");
		assertEquals(romanNumbersList.get(3), "XXIII");
		assertEquals(romanNumbersList.get(4), "XXIV");
		assertEquals(romanNumbersList.get(5), "XXV");
		assertEquals(romanNumbersList.get(6), "XXVI");
		assertEquals(romanNumbersList.get(7), "XXVII");
		assertEquals(romanNumbersList.get(8), "XXVIII");
		assertEquals(romanNumbersList.get(9), "XXIX");
	}
	@Test
	public void verify30to39() {
		List<Integer> naturalNumbers = Arrays.asList(30,31,32,33,34,35,36,37,38,39);
		
		List romanNumbersList = (List) ((Collection<Integer>) naturalNumbers).stream().
				map( number -> romanNumbers.naturalToRoman(number)).collect(Collectors.toList());
		
		assertEquals(romanNumbersList.get(0), "XXX");
		assertEquals(romanNumbersList.get(1), "XXXI");
		assertEquals(romanNumbersList.get(2), "XXXII");
		assertEquals(romanNumbersList.get(3), "XXXIII");
		assertEquals(romanNumbersList.get(4), "XXXIV");
		assertEquals(romanNumbersList.get(5), "XXXV");
		assertEquals(romanNumbersList.get(6), "XXXVI");
		assertEquals(romanNumbersList.get(7), "XXXVII");
		assertEquals(romanNumbersList.get(8), "XXXVIII");
		assertEquals(romanNumbersList.get(9), "XXXIX");
	}
	@Test
	public void verifyTens() {
		List<Integer> naturalNumbers = Arrays.asList(40,50,60,70,80,90);
		
		List<String> romanNumbersList = ((Collection<Integer>) naturalNumbers).stream().
				map( number -> romanNumbers.naturalToRoman(number)).collect(Collectors.toList());
		
		assertEquals(romanNumbersList.get(0), "XL");
		assertEquals(romanNumbersList.get(1), "L");
		assertEquals(romanNumbersList.get(2), "LX");
		assertEquals(romanNumbersList.get(3), "LXX");
		assertEquals(romanNumbersList.get(4), "LXXX");
		assertEquals(romanNumbersList.get(5), "XC");
	}
	
	@Test
	public void verifyRomans() {
		List<Integer> naturalNumbers = Arrays.asList(100,200,300,400,500,600,700,800,900);
		
		List<String> romanNumbersList = ((Collection<Integer>) naturalNumbers).stream().
				map( number -> romanNumbers.naturalToRoman(number)).collect(Collectors.toList());
		
		assertEquals(romanNumbersList.get(0), "C");
		assertEquals(romanNumbersList.get(1), "CC");
		assertEquals(romanNumbersList.get(2), "CCC");
		assertEquals(romanNumbersList.get(3), "CD");
		assertEquals(romanNumbersList.get(4), "D");
		assertEquals(romanNumbersList.get(5), "DC");
		assertEquals(romanNumbersList.get(6), "DCC");
		assertEquals(romanNumbersList.get(7), "DCCC");
		assertEquals(romanNumbersList.get(8), "CM");
	} 
}
