package charSorulari;

import java.util.HashMap;

public class Char {

	public static void main(String[] args) {

		String s = "her yaşın bir güzelliği var.";

		tekrarEdenleriBul(s);

	}

	private static void tekrarEdenleriBul(String s) {
		HashMap<Character, Integer> tekrar = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (tekrar.containsKey(ch)) {
				tekrar.put(ch, tekrar.get(ch) + 1);
				System.out.println(ch);
				break;
			} else {
				tekrar.put(ch, 1);
				
			}
		}
		System.out.println(s);
		System.out.println(tekrar);

	}

}
