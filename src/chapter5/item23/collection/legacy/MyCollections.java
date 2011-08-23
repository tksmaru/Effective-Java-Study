package chapter5.item23.collection.legacy;

import java.util.ArrayList;
import java.util.Collection;

import chapter5.item23.collection.MyCollection;

public class MyCollections {

	/**
	 * <Legacy Code -Java 1.4> 私の切手コレクション。Stampインスタンスだけを含んでいる。
	 */
	private final Collection stamps = new ArrayList();

	public MyCollections() {
	}

	public void add(MyCollection collection) {
		// コンパイルは通るけど、警告が出まくってます。
		stamps.add(collection);
	}

	public Collection list() {
		return stamps;
	}

}
