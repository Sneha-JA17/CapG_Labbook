package regrexexample;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Demopwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter pwd");
		 String pwd=sc.next();
		 System.out.println(Pattern.matches("^[a-zA-Z0-9._+-//*@]{8,16}", pwd));
		 sc.close();
			}
	}


