package sinavOnCalisma;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapSoru1 {

	public static void main(String[] args) {
		// Static bir metod yazın.
		// Bir string içindeki karakterlerin sayısını bulan ve ekrana yazdıran bir metod
		// yazınız..

	//	karakterTekrari();
		enCokTekrarEdenKarakter();
	}

	private static void enCokTekrarEdenKarakter() {
		HashMap<Character, Integer> map1 = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen kelime giriniz....");
		String kelime = scanner.nextLine();
		int max = Integer.MIN_VALUE;
		char value ='\0';
		for (int i = 0; i < kelime.length(); i++) {
			char c = kelime.charAt(i);
			if(map1.containsKey(c)) {
				map1.put(c, map1.get(c)+1);
				if(map1.get(c)>max) {
					max = map1.get(c);
					value = c;
				}
			} else {
				map1.put(c, 1);
			}
		}if(max==Integer.MIN_VALUE ) {

			max =1;
			System.out.println("karakterler "   + max + " kere tekrar etmiştir."  );
		}else {
			System.out.println( value + " " + max);
		}
		
		
	}

	private static void karakterTekrari() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen kelime giriniz....");
		String kelime = scanner.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < kelime.length(); i++) {
			char c = kelime.charAt(i);

			if (map.containsKey(c)) {
				map.replace(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);

	}

}
