import java.util.Scanner;

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
		
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		scan.close();

		// Sum lengths
		System.out.println(A.length() + B.length());

		// Compare lexicographical ordering
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

		// Print the Strings in desired format
		System.out.println(capFirstLetter(A) + " " + capFirstLetter(B));
	}

	private static String capFirstLetter(String str) {
		if (str == null || str.length() == 0) {
			return "";
		} else {
			return str.substring(0, 1).toUpperCase() + str.substring(1);
		}
	}
}
