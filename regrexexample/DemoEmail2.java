package regrexexample;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class DemoEmail2 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter email");
		 String email=sc.next();
	String s="^[a-zA-Z0-9._+$]{4,15}@[a-z]{3,8}\\.(.+)$";
	Pattern pattern1=Pattern.compile(s);
	Matcher matcher =pattern1.matcher(email);
	//System.out.println(Pattern.matches());
	boolean result=matcher.matches();
	System.out.println(result);
	sc.close();
	
}
}
