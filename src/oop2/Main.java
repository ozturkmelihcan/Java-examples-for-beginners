package oop2;

public class Main {

	public static void main(String[] args) {
	
		String s1 = new String("MELİHCAN");
		String s2 = new String("MELİHCAN");
															// Çalıştırdıgımız zaman eşit değil sonucu alırız 
															// bunun nedeni s1==s2 dediğimiz zaman aslında referansları karşılaştırıyoruz.
		if ( s1.equals(s2)) {
			System.out.println("eşit");
		} else {
			System.out.println("Eşit değil");
		}
		
		
		
		
		/*	
		Car car1 = new Car("gümüs", "renault megane", 1.6 , 4);
		
	
		
	
		
		Car car2 = car1;
		
		System.out.println("-------------------------------------------------");
		
		
		car2.showInfos();
		
		
		System.out.println("-------------------------------------------------");
		
		Car car3 = null;
		
		
		car3.showInfos();
		*/
		
	}

}
