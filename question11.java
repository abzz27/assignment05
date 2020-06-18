package assignments.assignment05;

public class question11 {

	public static void main(String[] args) {
		
		/*
		4---3---2---1
		 
		--3---2---1
		   
		----2---1
		      
		------1*/	
		
		int max = 0;
		for (int i = 4; i > 0; i--) {
			
			for( int s = 0; s < max; s++) {
				System.out.print("  ");
			}
			max++;
			for  (int p = i; p > 0; p--){
				System.out.print(p + "   ");
				
				}
			System.out.println();
			System.out.println();
		}

		
	}

}
