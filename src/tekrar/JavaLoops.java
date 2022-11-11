package tekrar;

import java.util.Scanner;

public class JavaLoops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		
//		int a = 10;
//		
//		for (int  i=1;i<a;i++) {
//			
//			 for (int j=0;j<i;j++) {
//					System.out.print("* ");	
//		}
//			System.out.println();
//		}
		
		
		
//		
//		for (int i=1;i<10;i++) {
//			for(int j=i;j<10;j++) {
//				System.out.print("  ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print(" *");
//				System.out.print(" *");
//			}
//			System.out.println("");
//		}
		
		boolean kontrol = true;

		int sayi1 = (int) (Math.random() * 100);
		int sayac = 1;

		while (kontrol) {
			System.out.println("Lütfen bir sayı giriniz: ");
			int tahmin = scanner.nextInt();
			if (tahmin == sayi1) {
				System.out.println("Tahmininiz doğru tebrikler...");
				System.out.println(sayac + ". tahminde buldunuz.");
				kontrol = false;
				
			} else if (tahmin > sayi1) {
				System.out.println("Tahmininizi azaltınız...");
				sayac++;
			} else {
				System.out.println("Tahmininizi yükseltiniz...");
				sayac++;

			}

		}
	}

}
