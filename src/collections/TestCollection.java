package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestCollection {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(11, 111);
		map.put(22, 222);
		Collection collection = map.values();
		System.out.println(collection.toString());
	}
}
