package inheritance;

public class Main {

	public static void main(String[] args) {

		Muhendis muhendis1 = new Muhendis();
		muhendis1.setAd("Melihcan");
		muhendis1.setSoyad("ÖZTÜRK");
		muhendis1.setTcKimlik("15654561516");
		muhendis1.setUzmanlikAlani("Metalurji ve Malzeme Müh.");
		
		System.out.println(muhendis1.getAd() + " " + muhendis1.getSoyad() + " " + muhendis1.getUzmanlikAlani());
		
		Mudur mudur = new Mudur();
		mudur.setAd("Ahmet");
		
		
		IdariMemur idariMemur = new IdariMemur();
		idariMemur.setAd("Ayşe");
		idariMemur.setGorevi("D.Başkanı sekreteri");
		idariMemur.setCepTelNo(56445615616L);
		
		
		Personel personel = new Personel();
		personel.setAd("Cem");
		
	}

}
