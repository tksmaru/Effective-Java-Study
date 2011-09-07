package chapter5.item23.collection.recent;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		
		List<Date> dateList = new ArrayList<Date>();
		// 想定する利用
		dateList.add(new Date(System.currentTimeMillis()));
		// ありうる問題（コンパイル時にエラーになる…）
		java.util.Date test = new Date(System.currentTimeMillis());
		dateList.add(test);
	}

}
