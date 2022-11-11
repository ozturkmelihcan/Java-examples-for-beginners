package oop;

public class AdminManager {
	
	public void krediBasvurusuOnayla(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println("Başvurunuz onaylanmıştır ");
			double guncelBakiye = account.getBakiye() + account.getIstenenKredi();
			account.setBakiye(guncelBakiye);
			account.setKrediBasvurusu(false);
		
		} else {
			System.out.println("kredi başvurusu yapılmamıştır.");
		}
	}
	
	public void krediBasvurusunuReddet(Account account) {
		if(account.isKrediBasvurusu()) {
			System.out.println("Kredi başvurusu reddedilmiştir. ");
			account.setKrediBasvurusu(false);
		}
		else {
			System.out.println("Kredi başvurusu yapılmamıştır. ");
		}
	}

}
