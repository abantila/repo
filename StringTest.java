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
package junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test() {
		java.lang.String randomText = "Hi, I'm Alexis! Have a wonderful summer break! :)";

        // Testing length method
        System.out.println(randomText.length());
        // Testing charAt method
        System.out.println(randomText.charAt(9));
        // Testing substring method
        System.out.println(randomText.substring(8,14));
        // Testing indexOf method
        System.out.println(randomText.indexOf("break"));
	}
}
