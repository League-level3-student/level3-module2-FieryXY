package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }

	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }

	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }
	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));	  
	}
	
	boolean isSquare(int value) {
		double sqrtActual = Math.sqrt(value);
		if(sqrtActual % 1 == 0) {
			return true;
		}
		return false;
	}
	boolean isCube(int value) {
		
		int loopTime = (int) Math.sqrt(value);
		for(int i = 0; i <= loopTime; i++) {
			if(i*i*i == value) {
				return true;
			}
		}
		
		return false;
	}
	boolean isPrime(int value) {
		
		for(int i = 2; i < value; i++) {
			if(value % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	String multiply(int v1, int v2) {
		String returnVal = "";
		returnVal = returnVal + String.valueOf(v1) + " x "+String.valueOf(v2)+" = "+String.valueOf(v1*v2);
		
		return returnVal;
	}


}
