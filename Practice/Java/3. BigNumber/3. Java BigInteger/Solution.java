import java.io.*;
import java.util.*;
import java.math.BigInteger;

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
		BigInteger a = new BigInteger(scan.next());
		BigInteger b = new BigInteger(scan.next());
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
	}
}
