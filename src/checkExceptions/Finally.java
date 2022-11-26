package checkExceptions;

public class Finally {

	public static void main(String[] args) {
		
		// Exception alan ve finally çalışan örnek;
		try {
			int x=4/0;
		} catch (Exception e) {
			System.out.println("Exception alındı...");
		}finally {
			System.out.println("Finally kod bloğu içindekiler ne yazarsan yaz hep çalışır...");
		}
		System.out.println("Bye");
		
		// Exception almayan ve finally çalışan bir örnek;
		
		try {
			String s = "test";
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println("Exception aldık");
		} finally {
			System.out.println("Finally kod bloğu içindekiler ne yazarsan yaz hep çalışır...");
		}
		
		// Exception alsın fakat exception yakalamayalım
		// Finally yine de çalışır.
		
		try {
			int x = 4/0;
		} catch (NullPointerException e) {
			System.out.println("Exception alındı.");
		}finally {
			System.out.println("Finally kod bloğu içindekiler ne yazarsan yaz hep çalışır...");
		}
		System.out.println("Bye");
		
		// Dosya kapama veri bağlantısı kapama , açık bir network socketini kapama gibi işlemler 
		// genellikle finally kod bloğu içinde yapılır.
		
		
	}

}
