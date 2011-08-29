package chapter5.item24;

import java.util.Arrays;

//@SuppressWarnings("unchecked")
// 無検査警告を無視する範囲は大きすぎてはいけない
public class SuppressWarningsTest {

	private int size;
	private Object[] original;

	public <T> T[] toArray(T[] a) {
		if (a.length < size) {
			// Type safety: Unchecked cast from Object[] to T[]
			return (T[]) Arrays.copyOf(original, size, a.getClass());

			// return文は宣言ではないので、この形式ではコンパイルエラーが発生
			// @SuppressWarnings("unchecked")
			// return (T[]) Arrays.copyOf(original, size, a.getClass());

			// コンパイルエラーを発生させないためには
			// @SuppressWarnings("unchecked")
			// T[] result = (T[]) Arrays.copyOf(original, size, a.getClass());
			// return result;
		}
		System.arraycopy(original, 0, a, 0, size);
		if (a.length > size) {
			a[size] = null;
		}
		return a;
	}
}
