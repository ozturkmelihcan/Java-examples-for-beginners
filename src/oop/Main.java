package oop;

public class Main {

	//Atm uygulaması
	
	public static void main(String[] args) {
		
		Account account1 = new Account("11223344");
		Account account2 = new Account("55555555");
		
		AccountManager accountManager = new AccountManager();
		AdminManager adminManager = new AdminManager();
		
		User user1 = new User("Melihcan" , "OZTURK", account1);
		
		accountManager.paraYatir(account1, 500);
		accountManager.paraCek(account1, 2000);
		
		accountManager.paraCek(account1, 1000);
		accountManager.hesapBilgileriniGoster(account1);
		
		
		UserManager userManager = new UserManager();
		userManager.otomatikEmailOlustur(user1);
		userManager.userBilgileriGoster(user1);
		
		
		userManager.krediBasvurusundaBulun(account1, 10000);
		adminManager.krediBasvurusunuReddet(account1);
		accountManager.hesapBilgileriniGoster(account1);
		adminManager.krediBasvurusunuReddet(account1);
		adminManager.krediBasvurusunuReddet(account1);
		adminManager.krediBasvurusunuReddet(account1);
		
		
		
		
	}

}
