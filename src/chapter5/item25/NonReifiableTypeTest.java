package chapter5.item25;

import java.util.ArrayList;
import java.util.List;

/**
 * 具象化不可能型のテスト
 * 
 * @author maruyama
 * 
 */
public class NonReifiableTypeTest {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("test 1");
		stringList.add("test 2");
		stringList.add("test 3");

		String[] test = (String[])stringList.toArray();
		
	}
}
