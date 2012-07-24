package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonTest {

	public static void main(String[] args) {
		List list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		JSONArray array = JSONArray.fromObject(list);
//		System.out.println(array.optString(0));
//		System.out.println(array);
		
		Map map = new HashMap<String, String>();
		map.put("0", "a");
		map.put("1", "b");
		map.put("2", "c");
		
//		JSONObject jsonObject = JSONObject.fromObject(map);
//		System.out.println(jsonObject.get("2"));
		
		JsonBean jsonBean = new JsonBean();
		jsonBean.setAge(100);
		jsonBean.setName("name");
		
//		JSONObject jsonObject = JSONObject.fromObject(jsonBean);
//		System.out.println(jsonObject.get("age"));
	}
}
