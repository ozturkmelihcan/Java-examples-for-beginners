package queue;

public class QueueTest {

	public static void main(String[] args) {
		
		
		
		
		Queue queue = new Queue(7);
		queue.enqueue(25);
		queue.enqueue(56);
		queue.enqueue(48);
		queue.enqueue(12);
		queue.enqueue(14);
		queue.enqueue(36);
		queue.enqueue(98);
		
		
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		
		System.out.println("FIFO : First In First Out");
	}

}
