package tekrar;

public class ArrayOrnek2 {

	public static void main(String[] args) {
		
		int array1[] = { 50,60,3,4,3,9,8,7,45,95};
		
		int array2[] = { 1 , 2,50,60,3,8,9,7,16,95};
		
		
		for (int i=0;i<array1.length;i++ ) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					int a = array1[i];
					System.out.println(a);
				}
			}
		}
		

	}

}
