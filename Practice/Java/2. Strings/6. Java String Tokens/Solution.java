import java.io.*;
import java.util.*;

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
		String s = scan.nextLine();
		scan.close();

		s = removeLeadingNonLetters(s);

		if (s.length() == 0) {
			System.out.println(0);
			return;
		}

		// Split on all non-alphabetic characters
		String[] words = s.split("[^a-zA-Z]+");

		System.out.println(words.length);
		for (String word : words) {
			System.out.println(word);
		}
	}

	private static String removeLeadingNonLetters(String str) {
		int i;
		for (i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				break;
			}
		}
		return str.substring(i);
	}
}
