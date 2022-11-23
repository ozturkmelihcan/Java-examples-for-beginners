package arrays;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		
		ArrayList<String> groups = new  ArrayList<String>();
		
		groups.add("Metallica");
		groups.add("Iron Maiden");
		groups.add("Guns' n Roses");
		groups.add("Black Sabbath");
		
	//	System.out.println("ArrayList uzunluk: " +groups.size() );
		
		
		System.out.println(groups.indexOf("Metallica"));
		
		
		for(int i=0;i<groups.size();i++) {
			System.out.println("Eleman: " + groups.get(i));
		}

	}

}
