package tekrar;

import java.util.Scanner;

public class Ornek8 {

	public static void main(String[] args) {
		// 	// işlem seçiniz
		// 1: toplama 2:çıkarma 3:bölme 4:çarpma
		// switch kullanarak yapınız...
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 ile 4 arasında seçim yapınız...");
		int secim = scanner.nextInt();
		
		switch (secim) {
		case 1:
			System.out.println("toplama");
			
			break;
		case 2:
			System.out.println("cıkarma");
			break;
		case 3:
			System.out.println("bölme");
			break;
		case 4:
			System.out.println("çarpma");
			break;

		default:
			System.out.println("seçiminizi yanlış yaptınız...");
			break;
		}
		
	}

}
