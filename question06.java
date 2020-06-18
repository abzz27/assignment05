package assignments.assignment05;

import java.util.Scanner;

public class question06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the nth term");
		int n = input.nextInt();
		
		int num1, num2, num3;
		num1 = 0;
		num2 = 1;
		System.out.print(num1 + ", " + num2);
		
		for (int i = 2; i < n; i++) {
			num3 = num1 + num2;
			System.out.print(", " + num3);
			
			num1 = num2;
			num2 = num3;
			
		}
	}

}
