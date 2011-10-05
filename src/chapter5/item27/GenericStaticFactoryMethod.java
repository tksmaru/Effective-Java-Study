package chapter5.item27;

import java.util.HashMap;
import java.util.Map;

public class GenericStaticFactoryMethod {

	// Generic static factory method
	public static <K, V> HashMap<K, V> getHashMap() {
		return new HashMap<K, V>();
	}

	public static void main(String[] args) {
		
		// 一般的なMapの宣言
		// 型の宣言を左右両方で行わないといけないので面倒…！
		Map<Integer, String> stringMap = new HashMap<Integer, String>();
		
		// GenericStaticFactoryMetodを使えば型宣言不要
		// 左側の宣言の内容から生成すべきHashMapの型をコンパイラが推論して自動的に生成してくれる
		Map<Integer, String> stringMap2 = GenericStaticFactoryMethod.getHashMap();
	}

}
