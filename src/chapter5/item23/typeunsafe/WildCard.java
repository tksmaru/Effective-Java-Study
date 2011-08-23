package chapter5.item23.typeunsafe;

import java.util.Set;

public class WildCard {
	/**
	 * 非境界ワイルドカード型ー型案全で柔軟
	 */
	// Setの中身は何か
	static int numElementsInCommon(Set<?> s1, Set<?> s2) {
		int result = 0;
		for (Object o1 : s1) {
			if (s2.contains(o1)) {
				result++;
			}
		}
		return result;
	}
}
