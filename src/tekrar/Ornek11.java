package tekrar;

import java.util.Scanner;

public class Ornek11 {

	public static void main(String[] args) {
		// // kullanıcıdan alınan vize ve final notlarını geçip geçemediğini gösteren program 
		// 50>= geçti , 50< kaldı , vize*0.4 final*0.6
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("vize notunuzu giriniz");
//		int vizeNotu = scan.nextInt();
//		System.out.println("final notunuzu giriniz.");
//		int finalNotu = scan.nextInt();
//		
//		double result = finalNotu*0.6 + vizeNotu*0.4;
//		
//		System.out.println(result);
//		
//		if(result<50) {
//			System.out.println(result + " kaldınız.");
//		} else 
//			System.out.println(result + " geçtiniz.");
//		
		//girilen sayının tek çift oldugunu belirten program
//		
//		System.out.println("lütfen bir sayı giriniz");
//		int sayi = scan.nextInt();
//		if(sayi%2==0) {
//			System.out.println(sayi + " çift sayıdır.");
//		} else 
//			System.out.println(sayi+ " tek sayıdır.");
//		
		// kenarları verilen bir üçgenin nasıl bir üçgen oldugunu belirtin
				// eşkenar , çeşitkenar , ikizkenar
//		System.out.println("ilk kenarı giriniz");		
//		int kenar1 = scan.nextInt();
//		System.out.println("ikinci kenarı giriniz");	
//		int kenar2 = scan.nextInt();
//		System.out.println("üçüncü kenarı giriniz");		
//		int kenar3 = scan.nextInt();
//		
//		
//		if(kenar1==kenar2 && kenar1==kenar3) {
//			System.out.println("eşkenar üçgendir.");
//		} else if(kenar1!=kenar2 && kenar1!=kenar3 && kenar2!=kenar3) {
//			System.out.println("çeşitkenar üçgen");
//		} else
//			System.out.println("ikiz kenar üçgen");
//		
		// Dairenin alanı ve çevresi r yi kullanıcıdan alınız pi:3.14
		
		int yariCap = scan.nextInt();
		
		float cevre = 2* yariCap* 3.14f;
		float alan = 3.14f* yariCap*yariCap;
		System.out.println("üçgenin alanı: " + alan + " üçgenin çevresi: " + cevre);
		
		// 90 üstü AA
				// 80 ve 90 BB
				// 70 ve 80 CC
				// 60 ve 70 DD
				// 60 ve altı FF kaldınız
		
		
		int not1 = scan.nextInt();
		
		if(not1>=90) {
			System.out.println("AA ile geçtiniz");
		}else if(not1>=80&&not1<90) {
			System.out.println("BB ile geçtiniz");
		}else if(not1>=70&&not1<80) {
			System.out.println("CC ile geçtiniz");
		}else if(not1>=60&&not1<70) {
			System.out.println("DD ile geçtiniz");
		}else if(not1<60) {
			System.out.println("FF KALDINIZ");
		}
		
		// girilen 3 sayıdan küçük olanı yazdıran program
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();
		
		if(sayi1<sayi2&&sayi2<sayi3) {
			System.out.println("en küçük sayi " + sayi1);
		}else if(sayi1<sayi3&&sayi3<sayi2) {
			System.out.println("en küçük sayi " + sayi1);
		}else if(sayi2<sayi1&&sayi1<sayi3) {
			System.out.println("en küçük sayi " + sayi2);
		}else if(sayi2<sayi3&&sayi3<sayi1) {
			System.out.println("en küçük sayi " + sayi2);
		}else if(sayi3<sayi2&&sayi2<sayi1) {
			System.out.println("en küçük sayi " + sayi3);
		}else if(sayi3<sayi1&&sayi1<sayi2) {
			System.out.println("en küçük sayi " + sayi3);
		} else System.out.println("sayıları birbirine eşit girdiniz..");
		
		
		// 1- Toplama
				//2-Çıakrma
				// 3- Bölme
				//4- ÇArpma
				// hangı ıslemı yapmak ıstıyorsunuz, kullanıcıdan  2 sayı alacagız
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("hangi işlemi yapmak istiyorsunuz");
		System.out.println("1- toplama");
		System.out.println("2- çıkarma");
		System.out.println("3- bölme");
		System.out.println("4- çarpma");
		System.out.println("işleminizi seçiniz...");
		int secim = scan.nextInt();
		
		if(secim==1) {
			System.out.println("toplam" + a+b);
			
		}else if(secim==2) {
			System.out.println("farkları:" + (a-b));
			
		}else if(secim==3) {
			System.out.println("bölmeleri" + a/b);
			
		}else if(secim==4) {
			System.out.println("çarpımları" + a*b);
			
		}
		
		
		
		
		
		
	}

}
