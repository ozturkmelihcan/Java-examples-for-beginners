package list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapOrnek2 {

	public static void main(String[] args) {
		
		String[] ogrenci = {"Ayşe", "Ece","Mahmut"};
		int[] notlar = {60,80,70};
		int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };
		Map<String,Integer> map1 = new LinkedHashMap<>();
		for(int i=0;i<notlar.length;i++) {
			map1.put(ogrenci[i], notlar[i]);
		}
		System.out.println(map1);
		
		System.out.println(map1.keySet());
		
		for (Map.Entry<String, Integer> entry : map1.entrySet()) {
			System.out.println(entry.getKey() +" " + entry.getValue()); 
	
			
		}
		System.out.println("hash code sıralanıyo");
		// hash code sıralanıyo
		Map<String, int[]> map2 = new HashMap<>();
		for(int i=0;i<3;i++) {
			map2.put(ogrenci[i], notlar2[i]);
			
		}
		for (Map.Entry<String, int[]> entry : map2.entrySet()) {
			System.out.println(entry.getKey());
			for (int i = 0; i < entry.getValue().length; i++) {
				System.out.println(entry.getValue()[i] +" ");
			}
			
		}
		
		
	}

}
