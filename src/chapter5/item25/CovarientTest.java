package chapter5.item25;

import java.util.Arrays;

/**
 * 配列が共変であることを確認します。
 * 
 * @author maruyama
 * 
 */
public class CovarientTest {

	public static void main(String[] args) {

		// 配列の初期化（よくやる実装）
		Integer[] number = new Integer[1];
		number[0] = new Integer(10);

		// 配列は共変なので、継承クラスIntegerの配列を親クラスObjectの配列に格納できる。
		Object[] covarientNumber = new Integer[1];
		// これは動く例
		covarientNumber[0] = new Integer(20);
		// Integerの配列にStringを入れようとしているがコンパイルエラーは発生しない
		// 実行時エラーが発生（ArrayStoreException）
		covarientNumber[0] = "I cannot fit in.";
		
	}

}
