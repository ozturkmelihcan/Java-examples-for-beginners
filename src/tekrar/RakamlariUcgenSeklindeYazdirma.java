package tekrar;

public class RakamlariUcgenSeklindeYazdirma {

	public static void main(String[] args) {
		/*
		 * örnek cıktı
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 * 11 12 13 14 15
		 */
		
//		for(int i=1;i<=15;i++) {
//			System.out.print(i);
//			
//			
//			for(int j=0;j<i;j++) {
//			System.out.println();
//				System.out.print(i+1);
//		
//			}
//			
//				
//			
//		}
		
		int sayac=1;
        for(int i=1;i<=5;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(sayac+" ");
                sayac++;
            }
            System.out.println();
        }

    }


		
		
	}


