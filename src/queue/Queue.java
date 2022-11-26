package queue;

public class Queue {

	int[] arr;
	int capacity, first,last,currentSize;
	
	Queue(int capacity){
		this.capacity=capacity;
		arr = new int[capacity];
		first = 0;
		last = -1;
		currentSize =0;
	}
	
	boolean isEmpty() {
		return currentSize==0;
	}
	
	boolean isFull() {
		return currentSize==capacity;
	}
	
	void enqueue(int item) {
		if(isFull()) {
			System.out.println("Overflow...");
		}else {
			System.out.println("ekleniyor " + item);
			last++;
			arr[last] = item;
			currentSize++;
			// System.out.println(last + " " + item);
		}
	}
	
	void dequeue() {
		if(isEmpty()) {
			System.out.println("Underflow...");
		}else {
			System.out.println("Çıkarılıyor " + arr[first]);
			first++;
			currentSize--;
		}
	}
	
}
