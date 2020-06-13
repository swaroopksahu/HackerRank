
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * 
 * @author swaroopksahu
 * @category Strings
 * @since June 2020
 * @version 1.0
 * @see <a href="https://github.com/swaroopksahu">GitHub - swaroopksahu</a>
 *
 */

// If a PatternSyntaxException is not thrown by Pattern.compile, the regular expresion is valid
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		scan.nextLine(); // gets rid of the pesky newline.
		while (testCases-- > 0) {
			String pattern = scan.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException exception) {
				System.out.println("Invalid");
			}
		}
		scan.close();
	}
}
