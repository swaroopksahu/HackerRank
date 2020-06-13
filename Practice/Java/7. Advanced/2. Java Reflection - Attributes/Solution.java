import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

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
		Class student = Student.class; // uses class literal, not a function.
		Method[] methods = student.getDeclaredMethods();

		ArrayList<String> methodNames = new ArrayList();
		for (Method method : methods) {
			methodNames.add(method.getName());
		}

		Collections.sort(methodNames);
		for (String name : methodNames) {
			System.out.println(name);
		}
	}
}