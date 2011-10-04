package chapter5.item27.appendix2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RecursiveTypeBound {

	/**
	 * 引数List内で最も大きい要素を返します。
	 * 
	 * @param <T>
	 * @param list
	 * @return
	 */
	public static <T extends Comparable<T>> T max(List<T> list) {
		Iterator<T> i = list.iterator();
		T result = i.next();
		while (i.hasNext()) {
			T t = i.next();
			if (t.compareTo(result) > 0)
				result = t;
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> argList = Arrays.asList("3", "1", "2");
		System.out.println(max(argList));
	}
}
