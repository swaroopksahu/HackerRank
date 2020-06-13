import java.util.Scanner;
import java.util.InputMismatchException;

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
		try {
			int x = scan.nextInt();
			int y = scan.nextInt();
			System.out.println(x / y);
		} catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
		} catch (ArithmeticException e) {
			System.out.println(e.getClass().getName() + ": / by zero");
		}
	}
}
