package chapter5.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RawUnion {

	/**
	 * 原型を使用したSetの和集合を返すメソッド。<br>
	 * 各所に警告が登場している。
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static Set union(Set s1, Set s2) {
		Set result = new HashSet(s1);
		result.addAll(s2);
		return result;
	}

	public static void main(String[] args) {
		Set engineerAcademy = new HashSet(Arrays.asList("na-ga", "kosanad",
				"kidooom"));
		Set papa = new HashSet(Arrays.asList("kosanad", "tksmaru", "wataru420"));

		Set united = union(engineerAcademy, papa);
		System.out.println(united);
	}

}
