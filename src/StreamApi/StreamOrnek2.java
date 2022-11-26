package StreamApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOrnek2 {

	public static void main(String[] args) {
		// 5 ile bölünen sayıları bir listeye atalım ve listeyi yazdıralım...
		
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(25);
		sayilar.add(30);
		sayilar.add(38);
		sayilar.add(34);
		sayilar.add(23);
		
		List<Integer> beseKalansizBolunenler = sayilar.stream().filter(x->x%5==0).collect(Collectors.toList());
		beseKalansizBolunenler.stream().forEach(x -> System.out.println("Listede bulunan 5'e kalansız bölünen sayılar: " +x));
		
		// sayilari kendisi ile çarpıp yeni bir listeye atalım.
		List<Integer> kendisiIleCarpmaIslemi = new ArrayList<>();
		sayilar.stream().forEach(x-> kendisiIleCarpmaIslemi.add(x*x));
		System.out.println(kendisiIleCarpmaIslemi);
		

		// MAP' li  çözüm: 
		
		List<Integer> carpimlar2 = sayilar.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(carpimlar2);
		
		// kaç tane 5'e bölünen var.
		
		long beseBolunenSayilar = sayilar.stream().filter(sayi -> sayi%5 ==0).count();
		System.out.println("5'e bölünen sayılar " + beseBolunenSayilar +" adettir.");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
