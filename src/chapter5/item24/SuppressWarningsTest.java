package chapter5.item24;

import java.util.Arrays;

//無検査警告を無視する範囲は大きすぎてはいけない
//@SuppressWarnings("unchecked")
public class SuppressWarningsTest {

	private int size;
	private Object[] original;

	public <T> T[] toArray(T[] a) {
		if (a.length < size) {

			// 無検査キャストを行っているため、型安全性に欠ける実装
			// return (T[]) Arrays.copyOf(original, size, a.getClass());

			// return文は宣言ではないので、この形式ではコンパイルエラーが発生
			// @SuppressWarnings("unchecked")
			// return (T[]) Arrays.copyOf(original, size, a.getClass());

			// コンパイルエラーを発生させないためにはこうする
			// また、無検査警告の無視する範囲は最小限に留める
			@SuppressWarnings("unchecked")
			T[] result = (T[]) Arrays.copyOf(original, size, a.getClass());
			return result;
		}
		System.arraycopy(original, 0, a, 0, size);
		if (a.length > size) {
			a[size] = null;
		}
		return a;
	}
}
