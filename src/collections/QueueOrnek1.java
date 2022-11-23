package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOrnek1 {

	public static void main(String[] args) {
		// İlk giren ilk çıkar (FIFO)
				//bitane String kuyruk oluşturalım
				//kuyrugun içine isimler atalım
				//kuyruktaki elemanları yazdıralım
				
				//kuyruk boşalana kadar elemanları çıkarıp çıkarılan elemanı yazdıralım

		Queue<String> kuyruk = new LinkedList<>();
		kuyruk.offer("mehmet");
		kuyruk.offer("muhammet");
		kuyruk.offer("ahmet");
		kuyruk.offer("kenan");
		kuyruk.offer("kevser");
		
		
//		System.out.println(kuyruk.remove());
//		System.out.println(kuyruk.remove());
//		System.out.println(kuyruk.remove());
//		System.out.println(kuyruk.remove());
//		System.out.println(kuyruk.remove());
//		System.out.println(kuyruk.remove());
		
		
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.poll());
		
	}

}
