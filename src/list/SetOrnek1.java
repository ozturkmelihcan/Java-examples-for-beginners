package list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek1 {

	public static void main(String[] args) {
		// setlerin içinde unique veri tutabiliyoduk
		// boş
		// java i=3
		// tekrarEtmeyenler --> j , v
		// tekrar eden --> a

		// 2 tane set oluşturalım
		// tekrar edenler ve
		// tekrar etmeyenler
		// kullanıcdan bir kelime alcaz
		// eğer tekrar eden harf varsa tekrar edenlere atalım
		// ve tekrar etmeyenlerden çıkaralım
		// ve tekrar edenleri ve etmeyenleri yazdıralım

		Set<Character> tekrarEdenler = new HashSet<>();
		Set<Character> tekrarEtmeyenler = new HashSet<>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen kelime giriniz: ");
		String kelime = scanner.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			char c = kelime.charAt(i);
			if (!tekrarEdenler.contains(c) && !tekrarEtmeyenler.add(c)) {
				tekrarEdenler.add(c);
				tekrarEtmeyenler.remove(c);

			}

		}
		System.out.println("tekrar edenler: " + tekrarEdenler);
		System.out.println("tekrar etmeyenler: " + tekrarEtmeyenler);

	}

}
