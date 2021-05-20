package regrexexample;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DemoEmail {
public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			 System.out.println("Enter email");
			 String email=sc.next();
			 System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@(.+)$", email));
			 //At first ^(caret) should be given to ensure start of the pattern
			 //At last (.+)$ should be given to ensure end of the pattern
				sc.close();
				}
		}

