package list;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// Hasta diye bir sınıf açalım
		// isim, şikayet ve öncelik(int)

		// şikayete göre öncelik belirlicez
		// Öncelik özellikleri
		// Apandisit ----> En yüksek öncelik
		// Yanık -------> Orta Öncelik
		// Baş Ağrısı ---> En düşük öncelik

		Queue<Hasta> acilServis = new PriorityQueue<>();
		acilServis.offer(new Hasta("ahmet", "apandisit"));
		acilServis.offer(new Hasta("mehmet", "yanık"));
		acilServis.offer(new Hasta("kenan", "baş ağrısı"));
		acilServis.offer(new Hasta("şule ", "bağağrısı"));
		acilServis.offer(new Hasta("mustafa", "apandisit"));
		acilServis.offer(new Hasta("merve", "yanık"));

		while (!acilServis.isEmpty()) {
			System.out.println(acilServis.peek().getIsim() + " " + acilServis.peek().getSikayet() + " "
					+ acilServis.poll().getOncelik());
		}

	}
}
