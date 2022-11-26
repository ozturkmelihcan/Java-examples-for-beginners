package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOrnek1 {

	public static void main(String[] args) {
		// Stream api java kac ıle geldı ---> java8 ile birlikte geldi.
				// ve java 8 özellikleri
				
				// user sınıfı olusturalım
				// id ve name olsun
				// to String metodu olsun
				// bilgileri göster metodu yazalım --> sadece ismini yazdırsın
				// mainde users dıye bır liste olusturalım
				// ve user nesnelerı olusturup users listesine atalım..
		
		List<User> users = new ArrayList<>();
		users.add(new User("kenan", 1));
		users.add(new User("ahmet", 2));
		users.add(new User("mustafa", 3));
		users.add(new User("murat", 4));
		users.add(new User("ahmet", 5));
		users.add(new User("fatma", 6));
		users.add(new User("ali", 7));
		users.add(new User("ahmet", 8));
		// bütün userslerin toString metodunu çağıralım.
		users.stream().forEach(user -> System.out.println(user.toString()));
		System.out.println("**************************************************");
		// her bir user için bilgileri goster methodunu çağıralım.
		System.out.println("****************************************************");
		users.stream().forEach(user -> user.bilgileriGoster());
		System.out.println("****************************************************");
		// id si 3 ten büyük olanları bir listeye atalım ve bu liste içindeki userların bilgileri
		List<User> filtreliUser = users.stream().filter(user -> user.getId()>3).collect(Collectors.toList());
		filtreliUser.stream().forEach(user -> System.out.println(user.getName()+" " + user.getId()));
		System.out.println("****************************************************");
		// id si 3 ten küçükleri set'e atalım.
		// daha sonra bu seti yazdıralım.
		
		Set<User> filtreliUserSet = users.stream().filter(user -> user.getId()<3).collect(Collectors.toSet());
		filtreliUserSet.stream().forEach(System.out::println);
		System.out.println("****************************************************");
		// ismi ahmet olanları farklı bir listeye atalım daha sonra bu listeyi yazdıralım.
		List<User> ahmetOlanlar = users.stream().filter(user -> user.getName().equalsIgnoreCase("ahmet")).collect(Collectors.toList());
		ahmetOlanlar.stream().forEach(System.out::println);
		
		// her bir user için yeni bir user nesnesi olusturalım
		// parametre olarak kendi id ve isimlerini alsınlar ve isimlerinin sonuna !! ekleyelım
		// yeni liste atalım ve listeyi yazdıralım
		
		System.out.println("************************************************************************");
		List<User> maplist = users.stream().map(user -> new User(user.getName()+"!!",user.getId())).collect(Collectors.toList());
		maplist.stream().forEach(User::bilgileriGoster);
		
		
	}

}
