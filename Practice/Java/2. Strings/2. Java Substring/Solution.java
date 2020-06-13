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

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int start = in.nextInt();
		int end = in.nextInt();

		in.close();
		System.out.println(str.substring(start, end));
	}
}
