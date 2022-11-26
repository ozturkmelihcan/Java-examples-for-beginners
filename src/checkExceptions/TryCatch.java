package checkExceptions;

import java.util.Scanner;

// TRY -CATCH BLOKLARI
// try {

// } catch (Exception e) {
// TODO: handle exception
// }

public class TryCatch {

	public static void main(String[] args) {
		// 1. Bölüm: //Exception in thread "main" java.lang.ArithmeticException: / by
		// zero
		// at com.melihcanozturk.MainTryCatch.main(MainTryCatch.java:22)
//		int x = 20/0;
//		int[] array = { 1, 2, 3, 4};
//		System.out.println(arr[7]);

		// catch (Exception e ) ile Bütün Exceptionları yakalarsınız.

		try {
			int x = 20 / 0;
		} catch (Exception e) {
			System.out.println("sıfıra bölme olmaz");
		}
		
		try {
			int x = 20/0;
		} catch (ArithmeticException e) {
			System.out.println("sıfıra bölme olmaz");
		}

		// 3. Bölüm:

				// aşagıdakı örnekte try-catch ile exception'ı yakalıyoruz ve programımız
				// kontrolsuz bır sekılde sonlanmıyor.
		
		System.out.println("/////////\\\\\\\\\\\\\\\\\\/////////////////");
		
		int[] array = {1,2,3,4,5};
		try {
			System.out.println(array[7]);
		} catch (Exception e) {
			System.out.println("Array sınırları dışına çıkılıyor..");
		}
		System.out.println("Hoşçakalın....");
		
		// 4. Bölüm :
				// Aldığınız Exception'ın detayını ögrenmek ıcın printStackTrace() metodunu
				// kullanın.
		
		
//		int[] array2 = {1,2,3,4,5,6};
//		try {
//			System.out.println(array2[7]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array sınırları dışına çıkılıyor..");
//		//	e.printStackTrace();
//			String yazilacakMesaj = e.toString();
//			System.out.println(yazilacakMesaj);
//		}
//	}
		// Birden çok Exception yakalama:
	Scanner scanner = new Scanner(System.in);
	int bolen =1;
	String s = null;
		try {
		int sayi = 20 / bolen;
		int[] array3 = { 1, 2, 3, 4 };
		System.out.println(array[0]);
		System.out.println(s.length());
		} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array sınırının dışına çıkılıyor...");
		} catch (ArithmeticException e) {
		System.out.println("0 a bölme hatası...");
		} catch (Exception e) {
		System.out.println("Tahmin edilemeyen bir hata oluştu...");
		}
	
	}
}
