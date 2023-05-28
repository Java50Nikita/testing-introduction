package telran.strings.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void charAtTest() {
		String str = "Hello";
		assertEquals('H', str.charAt(0));
		assertEquals('o', str.charAt(4));
		assertEquals('l', str.charAt(2));
		assertEquals('c', 'e' - 2);
		assertEquals("Hello2", str + 2);
		
	}
	
	@Test
	void containsTest() {
		String str = "Hello";
		assertTrue(str.contains("H"));
		assertFalse(str.contains("h"));
		assertTrue(str.contains("ello"));
		assertFalse(str.contains("lelo"));
	}
	
	@Test
	void compareToTest() {
		String str = "car";
		assertTrue(str.compareTo("bar") > 0);
		assertTrue(str.compareTo("var") < 0);
		assertTrue(str.compareTo("car") == 0);
		assertTrue(str.compareTo("ca") > 0);
		assertTrue(str.compareTo("carb") < 0);
		assertTrue(str.compareTo("CAR") > 0);
	}
	
	@Test
	void compareToIgnoreCaseTest() {
		String str = "Lorem ipsum DolOr sit amet.";
		String str1 = "Lorem ipsUm dolor sit aMet.";
		String str2 = "Lorem ipSum doLor Sit.";
		String str3 = "Lorem ipsuM dolOr sIt amet, consectetur.";
		
		assertTrue(str.compareToIgnoreCase(str1) == 0);
		assertTrue(str.compareToIgnoreCase(str2) < 0);
		assertTrue(str.compareToIgnoreCase(str3) > 0);
		assertTrue(str2.compareToIgnoreCase(str3) > 0);
		assertTrue(str3.compareToIgnoreCase(str2) < 0);
		
	}
	
	@Test
	void concatTest() {
		String str = "Hello";
		assertEquals("HelloWorld", str.concat("World"));
		assertEquals("Hello World",str.concat(" World"));
		assertEquals("Hello ",str.concat(" "));
		assertEquals("Hello",str.concat(""));
		assertEquals("Hello!",str.concat("!"));
	}
	
	@Test
	void startsWithTest() {
		String str = "You shall not pass!";
		
		assertTrue(str.startsWith(str));
		assertTrue(str.startsWith("Y"));
		assertTrue(str.startsWith("You shall"));
		assertTrue(str.startsWith("not",10));
		assertTrue(str.startsWith(""));
		
		assertFalse(str.startsWith("X"));
		assertFalse(str.startsWith("You", 2));
	}
	
	@Test
	void endsWithTest() {
		String str = "You shall not pass!";
		
		assertTrue(str.endsWith(str));
		assertTrue(str.endsWith("!"));
		assertTrue(str.endsWith("not pass!"));
		assertTrue(str.endsWith(""));
		
		assertFalse(str.endsWith("You"));
		assertFalse(str.endsWith("car"));
		
	}
	
	@Test
	void equalsIgnoreCaseTest() {
		String str = "You shall not pass!";
		
		assertTrue(str.equalsIgnoreCase(str));
		assertTrue(str.equalsIgnoreCase("You ShaLL NoT PAsS!"));
		assertTrue(str.equalsIgnoreCase("you shall not pass!"));
		
		assertFalse(str.equalsIgnoreCase("You shall not pass"));
		assertFalse(str.equalsIgnoreCase("Lorem ipsum dolor sit amet."));
		
	}
	
	@Test
	void indexOfTest() {
		String str = "You shall not pass!";
		
		assertEquals(str.indexOf("shall"), 4);
		assertEquals(str.indexOf("You s"), 0);
		assertEquals(str.indexOf(" pass!"), 13);
		assertEquals(str.indexOf("shell"), -1);
	}
	
	@Test
	void lastIndexOfTest() {
		String str = "You shall not pass!";
		
		assertEquals(str.lastIndexOf('Y'), 0);
		assertEquals(str.lastIndexOf('s'), 17);
		assertEquals(str.lastIndexOf('!'), 18);
		assertEquals(str.lastIndexOf('l'), 8);
		
	}
	

}
