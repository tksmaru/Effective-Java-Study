package chapter5.item26;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * スタックをジェネリック型で実装したクラス。<br>
 * スタックをArrayListで実装することで配列の使用を避けた例。<br>
 * でも、ArrayListの内部実装は配列なので実は大して変わってない。
 * 
 * @author maruyama
 * 
 * @param <E>
 */
public class GenericStack3<E> {

	/** スタック */
	private List<E> elements;
	/** 現在のスタックの要素数 */
	private int size = 0;
	/** スタックの初期サイズ */
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	/**
	 * コストラクタ。
	 */
	public GenericStack3() {
		// スタックをArrayListで実装することで型安全性を保証する
		elements = new ArrayList<E>(DEFAULT_INITIAL_CAPACITY);
	}

	/**
	 * スタックに要素を格納する。
	 * 
	 * @param e
	 */
	public void push(E e) {
		elements.add(e);
		size++;
	}

	/**
	 * スタックから要素を取り出す。
	 * 
	 * @return
	 */
	public E pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		E result = elements.remove(--size);
		return result;
	}

	/**
	 * スタックの要素が空かチェックする
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * スタックの簡単なテスト。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		GenericStack3<String> stack = new GenericStack3<String>();
		String[] input = { "1a", "2b", "3c", "4d" };
		for (String str : input) {
			stack.push(str);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop().toUpperCase());
		}
	}
}
