package chapter5.item29;

import java.util.HashMap;
import java.util.Map;

/**
 * 型安全ではない異種コンテナのサンプルコード
 * 
 * @author maruyama
 * 
 */
public class TypeUnsafeContainer {

	/**
	 * 簡単なテストコード
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, Object> unsafeContainer = new HashMap<String, Object>();

		unsafeContainer.put("String", "TestClass");
		unsafeContainer.put("Integer", 22);
		unsafeContainer.put("Exception", new Exception("Exception"));

		String test = (String) unsafeContainer.get("String");
		System.out.println(test);

	}
}
