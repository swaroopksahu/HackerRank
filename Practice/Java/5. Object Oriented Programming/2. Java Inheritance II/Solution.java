import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 
 * @author swaroopksahu
 * @category Introduction
 * @since June 2020
 * @version 1.0
 * @see <a href="https://github.com/swaroopksahu">GitHub - swaroopksahu</a>
 *
 */

class Arithmetic {
	int add(int a, int b) {
		return a + b;
	}
}

class Adder extends Arithmetic {
}

public class Solution {
	public static void main(String[] args) {
		Adder a = new Adder();

		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
		System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
	}
}