import java.util.Scanner;
import java.util.LinkedList;

/**
 * 
 * @author swaroopksahu
 * @category Data Structures
 * @since June 2020
 * @version 1.0
 * @see <a href="https://github.com/swaroopksahu">GitHub - swaroopksahu</a>
 *
 */

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		LinkedList<Integer> list = new LinkedList();
		for (int i = 0; i < N; i++) {
			int value = scan.nextInt();
			list.add(value);
		}

		/* Perform queries on Linked List */
		int Q = scan.nextInt();
		for (int i = 0; i < Q; i++) {
			String action = scan.next();
			if (action.equals("Insert")) {
				int index = scan.nextInt();
				int value = scan.nextInt();
				list.add(index, value);
			} else {
				int index = scan.nextInt();
				list.remove(index);
			}
		}
		scan.close();

		// Print our updated Linked List
		for (Integer num : list) {
			System.out.print(num + " ");
		}
	}
}
