package lab9.exercise5;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner object creation by Shrijit Majumder
		FactorialUsingLambdaExpression fact = (number)->{
			int product=1;
			for(int i=0;i<=number;i++) {
				if(i==0)
					product=1;
				else
					product=product*i;
			}
			return product;
		};
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		System.out.printf("\nThe factorial of %d is %d.\n",number,fact.factorial(number));
		
		sc.close();
	}

}