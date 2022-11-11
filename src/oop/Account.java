package oop;

public class Account {

	private String hesapNo;
	private double bakiye;

	private boolean krediBasvurusu;
	private double istenenKredi;

	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}

	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}

	public double getIstenenKredi() {
		return istenenKredi;
	}

	public void setIstenenKredi(int istenenKredi) {
		this.istenenKredi = istenenKredi;
	}

	public Account() {

	}

	
	
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public void setIstenenKredi(double istenenKredi) {
		this.istenenKredi = istenenKredi;
	}

	public String getHesapNo() {
		return hesapNo;
	}

	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}

	public double getBakiye() {
		return bakiye;
	}

	public Account(String hesapNo) {
		this.hesapNo = hesapNo;
	}

	public void paraYatir(double miktar) {
		double bakiyeTutucu = this.bakiye;
		bakiyeTutucu += miktar;
		if (bakiyeTutucu < 10000) {
			this.bakiye += miktar;
			System.out.println(miktar + " para hesaba yatırıldı güncel bakiyeniz: " + this.bakiye);
		} else {
			System.out.println("10000 tl den fazla yatıramazsınız");
		}
	}

}
