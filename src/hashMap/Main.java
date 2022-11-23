package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {


		HashMap b = new HashMap();
		
		b.put("türkiye", "ankara");
		b.put("fransa", "paris");
		b.put("ingiltere", "londra");
		System.out.println(b.get("türkiye"));
		Set s = b.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + " => " + item.getValue());
		}

	}

}
