package java1;

public class Account {
	
	int accno;
	String name;
	double balance;
	
	
	public Account()
	{
		accno=1001;
		name="Akshay";
		balance=1002;
		
	}
	
	public Account(int a,String n,double b)
	{
		accno=a;
		name=n;
		balance=b;
		
	}
	
	public void printAccount()
	{
		
		System.out.println("DETAILS:"+accno+" "+name+" "+balance);
	}
	public static void main(String[] args)
	{
		
		Account a1=new Account();
		a1.printAccount();
		
		Account a2=new Account(1002,"PAWAN",4502);
		a2.printAccount();
		
	}
}
