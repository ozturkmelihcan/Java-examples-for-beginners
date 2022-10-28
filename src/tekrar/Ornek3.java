package tekrar;

import java.util.Scanner;

public class Ornek3 {

	public static void main(String[] args) {
		// Girilen sayının istenilen sayıya göre mod işlemini yaptıran programın  algoritma 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi1 = scanner.nextInt();
		System.out.println("İki sayı giriniz: ");
		int sayi2 = scanner.nextInt();
		
		int toplam = 0;
		int x1;
		for (x1=0; x1<sayi1; x1++) {
			toplam=toplam+sayi1;
			
		}System.out.println("toplam " + toplam);
		
		

	}

}
