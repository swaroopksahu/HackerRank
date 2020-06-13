import java.util.Scanner;
import java.util.ArrayList;

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
		int n = scan.nextInt();

		// Save numbers in 2-D ArrayList
		ArrayList<ArrayList<Integer>> lists = new ArrayList();
		for (int row = 0; row < n; row++) {
			int d = scan.nextInt();
			ArrayList<Integer> list = new ArrayList();
			for (int col = 0; col < d; col++) {
				list.add(scan.nextInt());
			}
			lists.add(list);
		}

		//Solution
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			ArrayList<Integer> list = lists.get(x - 1);
			if (y <= list.size()) {
				System.out.println(list.get(y - 1));
			} else {
				System.out.println("ERROR!");
			}
		}

		scan.close();
	}
}