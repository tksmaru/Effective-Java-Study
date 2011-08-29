package chapter5.item23.collection.recent;

import java.util.ArrayList;
import java.util.Collection;

import chapter5.item23.collection.Stamp;

public class MyCollections {

	// Collectionに格納できるObjectの型を指定する
	private final Collection<Stamp> stamps = new ArrayList<Stamp>();

	public MyCollections() {
	}

	public void add(Stamp collection) {
		stamps.add(collection);
	}

	public Collection<Stamp> list() {
		return stamps;
	}
}
