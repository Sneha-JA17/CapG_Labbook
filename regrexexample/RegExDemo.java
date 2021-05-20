package regrexexample;

import java.util.regex.Pattern;

import java.util.Scanner;

import java.util.regex.Matcher;


public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s= "Arise, awake, stop not till the reached";
  Pattern p= Pattern.compile(".w");
  Matcher m=p.matcher(s);
  boolean result=m.find();
  if(result) {
	  System.out.println("pattern matched");
  }else
  {
	  System.out.println("pattern doesnot match");
  }
  
	}
}

