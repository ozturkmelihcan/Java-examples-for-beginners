package tekrar;

import java.util.Scanner;

public class Ornek6 {

	public static void main(String[] args) {
		// 	// OTOMOBİL YASINA GORE VERGI DILIMI TESPITI
		
		// KULLANICININ YASINA GORE OTO VERGI DILIMI  BILGISI
		
		// 0-5 YAS ARASI :DUSUK VERGI DILIMI
		// 5-10 YAS ARASI : ORTA VERGI DILIMI
		// 10 YAS ÜZERİ : EN YUKSEK VERGI DILIMI
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen yaşınızı giriniz...");
		int deger = scanner.nextInt();
		
		if(0<=deger && deger<=5) {
			System.out.println("Düşük vergi dilimindesiniz...");
		}else if(5<deger && deger<=10) {
			System.out.println("Orta vergi dilimindesiniz...");
		}else
			System.out.println("Yüksek vergi dilimindesiniz...");
		

	}

}
	