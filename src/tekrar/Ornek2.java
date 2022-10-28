package tekrar;

import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {
		// Çarpma işlemini toplama kullanarak bulan programın algoritma 
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("1. sayıyı giriniz: ");
			int sayi1 = scanner.nextInt();
			System.out.println("2. sayıyı giriniz: ");
			int sayi2= scanner.nextInt();
			
			int toplam=0;
			int i;
			
			for(i=0;i<sayi2;i++) {
				toplam=toplam+sayi1;
				;
			}
			System.out.println("sonuc= " + toplam);
			scanner.close();
		}
		
		
		
		

	}

}
