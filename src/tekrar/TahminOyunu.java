package tekrar;

import java.util.Scanner;

public class TahminOyunu {

	public static void main(String[] args) {
		// TODO int rastgeleSayi = (int) (Math.random() * 100);
		
		
		boolean kosul = true;
		Scanner scanner = new Scanner(System.in);
		

		int i =1;
		int rastgeleSayi = (int) (Math.random() * 100);
		while (kosul) {
			System.out.println("Lütfen sayınızı giriniz:");
			int sayi = scanner.nextInt();
			if(sayi==rastgeleSayi) {
				
				System.out.println("cevabınız doğru tebrikler.");
				kosul = false;
				System.out.println(i +  " seferde buldunuz.");
			} 
			else  if(sayi<rastgeleSayi) {
				System.out.println("tahmini yükseltin");
				i++;
			} else {
				System.out.println("tahmini azaltın.");
			 i++;
		}

	}

}}
