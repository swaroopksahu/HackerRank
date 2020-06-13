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
		String str = scan.nextLine();
		scan.close();

		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(reversed) ? "Yes" : "No");

	}
}
