package chapter5.item25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ジェネリック配列が作成できないことを確認します。
 * 
 * @author maruyama
 * 
 */
public class GenericArrayNotAllowedTest {

	public static void main(String[] args) {

		// ジェネリック型の配列は作成できない
		List<E>[] genericList = new List<E>[1];

		// 型パラメータの配列も作成できない
		List<String>[] stringList = new List<String>[1];

		Object[] object = stringList;
		
		List<Integer> intList = Arrays.asList(42);
		
		object[0] = intList;
		
		String s = stringList[0].get(0);
		
		// Eはそもそも型として解決できない
		E[] elementArray = new E[1];
		
		// 非境界ワイルドカード型の配列はOK -> 型安全が保証されているから
		List<?>[] wildCardList = new List<?>[1];
		
		wildCardList[0] = new ArrayList<String>();

		Object[] objects = new Object[1];
		wildCardList[0] = objects;
		
		//new ArrayList();
	}

}
