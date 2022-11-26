package IcIceMetodlardaExceptionHandling;

public class Main {

	public void function3() {
		int x = 20 / 0;
		System.out.println("function 3 ");
	}
	
	public void function2() {
		function3();
		System.out.println("function 2 ");
	}
	
	public void function1() {
		function2();
		System.out.println("function 1 ");
	}
	
	public static void main(String[] args) {
		
		
		Main main = new Main();
	//	main.function1();   // java.lang.ArithmeticException: hatası verir.
	//	main.function2();
		main.function3();
	}

}
