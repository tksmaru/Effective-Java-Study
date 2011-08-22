package chapter5.item23.legacy;

import java.util.Collection;
import java.util.Iterator;

import chapter5.item23.Coin;
import chapter5.item23.Stamp;

public class MyCollectionsTest {

	public static void main(String[] args) {

		MyCollections collections = new MyCollections();

		collections.add(new Stamp("見返り美人", 500));
		// MyCollectionsが想定しない誤った実装だが、コンパイラにはわからない
		collections.add(new Coin("ギザ10", 20));

		Collection stamps = collections.list();

		for (Iterator i = stamps.iterator(); i.hasNext();) {

			// Coinキャスト時にClassCastExceptionが発生する
			Stamp s = (Stamp) i.next();
			System.out.println("name  : " + s.getName());
			System.out.println("price : " + s.getPrice());
		}
	}
}
