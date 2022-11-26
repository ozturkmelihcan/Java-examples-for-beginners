package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOrnek1 {

	public static void main(String[] args) {
		// Birtane array list oluşturalım daha sonra bu arraylistin içine bi kaç tane
		// şehir adalım
		// daha sonra bu liste içinde an ile başlayan var ise bunu "xxx" ile
		// değiştirelim.

		ArrayList<String>list = new ArrayList<>();
		list.add("ankara");
		list.add("istanbul");
		list.add("antalya");
		list.add("eskişehir");
		list.add("sakarya");
		list.add("kocaeli");
		
//		for (int i = 0; i < list.size(); i++) {
//			String sehirler2 = list.get(i); 
//			if(list.get(i).startsWith("an")) {
//				
//				sehirler2 = list.get(i).replace("an", "xxx");
//				System.out.println(sehirler2);
//			}else {
//				
//			}
//		}
//		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).toLowerCase().startsWith("an")) {
				list.set(i, "xxx");
			}
			
		}for (String sehirler : list) {
			System.out.println(sehirler);
		}
		
	}

}
