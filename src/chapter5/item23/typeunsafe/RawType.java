package chapter5.item23.typeunsafe;

import java.util.Set;

public class RawType {

	/**
	 * 原型を使用している（非推奨）
	 */
	static int numElementsInCommon(Set s1, Set s2) {
		int result = 0;
		for (Object o1 : s1) {
			if (s2.contains(o1)) {
				result++;
			}
		}
		return result;
	}
}
