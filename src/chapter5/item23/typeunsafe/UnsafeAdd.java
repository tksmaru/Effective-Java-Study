package chapter5.item23.typeunsafe;

import java.util.ArrayList;
import java.util.List;

public class UnsafeAdd {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		unsafeAdd(strings, new Integer(42));
		String s = strings.get(0);
	}

	private static void unsafeAdd(List list, Object o) {
		list.add(o);
	}
}
