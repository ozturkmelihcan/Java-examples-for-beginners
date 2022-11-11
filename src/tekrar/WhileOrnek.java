package tekrar;

import java.util.Scanner;

public class WhileOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// girilen sayının faktorıyelını hesaplayan
				// while ile
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("sayı giriniz");
		int sayi = scanner.nextInt();
		
		int carpim = 1;
		
		while(sayi>0) {
			
			carpim=carpim*sayi;
			sayi--;
		}
		System.out.println(carpim);
		
		
		
		
	}

}
