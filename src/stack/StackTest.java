package stack;

public class StackTest {

	public static void main(String[] args) {

		Stack stack = new Stack(7);
		stack.push(25);
		stack.push(48);
		stack.push(56);
		stack.push(34);
		stack.push(12);
		stack.push(98);
		stack.push(66);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
