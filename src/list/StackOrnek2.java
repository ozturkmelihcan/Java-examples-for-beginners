package list;

import java.util.Scanner;
import java.util.Stack;

public class StackOrnek2 {

	static Stack<Character> polindrom = new Stack<>();

	public static void main(String[] args) {
		// Paramtre olarak String alan ve
		// girilen metnin her bir karakterini stacki içine atan bir method yazalım
		// method ismi palindrom olsun
		// sonra bu methodu bi kullanıp çıktsınıa bakalım
		// java

		// javakursu --> palindrom değil
		// ksabask--> palindrom

		// method ismi isPalindrom
		// bu girilen kelimenini palindrom olup olmadığını bulan method
		// eğer palindromsa true
		// değilse false döndürcek

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kelime = scanner.nextLine();
		polindrome(kelime);
		if (isPolindrome(kelime)) {
			System.out.println("polindromdur");
		} else {
			System.out.println("polindrom değil");
		}

	}

	public static boolean isPolindrome(String kelime) {
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) != polindrom.pop()) {
				return false;
			}
		}
		return true;
	}

	public static void polindrome(String kelime) {

		for (int i = 0; i < kelime.length(); i++) {
			polindrom.push(kelime.charAt(i));
		}
		for (Character character : polindrom) {
			System.out.println(character);
		}

	}

}
