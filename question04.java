package assignments.assignment05;

import java.util.Scanner;

public class question04 {

	public static void main(String[] args) {
		
		int rep = 0;
		int product = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int number = input.nextInt();
		
		product = number;

		System.out.println("Original number = " + number);
		
		while(product < 100) {
			product = product * 10;
			System.out.println(product);
			rep++;
		}
		
		System.out.println("Total number of loops = " + rep);
		System.out.println("Final number = " + product);
		
		
		
	}

}
