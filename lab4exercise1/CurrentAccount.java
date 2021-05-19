package lab4exercise1;

public class CurrentAccount extends Account{
    double overdraftlimit;
	CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		this.overdraftlimit=90;
	}
 public void deposit(double amt) {
	 if((balance+amt)>=overdraftlimit)
	 {
		 System.out.println("Overdraftlimit is reached. You can't deposit");
	 }
	 else {
		 balance=balance+amt;
	 }
 }
}
