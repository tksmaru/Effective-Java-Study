package chapter5.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.List;

/**
 * スタックをジェネリック型で実装したクラス。<br>
 * 
 * @param <E>
 */
public class GenericStack<E> implements Stack<E> {

	/** スタック */
	private List<E> elements;
	/** 現在のスタックの要素数 */
	private int size = 0;
	/** スタックの初期サイズ */
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public GenericStack() {
		// スタックをArrayListで実装することで型安全性を保証する
		elements = new ArrayList<E>(DEFAULT_INITIAL_CAPACITY);
	}

	@Override
	public void push(E e) {
		elements.add(e);
		size++;
	}

	@Override
	public E pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		E result = elements.remove(--size);
		return result;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	// FIXME 一見正しいけど不十分な実装
	public void pushAll(Iterable<E> src) {
	// public void pushAll(Iterable<? extends E> src) {
		for (E element : src) {
			push(element);
		}
	}

	@Override
	// FIXME 一見正しいけど不十分な実装
	public void popAll(Collection<E> dst) {
	// public void popAll(Collection<? super E> dst) {
		while (!isEmpty()) {
			dst.add(pop());
		}
	}

	/**
	 * スタックの簡単なテスト。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Number型のStackを生成
		Stack<Number> stack = new GenericStack<Number>();
		stack.push(new Integer(10));
		stack.push(new Float(5.5));

		Collection<Integer> numberList = new ArrayList<Integer>();
		numberList.add(18);
		// 動かない例（コンパイルエラー）
		stack.pushAll(numberList);// 不変ゆえにCollection<Number>とCollection<Integer>は別物

		Collection<Object> list = new ArrayList<Object>();
		// これも動かない例（コンパイルエラー）
		stack.popAll(list);// 不変ゆえにCollection<Number>とCollection<Object>は別物

		for (Object obj : list) {
			System.out.println(obj);
		}

	}

}