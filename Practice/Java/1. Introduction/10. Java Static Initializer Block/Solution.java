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

public class Solution {

	public static boolean flag = true;
	public static int B;
	public static int H;
	static {

		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();

		if (B < 0 || H < 0) {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		if (B == 0 && H == 100) {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class