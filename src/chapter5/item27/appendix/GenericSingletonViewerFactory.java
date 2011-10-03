package chapter5.item27.appendix;

/**
 * ジェネリックシングルトンファクトリーパターンを使用することで<br>
 * 任意の型を扱うシングルトンを作成することができる例を示す。
 * 
 * @author maruyama
 * 
 * @param <T>
 */
public class GenericSingletonViewerFactory<T> {

	//
	private static Viewer<Object> VIEWER = new Viewer<Object>() {
		@Override
		public Object view(Object args) {
			return args;
		}
	};

	// VIEWERはステートレスであり、かつ型を限定していない（非境界）ので、
	// 全ての型に対して1つのインスタンスを共有しても安全
	@SuppressWarnings("unchecked")
	public static <T> Viewer<T> getViewer() {
		return (Viewer<T>) VIEWER;
	}

	// 簡単なテスト
	public static void main(String[] args) {

		String[] strings = { "jute", "hemp", "nylon" };
		Viewer<String> stringViewer = GenericSingletonViewerFactory.getViewer();
		for (String s : strings) {
			System.out.println(stringViewer.view(s));
		}

		Number[] numbers = { 1, 2.0, 3L };
		Viewer<Number> numberViewer = GenericSingletonViewerFactory.getViewer();
		for (Number n : numbers) {
			System.out.println(numberViewer.view(n));
		}

		// 同一インスタンスであることの確認
		// viewer取得時にキャストをかけているので==で同一オブジェクトであることを検査できないが、
		// ハッシュ値は同一のはず。
		if (stringViewer.hashCode() == numberViewer.hashCode()) {
			System.out.println("StringViewer : " + stringViewer.hashCode());
			System.out.println("numberViewer : " + numberViewer.hashCode());
		}
	}
}
