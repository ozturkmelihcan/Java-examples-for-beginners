package tekrar;

public class ArrayOrnek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ilk ve son elemanından biri 6 oldugunda ekrana true , olmadıgında false yazdıran program
		
		
		
		
		int sekans[] = {1,6,5,4,3};
		
		
		
		if(sekans[0]== 6 || sekans[sekans.length-1]==6) {
			System.out.println("true");
		}else 
			System.out.println("false");

	}

}
