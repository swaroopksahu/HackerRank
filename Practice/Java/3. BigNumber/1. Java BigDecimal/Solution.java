import java.math.BigDecimal;
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

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		/*
		 * We want to sort in descending order while preserving the contents of each
		 * String. A comparator can achieve this for us. We convert to BigDecimal inside
		 * our comparator so that the change is not permanent and our String's form for
		 * each number is preserved.
		 */
		Comparator<String> customComparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				BigDecimal a = new BigDecimal(s1);
				BigDecimal b = new BigDecimal(s2);
				return b.compareTo(a); // descending order
			}
		};

		Arrays.sort(s, 0, n, customComparator);

		// Ouput
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}