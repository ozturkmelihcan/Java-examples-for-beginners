package list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOrnek1 {

	public static void main(String[] args) {
		// İlk giren ilk çıkar (FIFO)
				//bitane String kuyruk oluşturalım
				//kuyrugun içine isimler atalım
				//kuyruktaki elemanları yazdıralım
				
				//kuyruk boşalana kadar elemanları çıkarıp çıkarılan elemanı yazdıralım

		// Pide kuyrugu
		
		Queue<String> kuyruk = new LinkedList<>();
		kuyruk.add("mehmet");
		kuyruk.add("mustafa");
		kuyruk.add("rasim");
		
		System.out.println(kuyruk);
//		
//		System.out.println("eleman çıkarılıyor." + kuyruk.remove());
//		System.out.println("eleman çıkarılıyor." + kuyruk.remove());
//		System.out.println("eleman çıkarılıyor." + kuyruk.remove());
//		
//
//		System.out.println("kuyruk boşaldı: " +kuyruk);
//		
		
		while(!kuyruk.isEmpty()) {
			
			System.out.println("eleman cıkarılıyor : " + kuyruk.poll());
			
		}
		
		
	}

}
