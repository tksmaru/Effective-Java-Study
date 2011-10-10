package chapter5.item29;

import java.util.HashMap;
import java.util.Map;

/**
 * 型安全な異種コンテナのサンプルコード
 * 型の制限を強化する場合の実装例
 * 
 * @author maruyama
 * 
 */
public class LimitedHeterogeneousContainer {

	private Map<Class<?>, Object> map = new HashMap<Class<?>, Object>();

	public <T extends Number> void put(Class<T> key, T value) {
		if (key == null) {
			throw new NullPointerException("key is null");
		}
		map.put(key, value);
	}

	public <T extends Number> T get(Class<T> key) {
		return key.cast(map.get(key));
	}

	/**
	 * 簡単なテストコード
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		LimitedHeterogeneousContainer container = new LimitedHeterogeneousContainer();

		container.put(Integer.class, 22);

		Integer num = container.get(Integer.class);
		System.out.println(num);

		// Numberを継承していないクラスは格納できない
		// container.put(String.class, "TestClass");
		// container.get(String.class);

	}
}
