package tekrar;

import java.util.Scanner;

public class Kuvvet5 {

	public static void main(String[] args) {
		// // girilen sayının 5in kuvveti olup olmadıgını bulan program
		// while kullanarak çözün
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen sayı giriniz");
		double sayi = scanner.nextInt();
		
		boolean kosul = true;
		if(sayi==0) {
			System.out.println("sıfırdan farklı bir değer giriniz");
		}else 

			while (kosul) {
				if(sayi%5==0) {
					sayi=sayi/5;
					if(sayi==1) {
						System.out.println("sayı 5in kuvvetidir");
						kosul = false;
				} 
				}else  {
					System.out.println("sayı 5in kuvveti değildir");
					kosul = false;
				} 
			
		} 
		
		
			
		
		System.out.println();
	}

}
