import java.util.Scanner;
import java.math.BigInteger;

/**
 * 
 * @author swaroopksahu
 * @category BigNumber
 * @since June 2020
 * @version 1.0
 * @see <a href="https://github.com/swaroopksahu">GitHub - swaroopksahu</a>
 *
 */

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger n = scan.nextBigInteger();
		scan.close();
		System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
	}
}

/*
 * NOTE: I use isProbablePrime() with certainty = 10 to achieve 99.9% accuracy.
 * However, even certainty = 1 (which achieves 50% accuracy) is enough to pass
 * the HackerRank test cases. isProbablePrime() is always 100% certain if it
 * tells you if a number is "not prime". If it says "prime", it's only 99.9%
 * certain. It may be the case that it just hasn't found a prime number number
 * that divides the BigInteger yet.
 */
