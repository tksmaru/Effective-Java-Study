package chapter5.item29;

import java.util.HashMap;
import java.util.Map;

/**
 * 型安全な異種コンテナのサンプルコード
 * 
 * @author maruyama
 * 
 */
public class HeterogeneousContainer {

	private Map<Class<?>, Object> map = new HashMap<Class<?>, Object>();

	public <T> void put(Class<T> key, T value) {
		if (key == null) {
			throw new NullPointerException("key is null");
		}
		map.put(key, value);
	}

	public <T> T get(Class<T> key) {
		return key.cast(map.get(key));
	}

	/**
	 * 簡単なテストコード
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		HeterogeneousContainer container = new HeterogeneousContainer();

		container.put(String.class, "TestClass");
		container.put(Integer.class, 22);
		container.put(Exception.class, new Exception("Exception"));
		// クラスがキーになってるので、インスタンスは一つしか保持できない
		// container.add(Integer.class, 44);

		String test = container.get(String.class);
		System.out.println(test);
		Integer num = container.get(Integer.class);
		System.out.println(num);
		Exception e = container.get(Exception.class);
		System.out.println(e.getMessage());

	}
}
