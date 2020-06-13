import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

/**
 * 
 * @author swaroopksahu
 * @category Advanced
 * @since June 2020
 * @version 1.0
 * @see <a href="https://github.com/swaroopksahu">GitHub - swaroopksahu</a>
 *
 */

class Singleton {
	public String str;
	private static Singleton obj;

	private Singleton() {
	}

	public static synchronized Singleton getSingleInstance() {
		if (obj == null) {
			obj = new Singleton();
		}
		return obj;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return obj;
	}
}