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
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(i + " " + s);
			i++;
		}
	}
}
