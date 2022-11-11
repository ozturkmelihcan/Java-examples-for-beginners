package oop;

public class AccountManager {
	
	public void paraYatir(Account account , double miktar) {
		if(miktar<=10000) {
			account.setBakiye(account.getBakiye() + miktar);
			System.out.println(miktar + " TL yatırdınız, güncel bakiyeniz: " + account.getBakiye());
		} else {
			System.out.println("yatırdığınız miktar " + miktar + "TL dir. 10000 TL den fazla yatıramazsınız");
		}
	}
	
	public void paraCek(Account account , double miktar) {
		if(miktar>account.getBakiye()) {
			System.out.println("Bakiyeniz Yeterli Değildir: Güncel bakiyeniz " + account.getBakiye());
		} else {
			account.setBakiye(account.getBakiye() - miktar);
			System.out.println(miktar + "TL çektiniz , Güncel Bakiyeniz: " + account.getBakiye());
		}
	}
	
	public void hesapBilgileriniGoster(Account account) {
		System.out.println("Hesap No'nuz: " + account.getHesapNo() + "Güncel Hesap Bakiyeniz: " + account.getBakiye());
	}
}
