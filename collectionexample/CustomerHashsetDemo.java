package com.capgemini.collectionexample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
public class CustomerHashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
		HashSet <Customer> custList= new HashSet <Customer>();
		char ch= 'y';
		while(ch=='y') {
			System.out.println("Enter your choice");
			System.out.println("1) Insert customer details\n " + "2) Display details\n" + "3) Remove customer from list");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				{ Scanner sc1= new Scanner(System.in);
				System.out.println("Enter the customer Id:\n ");
				int id= sc1.nextInt();
				System.out.println("Enter the customer name:\n ");
				String name= sc1.next();
				System.out.println("Enter the bank balance customer :\n ");
				Double bb= sc1.nextDouble();
				System.out.println("Enter no. of fd of the customer :\n ");
				int qty= sc1.nextInt();
				custList.add(new Customer(id, name,bb,qty));
				break;
			}
			
			case 2:
				{
					Iterator<Customer> custItr= custList.iterator(); 
					System.out.println("Customer HashSet values using Iterator");
					while(custItr.hasNext())
					{
						Customer c= custItr.next();
						System.out.println("Customer Id: " + c.getCustId() + "Customer name " + c.getCustName() + " Customer BankBalance: " + c.getBankBalance() + "no of fd of the customer: " + c.getFdNo());
					}
					break;
				}
			case 3: 
			{
				Iterator<Customer> custdItr= custList.iterator(); 
				System.out.println("Customer HashSet values using Iterator");
				while(custdItr.hasNext())
				{
					Customer c= custdItr.next();
					if(c.getFdNo()<=0)
					{
						custdItr.remove();
				}
			}
				break;
			}
			default: 
				System.out.println("Incorrect choice");
		}
			System.out.println("Do you want to continue (y/n) :");
			ch= sc.next().charAt(0);
		   System.out.println();
	}

}
}