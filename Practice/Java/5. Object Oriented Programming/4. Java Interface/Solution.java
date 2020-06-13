import java.util.*;

/**
 * 
 * @author swaroopksahu
 * @category Object Oriented Programming
 * @since June 2020
 * @version 1.0
 * @see <a href="https://github.com/swaroopksahu">GitHub - swaroopksahu</a>
 *
 */

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
	public int divisor_sum(int n) {
		int sum = 0;
		int sqrt = (int) Math.sqrt(n);
		for (int i = 1; i <= sqrt; i++) {
			if (n % i == 0) {
				sum += i + n / i;
			}
		}

		if (sqrt * sqrt == n) {
			sum -= sqrt;
		}
		return sum;
	}
}

class Solution {
	public static void main(String[] args) {
		MyCalculator my_calculator = new MyCalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(my_calculator.divisor_sum(n) + "\n");
		sc.close();
	}

	static void ImplementedInterfaceNames(Object o) {
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}
}
