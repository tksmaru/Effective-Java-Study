package chapter5.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GenericMethodUnion {

	/**
	 * ジェネリックメソッド化したunion。<br>
	 * staticメソッドの場合は、メソッド修飾子と戻り値の型の間に使用する型パラメータを宣言する。
	 * 
	 * @param <E>
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;
	}

	public static void main(String[] args) {
		Set<String> engineerAcademy = new HashSet<String>(Arrays.asList(
				"na-ga", "kosanad", "kidooom"));
		Set<String> papa = new HashSet<String>(Arrays.asList("kosanad",
				"tksmaru", "wataru420"));

		// ジェネリックメソッドにすると、型パラメータの宣言が不要になる
		// 例ではstaticメソッドで扱っているが、通常のメソッドでも同様
		Set<String> united = GenericMethodUnion.union(engineerAcademy, papa);
		System.out.println(united);
	}
}
