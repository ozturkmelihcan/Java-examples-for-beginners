package checkExceptions;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsIleExceptionFirlatma {

	public static void hizKontrol(int hiz) throws SQLException {
		if(hiz>120) {
			throw new SQLException();
		}else {
			System.out.println("İYİ yolculuklar...");
		}
	}
	
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen hızı giriniz...");
		int hiz = scanner.nextInt();
		ThrowsIleExceptionFirlatma.hizKontrol(hiz);
		try {
			ThrowsIleExceptionFirlatma.hizKontrol(hiz);
		} catch (SQLException e) {
			System.out.println("Çok hızlı gidiyorsunuz lütfen hızınızı azaltın...");
			e.printStackTrace();
		}
	}

}
