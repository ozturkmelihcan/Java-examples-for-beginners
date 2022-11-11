package galeriornegi;

public class OtoGaleri {

	private String galeriAdi;
	private Otomobil[] otomobilDizisi;
	private int galeridekiOtomobilSayisi;

	public OtoGaleri(String galeriAdi, int limit) {
		otomobilDizisi = new Otomobil[limit];
		this.galeridekiOtomobilSayisi = 0;
		setGaleriAdi(galeriAdi);
	}

	public int findCount(String marka) {
		int counter = 0;
		for(int i=0; i<galeridekiOtomobilSayisi;i++) {
			if (this.otomobilDizisi[i].getMarka().equalsIgnoreCase(marka))
			{
				counter++;
			}
		}
		return counter;
	}

	public Otomobil[] search(String marka) {
		int count = this.findCount(marka);
		Otomobil[] aramaSonuclari = new Otomobil[count];

		int sayac = 0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			if (this.otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				aramaSonuclari[sayac] = this.otomobilDizisi[i];
				sayac++;
			}
		}
		return aramaSonuclari;
	}

	public String getGaleriAdi() {
		return galeriAdi;
	}
	
	public void setGaleriAdi(String galeriAdi) {
		this.galeriAdi = galeriAdi;
	}

	public void galeriyeOtomobilEkle(Otomobil otomobil) {

		if (galeridekiOtomobilSayisi < otomobilDizisi.length) {
			otomobilDizisi[galeridekiOtomobilSayisi] = otomobil;
			galeridekiOtomobilSayisi++;
		} else {
			System.err.println("Galeri kapasitesi full, araç eklenemedi!");
		}
	}

	public void galeridekiOtomobilleriListele() {

		System.out.println(
				"\n\n" + this.galeriAdi + " galerisindeki Otomobiller Listesi:  (kapasite:" + otomobilDizisi.length
						+ ")" + " (Galerideki anlık otomobil sayısı: " + this.galeridekiOtomobilSayisi + ")");
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			System.out.println(otomobilDizisi[i].getMarka() + " " + otomobilDizisi[i].getModel());
		}
	}

	public Otomobil[] getOtomobilDizisi() {
		return otomobilDizisi;
	}

	public int getGaleridekiOtomobilSayisi() {
		return galeridekiOtomobilSayisi;
	}




} // Class
