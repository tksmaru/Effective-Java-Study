package chapter5.item23.typeunsafe;

import java.util.HashSet;
import java.util.Set;

public class WildCardTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> member1 = new HashSet<String>();
		member1.add("na_ga");
		member1.add("kamyu_jp");
		member1.add("kidooom");
		member1.add("tksmaru");
		
		Set<String> member2 = new HashSet<String>();
		member2.add("wataru420");
		member2.add("kosanad");
		member2.add("tksmaru");

		int number = WildCard.numElementsInCommon(member1, member2);
		System.out.println("number : " + number);
		
		Set<Integer> member1age = new HashSet<Integer>();
		member1age.add(5);
		member1age.add(4);
		member1age.add(3);
		
		int number2 = WildCard.numElementsInCommon(member1, member1age);
		System.out.println("number2 : " + number2);
		
		
	}

}
