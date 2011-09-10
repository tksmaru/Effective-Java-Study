package chapter5.item25;


/**
 * 配列が共変であることを確認します。
 */
public class CovarientTest {

	public static void main(String[] args) {

		// 配列の初期化（よく見るタイプ）
		Integer[] intArray = new Integer[1];
		intArray[0] = new Integer(10);
		System.out.println("intArray : " + intArray[0]);

		// 共変を利用した配列の初期化
		// 配列は共変なので、継承クラスIntegerの配列を親クラスObjectの配列に格納できる。
		Object[] covarientArray = new Integer[1];
		// これは動く例
		covarientArray[0] = new Integer(20);
		System.out.println("covariantArray(integer) : " + covarientArray[0]);

		// 共変の問題点
		// Integerの配列にStringを入れようとしているがコンパイル時には問題を検知できない
		// 実行時エラーが発生（ArrayStoreException）
		covarientArray[0] = "I cannot fit in.";

	}

}
