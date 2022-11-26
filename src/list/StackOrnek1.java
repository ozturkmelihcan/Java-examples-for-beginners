package list;

import java.util.Stack;

public class StackOrnek1 {

	public static void main(String[] args) {
		// Stack --> Son giren ilk çıkar (LIFO) last in first out
				// bir tane int stack oluşturalım
				// içine bir kaç tane int değer atalım
				// bu staci yazdıralım

				// stack boşalana kadar bütün elemanları çıkaralım
				// çıkarılan her elemanı yazdıralım

				// 100 den küçük değerleri toplayıp stackten çıkaralım
				// 100 den büyük değerleri ise farklı bi stack içine atıcaz
				// daha sonra hem toplam değeri hem de diğeri stacki yazdıralım
		
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> yeniStack = new Stack<>();
		
		stack.push(15);
		stack.push(140);
		stack.push(22);
		stack.push(130);
		stack.push(13);
		stack.push(17);
		System.out.println(stack);
		
		int toplam = 0;
		
		while(!stack.isEmpty()) {
			
				if(stack.peek()<100) {
					toplam = toplam + stack.pop();
				}else {
					yeniStack.push(stack.pop());
				}
			} 
		
		System.out.println("100 den küçük olan sayıların toplamı : " + toplam);
		
		System.out.println("100 den büyük olan sayılar: "+ yeniStack);
		
		System.out.println(toplam);
		for (Integer integer : yeniStack) {
			System.out.println(integer);
		}
	}

}
