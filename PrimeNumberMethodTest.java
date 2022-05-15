/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: (Give a brief description for each Program)
 * Due: May 16, 2022
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Name: Alexis Bantilan
*/

package junittest1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/** This class models if a number is prime*/ 
class PrimeNumberMethodTest {

	@Test /** Default method */
	void test() {
		System.out.println("Is the number prime?\n");
		System.out.println("23: " + isPrime(23)); // Invoke isPrime method and pass integer 23 
		System.out.println("12: " + isPrime(12)); // Invoke isPrime method and pass integer 12 
	}
	       /** Find if the number is prime or not */
	       public static boolean isPrime(int number) {
	   	    for (int divisor = 2; divisor <= number / 2; divisor++) {
	   	      if (number % divisor == 0) { // If true, number is not prime
	   	        return false; // number is not a prime
	   	      }
	   	    }
	   	    return true; // number is prime
	}
}
