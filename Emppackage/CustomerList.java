package Emppackage;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Iterator;


public class CustomerList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> customList = new ArrayList();
		char ch= 'y';
		int choice;
		while(ch=='y') {
		System.out.println("Enter your choice");	
		System.out.println("1. Create list of the customers \n" + "2. Display details \n " + "3. update list by id \n" + "4. delete emp by empid \n" );
		choice=	sc.nextInt();
		
		switch(choice)
		{
		case 1: 
		{Scanner sc1= new Scanner(System.in);
			System.out.println("Enter the customer Id:\n ");
		int id= sc1.nextInt();
		if(id>0)
			
		{
			System.out.println("Id is valid");
		}
		else 
		{
			System.out.println("Id is not valid");
		}
		System.out.println("Enter the customer name:\n ");
		String name= sc1.next();
		{
			if((Pattern.matches("^[A-Za-z]{0,}[@$!%*#?&]{1,}{8,}$",name)))
					{
				System.out.println("The name is valid");
					}
					else {
						System.out.println("The name is not valid");
					}
					
		}
		System.out.println("Enter the age of the customer :\n ");
		int ag= sc1.nextInt();
		if(ag> 0 && ag<100)
		{
			System.out.println("The age is valid");
		}
		else {
			System.out.println("The mailid is not valid");
		}
		System.out.println("Enter the email id of the customer :\n ");
		String mailid= sc1.next();
		if(Pattern.matches("^[a-zA-Z0-9+_.-]+@(.+)$", mailid)) {
			System.out.println("The mailid is valid");
		}
		else {
			System.out.println("The mailid is not valid");
		}
		System.out.println("Enter the phnno of the customer :\n ");
		String phnno= sc1.next();
		
			if(Pattern.matches("[789]{1}[0-9]{9}",phnno ))
			{
				System.out.println("The phnno is valid");
			}
			else {
				System.out.println("The phnno is not valid");
			}
			
		
		customList.add(new Customer(id, name,ag, mailid, phnno));
		break;
		}
		case 2:
		{
			System.out.println("Enter the Id you want to update");
			int uid=sc.nextInt();
			System.out.println("Enter the Id you want to update");
			String nm= sc.next();
			Iterator <Customer> itr1= customList.iterator();
			while(itr1.hasNext())
			{
			 Customer c= itr1.next();
			 if(c.getCustId()==uid)
			 {
				customList.get(uid).setCustName(nm);
				} 
			 }
			break;
			}
			
		case 3:
		{
			System.out.println("Enter the Id you want to delete");
			int did=sc.nextInt();
			boolean found = false;
			Iterator <Customer> itr2= customList.iterator();
			while(itr2.hasNext())
			{
			 Customer c= itr2.next();
			 if(c.getCustId()==did)
			 {
				 itr2.remove();
				 System.out.println("Deleted!!!");
			 }
			
			
		}
			
			 break;
		}
	case 4:
	{
		Iterator<Customer> Itr3= customList.iterator(); 
		System.out.println("Customer HashSet values using Iterator");
		while(Itr3.hasNext())
		{
			Customer c= Itr3.next();
			System.out.println("Customer Id: " + c.getCustId() + "Customer name " + c.getCustName() + " Customer age: " + c.getAge() + "no of email of the customer: " + c.getEmailId() + " phone no: " + c.getMobileNo());
		}
		break;
	}
		
	default:
		System.out.println("Wrong Choice!");
				
				
	}
		System.out.println("Do you want to continue? (y/n): ");
		ch=sc.next().charAt(0);
		System.out.println();
}
	}
}
