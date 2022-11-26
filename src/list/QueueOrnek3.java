package list;

import java.util.PriorityQueue;
import java.util.Queue;

import javax.print.attribute.Size2DSyntax;

public class QueueOrnek3 {

	public static void main(String[] args) {
		//ilk giren ilk çıkar (FIFO)
		
				// Musteri sınıfı açalım isim ve yas değerlerini tutsun
				// Mainde bitane Musteri tutan PriorityQueue kuyruk oluşturalım
				// ve kuyruga Musterileri atalım

				// daha sonra müşteriler yaş önceliğine göre işlemlerini yapıp kuyruktan çıkacak
				// şekilde bir döngü kuralım
				// yaşı büyük olanlar ilk sırada yer alacak
				// yaşa göre bir sıralama yapıcaz
				
				//compareTo
				
				//Banka
				//Bankamız yaşlılara öncelik tanıyo
				//işi bitenler kuyruktan çıkıyo

		Queue<Musteri> musteri1 = new PriorityQueue<>();
		musteri1.add(new Musteri("murat",35));
		musteri1.add(new Musteri("kenan",40));
		musteri1.add(new Musteri("ahmet",42));
		musteri1.add(new Musteri("yasin",28));
		musteri1.add(new Musteri("emre",23));
		
		while(!musteri1.isEmpty()) {
			System.out.println(musteri1.poll());
		}
	}

}
