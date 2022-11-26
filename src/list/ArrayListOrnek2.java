package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListOrnek2 {

	public static void main(String[] args) {
		//1 tane çift sayılar Integer arraylist açalım
				//bitde tek sayılar Integer arraylist açalım
				
				// 1 den 100 e kadar 35 tane random sayı üretelim
				//tek saylar tekler arraylistine
				//çift sayılarda çiftler arraylistene atalım
				//sonra bunları yazdıralım

		ArrayList<Integer> ciftSayilar = new ArrayList<>();
		ArrayList<Integer> tekSayilar = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i = 0; i < 35; i++) {
			int sayi = random.nextInt(101);
			
			if(sayi%2==0) {
				ciftSayilar.add(sayi);
			}else {
				tekSayilar.add(sayi);
			}
		}
		System.out.println("Tek sayilar: " +  tekSayilar +  "\nÇift sayılar: " + ciftSayilar);
	}

}
