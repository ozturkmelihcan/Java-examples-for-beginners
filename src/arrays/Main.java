package arrays;

import java.util.Scanner;

public class Main {

	public static void mean(int[] arr) {
		int total =0;
		
		for(int i=0;i<arr.length;i++) {
			total += arr[i];
		}
		System.out.println("Ortalama: " + (double)total / arr.length);
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] arr1 = { 10,20,30,40,50 };
		int[] arr2 = new int[5];
		
		System.out.println("Arrayin değerlerini girin");
		for (int i=0; i<arr2.length ; i++) {
			arr2[i] = scanner.nextInt();
		}
		mean(arr2);
		
		
	}

}
