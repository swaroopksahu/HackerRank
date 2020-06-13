import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * 
 * @author swaroopksahu
 * @category Data Structures
 * @since June 2020
 * @version 1.0
 * @see <a href="https://github.com/swaroopksahu">GitHub - swaroopksahu</a>
 *
 */

class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap();
		while (n-- > 0) {
			String name = br.readLine();
			int phone = Integer.parseInt(br.readLine());
			map.put(name, phone);
		}

		String s;
		while ((s = br.readLine()) != null) {
			if (map.containsKey(s)) {
				System.out.println(s + "=" + map.get(s));
			} else {
				System.out.println("Not found");
			}
		}
		br.close();
	}
}
