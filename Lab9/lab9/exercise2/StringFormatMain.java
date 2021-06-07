package lab9.exercise2;

import java.util.Scanner;


public class StringFormatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm=new Scanner(System.in); // Scanner object creation by Sneha
		StringFormatUsingLambdaExpression se = (string)->{
			char characters[]=string.toCharArray();
			String result="";
			for(int i=0;i<characters.length-1;i++) {
				result+=characters[i]+" ";
			}
			return result+characters[characters.length-1];
		};
		System.out.print("Enter the string : ");
		String string=sm.next();
		System.out.println("\nResultant string = "+se.returnExpression(string));
		
		sm.close();

	}

}
