package collections;

import java.util.ArrayList;

public class ArrayListOrnek1 {

	public static void main(String[] args) {
		// Birtane array list oluşturalım daha sonra bu arraylistin içine bi kaç tane
		// şehir adalım
		// daha sonra bu liste içinde an ile başlayan var ise bunu "xxx" ile
		// değiştirelim.

		
		ArrayList<String> sehir = new ArrayList<>();
		sehir.add("kayseri");
		sehir.add("Ankara");
		sehir.add("antalya");
		sehir.add("adıyaman");
		
		for (int i = 0; i < sehir.size(); i++) {
			if(sehir.get(i).toLowerCase().startsWith("an")) {
				 String ssehir = sehir.get(i).toLowerCase().replace("an", "xxx");
				
				System.out.println(ssehir);
			}
			
		}
		
		System.out.println("-------------------------------------------");
		
		for (int i = 0; i < sehir.size(); i++) {
			if(sehir.get(i).toLowerCase().startsWith("an")) {
				sehir.set(i, "xxx");
				
			}
		}
	
		for(String string : sehir) {
			System.out.println(string);
		}
		
	}

}
