package tekrar;

import java.util.Scanner;

public class Ornek1 {

	public static void main(String[] args) {
		// girilen sayının faktorıyelını alan program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		
		int x = scanner.nextInt();
		int fact=1;
		for (int i=1;i<=x;i++) {
			fact=fact*i;
		}
		System.out.println("factorial= " + fact);
		
		

 scanner.close();	}

}
