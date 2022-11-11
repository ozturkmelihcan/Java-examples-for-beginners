package tekrar;

public class ArrayOrnek3 {

	public static void main(String[] args) {
		// verilen dizide rakamların farkı en az olan değeri ekrana yazdıran program
		
		int[] array = { 1,5,-3,2,4};
		
		int mutlakDeger = Math.abs(-3);
		
		int min = Integer.MIN_VALUE;
		int n=0 ;  
		int m =0;
		
		for(int i=0;i<array.length;i++) {
			for (int j = 0; j < array.length; j++) {
				if(i!=j) {
					if((array[i]-array[j])<min) {
						min = Math.abs(array[i]-array[j]);
						m = i;
						n = j;
						
					}
				}
			}
		} 
		System.out.println(" en az fark " + min + "'dir.");
	}

}
