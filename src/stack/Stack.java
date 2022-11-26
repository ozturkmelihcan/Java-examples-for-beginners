package stack;

public class Stack {

	int topOfStack;  // index
	int capacity;    // arrayin eleman sayısı
	int[] stack;
	
	Stack(int capacity){
		this.capacity= capacity;
		stack = new int[capacity];
		topOfStack = -1;        // push etme anında 1 arttırarak 0 degerını yakalamak ıstıyoruz.
	}
	
	void push(int element) {
		if(topOfStack == capacity-1) {
			System.out.println("overflow...");  // doluysa 
 		}else {
 			topOfStack++;
 			stack[topOfStack] = element;
 			System.out.println("ekleniyor... " + element);
 		}
	}
	
	int pop() {
		if(topOfStack<0) {
			System.out.println("underflow..."); // boşsa
			return 0;
		}else {
			int element = stack[topOfStack];
			topOfStack--;
			return element;
		}
	}
}
