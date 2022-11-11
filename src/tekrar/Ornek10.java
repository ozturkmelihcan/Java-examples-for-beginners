package tekrar;

import java.util.Locale;
import java.util.Scanner;

public class Ornek10 {

	public static void main(String[] args) {
		
		String metin = "  mustafa kereme ne dedi   ";
		
		System.out.println(metin.substring(3,15));
		
		System.out.println(metin.trim());
		
		String ka = "melihcan" , sifre ="admin";
		System.out.println(ka.toUpperCase(Locale.ENGLISH));
		System.out.println(sifre.toUpperCase(new Locale("tr","TR")));
		
		String isim = " melihcan";
		
		System.out.println(isim.trim().toUpperCase(Locale.ENGLISH));
		
		int sayi = 55463;
		String kelime = String.valueOf(sayi);
		System.out.println(kelime);
		
		boolean flag = true;
		String ss = String.valueOf(flag);
		System.out.println(ss);
		
		String uname = "melihcan@test.com";
		Scanner scanner = new Scanner(System.in);
	//  System.out.println("Lütfen kullanıcı adı giriniz: ");
		//String userName = scanner.nextLine();
		
//		userName = userName.toLowerCase().trim();
//		System.out.println(userName);
		
//		if(uname == userName) {
//			System.out.println("kullanıcı adı eşleşti");
//		}else
//			System.out.println("kullanıcı adı eşleşmedi");
//		
//		if(uname.equals(userName));
//		System.out.println("kullanıcı adı giriniz");
//		System.out.println("kullanıcı adı eşleşmedi");
//		
		
		String melmel = "mustafanın kedisi yıkanmış.";
		
		String mel = melmel.replace("musta", "rukiye");
		
		System.out.println(mel);
		
		
		String misafir = "kelimenın içinde misafir var mı?";
		
		System.out.println(misafir.contains("nın"));
		
		 String ad1 = "Ali Kaya";
	        String ad2 = "ali kaya";
	        
	        System.out.println(ad1.equals(ad2));
	        System.out.println(ad1.equalsIgnoreCase(ad2));
		
		
	}

}
