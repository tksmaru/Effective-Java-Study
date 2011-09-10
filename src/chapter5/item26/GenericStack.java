package chapter5.item26;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * スタックをジェネリック型で実装したクラス。<br>
 * コンストラクタでelementsを初期化する際にObject型の配列をキャストするパターンで実装した場合。
 * 
 * @param <E>
 */
public class GenericStack<E> {

	/** スタック */
	private E[] elements;
	/** 現在のスタックの要素数 */
	private int size = 0;
	/** スタックの初期サイズ */
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	/**
	 * デフォルトコストラクタ。
	 */
	@SuppressWarnings("unchecked")
	public GenericStack() {
		// elements 配列はpush(E)からのEインスタンスのみを含む。
		// そのことは、型安全性を保証するためには十分であるが、配列の
		// 実行時の型はE[]ではない。常にObject[]である。
		elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
	}

	/**
	 * スタックに要素を格納する。
	 * 
	 * @param e
	 */
	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
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
		E result = elements[--size];
		elements[size] = null;// 廃れた参照を除く
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
	 * スタックがいっぱいだった場合にスタックの容量を拡張する。
	 */
	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}

	/**
	 * スタックの簡単なテスト。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		GenericStack<String> stack = new GenericStack<String>();
		String[] input = { "1a", "2b", "3c", "4d" };
		for (String str : input) {
			stack.push(str);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop().toUpperCase());
		}
	}
}
