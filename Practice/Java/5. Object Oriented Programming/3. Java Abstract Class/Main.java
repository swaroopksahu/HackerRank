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

abstract class Book {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}

}

class MyBook extends Book {
	@Override
	void setTitle(String s) {
		title = s;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitle());
		sc.close();

	}
}