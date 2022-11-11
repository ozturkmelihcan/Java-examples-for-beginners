package tekrar;

import java.util.Scanner;

public class Ornek13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		
		for(int i =0;i<=10;i++) {
			int result = number*i;
			System.out.println(number + " x " + i + " " + "= "+result);
		}
		
		
		}
		
		
		
	}


