package collections;

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

	
		Queue<Hasta> acilServis = new PriorityQueue<Hasta>();
		acilServis.offer(new Hasta("mustafa","Apandisit"));
		acilServis.offer(new Hasta("mehmet","Apandisit"));
		acilServis.offer(new Hasta("ahmet","ağrı"));
		acilServis.offer(new Hasta("nazlı","Yanık"));
		acilServis.offer(new Hasta("niyazi","Yanık"));
		acilServis.offer(new Hasta("gülten","ağrı"));
		acilServis.offer(new Hasta("kenan","Yanık"));
		acilServis.offer(new Hasta("yasin","ağrı"));
		acilServis.offer(new Hasta("mehmet","Yanık"));
		
		while(!acilServis.isEmpty()) {
			System.out.println(acilServis.peek().getIsim() + " " + acilServis.peek().getSikayet() + " " + acilServis.poll().getOncelik());
		}
		

	}

}
