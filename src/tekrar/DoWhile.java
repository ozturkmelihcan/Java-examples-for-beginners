package tekrar;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		//girilen sayının basamaklarının toplamını bulan program
		// do while ile 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz.");
		int sayi = scanner.nextInt();
		
		
		int kalan =0;
		int toplam =0;
		do {
			kalan=sayi%10;
			sayi = sayi/10;
			toplam = toplam+kalan;
		} while (sayi!=0); 
		System.out.println("basamakları toplamı: " + toplam);
		
	}

}
