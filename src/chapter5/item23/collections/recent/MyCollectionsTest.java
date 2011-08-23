package chapter5.item23.collections.recent;

import java.util.Collection;

import chapter5.item23.collection.Stamp;

public class MyCollectionsTest {

	public static void main(String[] args) {

		MyCollections collections = new MyCollections();

		collections.add(new Stamp("見返り美人", 500));
		collections.add(new Stamp("富嶽三十六景", 400));
		// MyCollectionsが想定しない誤った実装なので、コンパイルが通らない
		//collections.add(new Coin("ギザ10", 20));

		Collection<Stamp> stamps = collections.list();

		for (Stamp s : stamps) {
			System.out.println("name  : " + s.getName());
			System.out.println("price : " + s.getPrice());
		}
	}
}
