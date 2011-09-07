package sandbox;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer number = new Integer(500);
		System.out.println(number.getClass());
		System.out.println(number.getClass().getName());
		
		List<String> list = new ArrayList<String>();
		System.out.println(list.getClass());
		
	}

}
