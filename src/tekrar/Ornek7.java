package tekrar;

import java.util.Scanner;

public class Ornek7 {

	public static void main(String[] args) {
		// işlem seçiniz
		// 1: toplama 2:çıkarma 3:bölme 4:çarpma
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz...");
		System.out.println("lütfen seçiminizi 1 ile 4 arasında yapınız...");
		int sayi = scanner.nextInt();
		
		if(sayi==1) {
			System.out.println("toplama");
		}else if(sayi==2) {
			System.out.println("cıkarma");
		}else if(sayi==3) {
			System.out.println("bölme");
		}else if(sayi==4) {
			System.out.println("çarpma");
		}else
			System.out.println("belirtilen değer aralıklarında işlem yapınız");
		

	}

}
