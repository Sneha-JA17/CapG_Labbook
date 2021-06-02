package com.Capgemini.authorapp.Author;


import java.util.Collection;
import java.util.Scanner;

import com.Capgemii.authorapp.Author.service.AuthorManage;

import com.Capgemini.authorapp.Author.model.Author;
	
public class AuthorMain {
	static AuthorManage am = new AuthorManage();
	static Scanner sc = new Scanner(System.in);
	static String name;
	static String email;
	static char gender ;
	
	public static void main(String args[]) {
		
		char ch='y';
		while(ch=='y') {
		System.out.println("Enter the choice");
		String choice = sc.next();

		switch (choice) {
		case "readauthor":
			readAuthor();
			break;
		
		case "printdetails":
			Collection<Author> auth=am.getAllAuthors();
			System.out.println(auth);
			break;
			
			default:
				System.out.println("Wrong choice");
			}
		System.out.println("Do you want to continue (y/n)");
		ch=sc.next().trim().charAt(0);
		}
	}
	public static void readAuthor() {
		System.out.println("Enter name of author:");
		name=sc.next();
		
		System.out.println("Enter Email:");
		email=sc.next();
		
		System.out.println("Enter Gender: (m/f)");
		gender=sc.next().charAt(0);
	}
}

