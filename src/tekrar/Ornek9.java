package tekrar;

import java.util.Scanner;

public class Ornek9 {

	public static void main(String[] args) {
		// Mevsim seçimi
		// switch ile 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir seçim yapınız...");
		int secim = scanner.nextInt();
		
		switch (secim) {
		case 12,1,2:
			System.out.println("kış");
			
			break;
		case 3,4,5:
			System.out.println("ilkbahar");
			break;
		case 6,7,8:
			System.out.println("yaz");
			break;
		case 9,10,11:
			System.out.println("Sonbahar");
			break;

		default:
			System.out.println("Seçiminizi kontrol ediniz...");
			break;
		}

	}

}
