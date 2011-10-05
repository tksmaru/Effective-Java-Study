package chapter5.item28;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GenericUnion {

	/**
	 * Setの和集合を返すメソッド。<br>
	 * 柔軟性を向上させる場合の実装
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;
	}

	public static void main(String[] args) {
		
		Set<Integer> intSet = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		Set<Float> floatSet = new HashSet<Float>(Arrays.asList(new Float(10.0), new Float(20.0), new Float(30.0)));

		// 型推論が上手くできないパターン
		Set<Number> numbers = union(intSet, floatSet);
		// 型推論を行うために型を明示する
		//Set<Number> numbers = GenericUnion.<Number>union(intSet, floatSet);
		System.out.println(numbers);
	}

}
