package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOrnek3 {

	public static void main(String[] args) {

		Kisi kisi1 = new Kisi("ahmet", 51, ECinsiyet.ERKEK);
		Kisi kisi2 = new Kisi("metmet", 40, ECinsiyet.ERKEK);
		Kisi kisi3 = new Kisi("koray", 15, ECinsiyet.ERKEK);
		Kisi kisi4 = new Kisi("ayşe", 28, ECinsiyet.KADIN);
		Kisi kisi5 = new Kisi("yasin", 30, ECinsiyet.ERKEK);
		Kisi kisi6 = new Kisi("fevziye", 51, ECinsiyet.KADIN);
		
		List<Kisi> kisiler = new ArrayList<>();
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		kisiler.add(kisi4);
		kisiler.add(kisi5);
		kisiler.add(kisi6);
		
		for (Kisi kisi : kisiler) {
			System.out.println(kisi);
		}
		
		// kadın olanları farklı bır lısteye atıcaz sonra bu listeyi yazdıralım.
		System.out.println("---------------------------------------");
		
		List<Kisi> kadinOlanlar = kisiler.stream().filter(kadin -> kadin.getCinsiyet()== ECinsiyet.KADIN).collect(Collectors.toList());
		kadinOlanlar.stream().forEach(kadin -> System.out.println(kadin));
		
		

	}

}
