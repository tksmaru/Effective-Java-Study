package chapter5.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// クラス単位でパラメータ型を指定指定
public class GenericUnion<E> {

	/**
	 * Generic化したunion。<br>
	 * クラス単位で型パラメータを宣言することで、Setに入る引数の型を推量できる。<br>
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;
	}

	public static void main(String[] args) {
		Set<String> engineerAcademy = new HashSet<String>(Arrays.asList(
				"na-ga", "kosanad", "kidooom"));
		Set<String> papa = new HashSet<String>(Arrays.asList("kosanad",
				"tksmaru", "wataru420"));

		// コンストラクタで型を宣言しないといけないのでコード量が増える…
		GenericUnion<String> service = new GenericUnion<String>();
		Set<String> united = service.union(engineerAcademy, papa);
		System.out.println(united);
	}

}
