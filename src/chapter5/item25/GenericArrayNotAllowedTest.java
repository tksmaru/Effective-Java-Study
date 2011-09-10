package chapter5.item25;

import java.util.ArrayList;
import java.util.List;

/**
 * ジェネリック配列が作成できないことを確認します。
 */
public class GenericArrayNotAllowedTest {

	public static void main(String[] args) {

		// ジェネリック型の配列は作成できない
		// List<E>[] genericList = new List<E>[1];

		// 型パラメータの配列も作成できない
		// List<String>[] stringList = new List<String>[1];

		// Elementはそもそも型として解決できない
		// E[] elementArray = new E[1];

		// 非境界ワイルドカード型の配列はOK
		// 何かのオブジェクトだけが入ったListであることが保証されているので、型安全が保証されている
		List<?>[] wildCardList = new List<?>[1];
		// パラメータ化された型は当然代入できる
		wildCardList[0] = new ArrayList<String>();

		// 想定しない方が格納されようとするとコンパイルエラーが発生する
		// wildCardList[0] = new HashMap<String, String>();

	}

}
