package list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOrnek1 {

	public static void main(String[] args) {

		// character ve int tutan bir hashmap oluşturalım
		// kullanıcıdan bir kelime alalım
		// ve girilen kelimede hangi harften kaç tane var onu yazdıralım.

		// selamm
		// s-1
		// e-1
		// l-1
		// a-1
		// m-2

		Map<Character, Integer> map = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir kelime giriniz: ");
		String kelime = scanner.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			char c = kelime.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

	}

}
