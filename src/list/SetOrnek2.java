package list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SetOrnek2 {

	public static void main(String[] args) {
		// character ve int tutan bir hashmap olusturalım
				// kullanıcıdan bir kelime alalım
				// ve girilen kelimede hangı harften kac tane var onu yazdıralım.

		Map<Character, Integer> hashMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz...");
		String kelime = scanner.nextLine();
		
		for (int i = 0; i < kelime.length(); i++) {
			
			char c = kelime.charAt(i);
			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			
			}else {
				hashMap.put(c,1);
				
			}
		}System.out.println(hashMap);
		
	}

}
