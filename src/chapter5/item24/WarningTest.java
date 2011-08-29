package chapter5.item24;

import java.util.HashSet;
import java.util.Set;

public class WarningTest {

	public static void main(String[] args) {

		// コンパイル時に下記の警告が出る
		// Multiple markers at this line
		// - Type safety: The expression of type HashSet needs unchecked conversion to conform to 
		// Set<String>
		// - HashSet is a raw type. References to generic type HashSet<E> should be parameterized
		Set<String> legacyCollections = new HashSet();
		legacyCollections.add("na_ga");

		// パラメータ化された型を使用することで警告が消える。
		Set<String> recentCollections = new HashSet<String>();
		recentCollections.add("kamyu_jp");
	}
}
