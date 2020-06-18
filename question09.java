package assignments.assignment05;

public class question09 {

	public static void main(String[] args) {
		
		int end = 11;
		System.out.print("if end = " + end + ", OUTPUT = ");
		
		int i = 1;
		while (i <= end) {
			
			
			
		
			if (i % 2 != 0) {
				System.out.print(i);
				
				if(i == (end - 1) || i == end) {
					i++;
					continue;
						
				}
			System.out.print(", ");
			}
		i++;
		}
	}

}
