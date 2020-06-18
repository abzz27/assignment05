package assignments.assignment05;

public class question08 {

	public static void main(String[] args) {
		
		int upper = 5;
		int sum = 0;
		
		System.out.print("If upper bound is " + upper + ", sum should be ");
		int i = 1;
		while (i <= upper) {
			System.out.print(i);
			sum += i;
			
			if (i == upper) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
			i++;
		}		
		System.out.println(sum);	

		
	}

}
