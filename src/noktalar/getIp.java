package noktalar;

import java.util.ArrayList;

public class getIp {

	public static void main(String[] args) {

		genIp("11211");

	}

	private static void genIp(String s) {

		ArrayList<Character> array = new ArrayList<Character>();
		String ip = "";
		for (int i = 0; i < s.length() - 1; i++) {

			array.add(s.charAt(i));
			array.add('.');
		}
		array.add(s.charAt(s.length() - 1));
		for (Character character : array) {
			System.out.print(character);
		}
		System.out.println();
		
			
			
		}
		
	
}