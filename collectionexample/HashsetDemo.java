package com.capgemini.collectionexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;



public class HashsetDemo {

	/*
	 * public static void main(String[] args) { //HashSet hs = new HashSet(); //int
	 * a =20; //hs.add(a);
	 * 
	 * Scanner sc = new Scanner(System.in);
	 */
		// hs is a collection to store integer objects
		//int a =20;
		//ArrayList<Character>ai= new ArrayList<Character>();
		//LinkedList<Float> ll= new LinkedList<Float>();
		//ArrayList<Student>stdList= new ArrayList<Student>();

	/*
		HashSet<Integer>hs = new HashSet<Integer>();
		hs.add(123);
		hs.add(124);
		hs.add(124);
		hs.add(null);
		hs.add(125);
		hs.add(129);
		System.out.println(hs);*/
		// hs.add("123");( error as it is a integer type)
		//HashSet<String>hs1 = new HashSet<String>(8,0.60f);
		// capacity=8
		//load factor =0.6 means if hash set is filled by 60% then the size of hash set will be doubled.
		
	   // adding student objects in t hash set
		//HashSet<Student>stdList = new HashSet<Student>();
		//Student[] stdArray= new Student[3];
		
		
		public static void main(String[] args) {
			
			HashSet<Integer> hs = new HashSet<Integer>();
			hs.add(123);
			hs.add(124);
			hs.add(124);
			hs.add(null);
			hs.add(125);
			hs.add(129);
			
			System.out.println(hs);
			//accessing hash set elements/objects in sequence
			Iterator<Integer> itr = hs.iterator();
			System.out.println("HashSet values using Iterator");
			while(itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println();
			}
			
			
			  HashSet<String> flowerList = new HashSet<String>(8,0.60f); //capacity = 8
			  //load factor = 0.6 means if hash set is filled by 60% then the size of hash set will be doubled
			  flowerList.add("Rose"); 
			  flowerList.add("Jasmine");
			  flowerList.add("Marigold");
			 
			
			
			//adding Student objects in to hash set
			HashSet<Student> stdList = new HashSet<Student>();
			Student  std;
				Scanner sc= new Scanner(System.in);
				for(int i=0;i<3;i++) {
					System.out.println("Enter the details of Student");
					System.out.println("Enter the Student id");
					int id = sc.nextInt();
					System.out.println("Enter the Student Name");
					String name = sc.next();
					stdList.add(new Student(id,name));
				}
				
				Iterator<Student> stuItr = stdList.iterator();
				System.out.println("Student HashSet values using Iterator");
				while(stuItr.hasNext()) {
					Student st = stuItr.next();
					System.out.println(st.getSname() + " \t\t\t " + st.getSid());
					System.out.println();
				}

			
		}
}
