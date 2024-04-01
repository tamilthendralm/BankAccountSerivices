package BankAccountServices;

class ProBank
{
	int id;
	String name;
	long accno;
	long mobno;
	String email;
	double bal;
	
	ProBank [] p;
	
	ProBank(int id,String name,long accno,long mobno,String email)
	{
		this.id=id;
		this.name=name;
		this.accno=accno;
		this.mobno=mobno;
		this.email=email;
		
		System.out.println("your account created");
		
	}
	
	void displayInfo()
	{
		System.out.println();
	}
	
	void displayBal()
	{
		System.out.println("your account balance is : "+bal);
	}
	
	void deposit(double amt)
	{
		if(amt>0)
		{
			bal=bal+amt;
			System.out.println("amount deposited");
		}
		else
		{
			System.out.println("invalid amount");
		}
		
	}
	
	void withdraw(double amt)
	{
		if(bal>amt)
		{
			bal =bal-amt;
			System.out.println("withdraw success");
			
		}
		else
		{
			System.out.println("insufficient balance");
		}
		
	}
	
}

class SavingsS1 extends ProBank
{
	
	double roi=0.07;
	
	SavingsS1(int id,String name,long accno,long mobno,String email)
	{
		super(id,name,accno,mobno,email);
	}
	
	void displayRoi()
	{
		double bal1=bal+bal*roi;
		System.out.println("your bal amt with Roi is "+bal1);
		
	}
	
}

class CurrentC1 extends ProBank
{
	
	double min_bal= 500;
	CurrentC1(int id,String name,long accno,long mobno,String email)
	{
		super(id,name,accno,mobno,email);
	}
	
	void minBal()
	{
		System.out.println("minimum balance is "+ min_bal);
	}
	
	@Override
	void withdraw(double amt)
	{
		if(bal-amt>min_bal)
		{
			bal=bal-amt;
			System.out.println("withdraw success");
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
}

public class BankN1 {
	public static void main(String[] args) {
		System.out.println("hi 1");
	}
	

}
