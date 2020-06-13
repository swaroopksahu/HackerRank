import java.util.Scanner;

public class Solution {

	/**
	 * 
	 * @author swaroopksahu
	 * @category Introduction
	 * @since June 2020
	 * @version 1.0
	 * @see <a href="https://github.com/swaroopksahu">GitHub - swaroopksahu</a>
	 *
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			System.out.printf("%-14s %03d\n", s1, x);
		}
		System.out.println("================================");
	}
}
