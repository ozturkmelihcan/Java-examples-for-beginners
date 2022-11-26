package checkExceptions;

import java.util.Scanner;

public class ThrowIleExceptionFirlatma {
	
	// Parametre olarak gelen hız değeri 120 den büyükse exception fırlatacağız.
	public static void hizKontrol(int hiz) {
		if(hiz>120) {
			throw new ArithmeticException();
		}else {
			System.out.println("İyi yolculuklar...");
			
		}
		
		// Arabanın hızını arttır... veya çanak antenin ısıtma sistemini belirtilen dereceye ayarla...
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("hız giriniz");
		int hiz = scanner.nextInt();
		try {
			ThrowIleExceptionFirlatma.hizKontrol(hiz);
		} catch (Exception e) {
			System.out.println("Çok hızlı gidiyorsunuz , lütfen hızınızı azaltın...");
		}
		System.out.println("dikkatli olun");
	

	}

}
