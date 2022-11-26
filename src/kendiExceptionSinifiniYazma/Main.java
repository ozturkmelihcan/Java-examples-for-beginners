package kendiExceptionSinifiniYazma;

import java.util.Scanner;

public class Main {

	public static void hizKontrol(int hiz) {
		if(hiz>120) {
			throw new AsiriHizException("Aşırı hız yapılıyor");
		}else {
			System.out.println("iyi yolculuklar");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı giriniz...");
		int hiz = scanner.nextInt();
		try {
			Main.hizKontrol(hiz);
		} catch (AsiriHizException e) {
			e.printStackTrace();
		}
		System.out.println("bye bye ");
	}
}
