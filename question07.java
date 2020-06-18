package assignments.assignment05;

public class question07 {

	public static void main(String[] args) {
		
		int max, div;
		max = 100;
		div = 5;
		
		for(int i = 1; i <= 100; i++) {
			if (i % div == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
