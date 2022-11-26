package list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek2 {

	public static void main(String[] args) {
		// bir tane kuyruk oluşturalım
		// bu kuyruğa 10-12 tane isim ekleyelim
		// daha sonra random 1-10 arası sayi üretcez bu sayi bizim pide sayımız olacak
		// pide sayısını yazdıralım

		// kuyruga göre pideleri dağıtıcaz pide bittiğinde pide bitti uyarısı versin
		// pideyi alan kişi kuyruktan çıkacak
		// bir de pide alamayan kişileri yazdıralım

		Queue<String> pideKuyrugu = new LinkedList<>();

		pideKuyrugu.add("muhammet");
		pideKuyrugu.add("hamza");
		pideKuyrugu.add("kenan");
		pideKuyrugu.add("caner");
		pideKuyrugu.add("ahmet");
		pideKuyrugu.add("ekrem");
		pideKuyrugu.add("yeşim");
		pideKuyrugu.add("bahar");
		pideKuyrugu.add("ali");
		pideKuyrugu.add("leyla");
		pideKuyrugu.add("ekrem");
		pideKuyrugu.add("fatih");
		System.out.println(pideKuyrugu);

		Random random = new Random();

		int pideSayisi = random.nextInt(1, 11);
		System.out.println("pideler çıkıyor: " + pideSayisi + " adet pidemiz var.");

		
		for (int i = 1; i <= pideSayisi; i++) {
			System.out.println("pidesini alanlar: " + pideKuyrugu.poll());
		}
		System.out.println("pide alamayanlar: " + pideKuyrugu);

	}
}
