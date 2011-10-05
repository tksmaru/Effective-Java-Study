package chapter5.item28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swap {

	/**
	 * リストの順番を入れ替える
	 * 
	 * @param list
	 * @param i
	 *            置き換え対象①
	 * @param j
	 *            置き換え対象②
	 */
	public static <E> void swap(List<E> list, int i, int j) {
	//public static void swap(List<?> list, int i, int j) {
		// より一般的なListを扱いたいのであれば、型を固定するよりは
		// 非境界ワイルドカード型を使用すべき
		
		// 非境界型にすると怒られる
		list.set(i, list.set(j, list.get(i)));

		//swapHelper(list, i, j);
	}

	private static <E> void swapHelper(List<E> list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList("1","2","3","4"));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//順序を入れ替える
		swap(list, 0, 2);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
