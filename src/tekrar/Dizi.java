package tekrar;

public class Dizi {

	public static void main(String[] args) {
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
                + "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
		
		String[] dizi = sehirler.split(";");
		
		System.out.println(dizi[0]);
		
		for(int i=0;i<dizi.length;i++) {
		String seri[] = dizi[i].split("-");
		
			 
			System.out.println(seri[1].toUpperCase() + " nın plaka kodu " + seri[0]);
		}
		
		
		
		
		

	}

}
