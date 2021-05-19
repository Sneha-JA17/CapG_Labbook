package lab4exercise1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person("Kathy", 22.0f);
		Person p2=new Person("Smith", 44.0f);
		
		Account acc1=new Account((long)(Math.random()*Math.pow(10, 16)),3000,p1);
		Account acc2=new Account((long)(Math.random()*Math.pow(10, 16)),2000,p2);
		
		System.out.println("Account No.\tAccount Holder\t\tIntial Balance");
		System.out.println(p1.name+"\t\t"+acc1.accNum+"\t\t"+acc1.balance);
		System.out.println(p2.name+"\t\t"+acc2.accNum+"\t\t"+acc2.balance);
		
		acc1.deposit(2000);
		acc2.withdraw(1000);
		
		System.out.println("Updated Account details are:");
		System.out.println("Account No.\tAccount Holder\t\tIntial Balance");
		System.out.println(p1.name+"\t\t"+acc1.accNum+"\t\t"+acc1.balance);
		System.out.println(p2.name+"\t\t"+acc2.accNum+"\t\t"+acc2.balance);
	}

}
