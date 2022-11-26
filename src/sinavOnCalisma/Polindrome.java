package sinavOnCalisma;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		
		/* kullanıcıdan bır tane kelıme al
		 * aldıgımız bu kelımeyı kendı sectıgın collectıon sınıfından bır lısteye atacaksın 
		 * daha sonra bu kelımenın polındrome olup olmadıgına bakacaksın
		*/
		
		isPolindrome();
		
		
		
		
		
			
		}

	private static void isPolindrome() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("kelime gırınız");
		String kelime = scanner.nextLine();
		
		ArrayList<Character> polindrome = new ArrayList<>();
		
		boolean kontrol = true;
		
		for (int i = 0; i < kelime.length(); i++) {
			polindrome.add(kelime.charAt(i));
		}
		for (int i = 0; i < polindrome.size(); i++) {
			if(polindrome.get(i).equals(polindrome.get(polindrome.size()-1-i))) {
				
			}else {
				kontrol = false;
			}
		} if(kontrol==false) {
			System.out.println("polindrome değil");
		}else {
			System.out.println("polindrome");
		}
	}
		
	

	

	

}
