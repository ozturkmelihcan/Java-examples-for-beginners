package key;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		/*
		 * İnsanlar sınfı aç , isim ve yas
		 * map sınıfından kendın hangısını secrsen sec bır lıste olustur. 
		 * key : nesneler => value : türkiye;
		 * yaşa göre en genc olanı ılk sırada yaz
		 * ali 18 türkiye 
		 * melihcan 21 hollanda
		 * emre 24 polonya
		 * mert 35 fransa 
		 * 
		 */

		Insanlar insan1 = new Insanlar("ali" , 18);
		Insanlar insan2 = new Insanlar("melihcan" , 21);
		Insanlar insan3 = new Insanlar("mert" , 24);
		Insanlar insan4 = new Insanlar("buse" , 78);
		Insanlar insan5 = new Insanlar("furkan" , 45);
		
		TreeMap<Insanlar, String> map = new TreeMap<>(new Comparator<Insanlar>() {
			
		
			@Override
			public int compare(Insanlar o1, Insanlar o2) {
				if(o1.getName().charAt(0)>o2.getName().charAt(0)) {				// alfabetik sıralama ıcın ılk ındexlerı karsılastır.
					return 1;
				}else if(o1.getName().charAt(0)<o2.getName().charAt(0)) {
					return -1;
				}else {
					return 0;
				}
				
			}
		
		});
			map.put(insan1, "türkiye");
			map.put(insan2, "almanya");
			map.put(insan3, "fransa");
			map.put(insan4, "senegal");
			map.put(insan5, "rusya");
		
			System.out.println(map);
		
	

	}
}
