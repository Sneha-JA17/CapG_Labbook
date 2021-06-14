package lab9.exercise3;

import java.util.Scanner;

/**
 * Main program using Lambda Expression for validating username and password for authentication
 * @author Sneha
 *
 */

public class UsernamePasswordValidationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);// Scanner object creation by Sneha
		UsernamePasswordValidationUsingLambdaExpression upv = (username,password)->{
			return (username.equals("snehaa") && password.equals("sneha@1234"));
		};
		
		System.out.println("Enter the username : ");
		String username=sc.next();
		
		System.out.println("Enter the password : ");
		String password=sc.next();
		
		System.out.println("\nAuthentication Status : "+upv.validateusername_password(username, password));
		sc.close();
	}

}
