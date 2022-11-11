package tekrar;

public class Ornek12 {

	static String[] sehirler = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	public static void harfSorgula() {
		for(int i=0; i<sehirler.length;i++) {
			if(sehirler[i].substring(1).startsWith("a")) {
				System.out.println(sehirler[i] + "---->" + sehirler[i].substring(0,3).toUpperCase());
			}
		}
		
	}
	
	public static void main(String[] args) {

		// ikinci harfi a olanların ilk değeri ve sadece ilk üç harfi büyük olarak
		// yazdırın.
		// harf sorgulama metod , dönüş tipi yok, parametreye gerek yok.

		// for loop kullanacagım
		// 2. harfleri kontrol edeceğim
		// ilk 3 harfi yazdıracağım

		harfSorgula();
	}

	


}
