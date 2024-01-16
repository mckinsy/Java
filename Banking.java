package numbers;

import java.util.Scanner;

public class Banking 
{
	String name;
	int balance,bankcode,flag,pin; boolean pancard; long phno;  // flag is global variable and default value is zero so no need to initialize flag=0
	Banking(String n,int b,int p,boolean pan,long ph)
	{
		name=n;
		bankcode=b;
		pancard=pan;
		phno=ph;
		setpin(p);
	}
	void setpin(int p) //package level method is default for non public,private or protected access specifier classes and methods
	{
		if(p>=1000&&p<=9999)
		{
			pin=p;
			flag=1;
			System.out.println("pin successfully set");
		}
		else
			System.out.println(name+" set 4 digit pin");
	}
	void deposit(int p,int amount)
	{   
		if(flag==0)
			System.out.println(name+" you have not set the pin, set pin first!");
		else if(p==pin&&p!=0) //by default class properties or global variable pin value is zero so there is vulnerability that passing pin as zero deposits amount successfully
		{
			if(pancard==true)
			{
				balance+=amount;
				System.out.println(name+" your "+amount+" deposit is successful your new balance is "+balance);
			}
			else
				System.out.println(name+" link your pan card before deposit");
		}
		else
			System.out.println("incorrect pin");
	}
	void checkbalance() //method overloading
	{
		System.out.println(balance);
	}
	void withdraw(int amount,int p)
	{
		if(flag==0)
			System.out.println(name+" you have not set the pin, set pin first!"); 
		else if(p==pin&&p!=0) //by default class properties or global variable pin value is zero so there is hacking vulnerability that passing pin as zero deposits amount successfully
		{
			if(!pancard&&amount>50000)//if(pancard==false&&amount>50000)
				System.out.println(name+" link your pancard for withdrawl of more than 50,000");
			else if(amount<=balance)
			{
				balance-=amount;
				System.out.println(name+" your "+amount+" withdraw successful new balance "+balance);
				if((bankcode==2||bankcode==3)&&balance<10000) //if((bankcode==(2||3))&&balance<10000)-->this is not sql this is java and this statement is error (bankcode==(2||3) in sql it can be written as (bankcode in(2 or 3) but this is not sql 
					System.out.println("Warning: "+name+" you must maintain minimum 10,000 in your account deposit "+(10000-balance)+" to maintain minimum balance");
			}
			else System.out.println(amount+" withdraw not possible "+name+" you've low balance! "+balance);
		}
		else System.out.println("oops! incorrect pin");
	}
	void checkbalance(int p)  //method overloading taking pin as distinguishing argument as signature
	{ 
		if(p==pin&&p!=0)
		{
			System.out.println(name+" you have Rs."+balance+" in your account");
			if((bankcode==2||bankcode==3)&&balance<10000)
				System.out.println("Warning:"+name+" you must maintain minimum Rs.10,000 in your account deposit "+(10000-balance)+" to maintain minimum balance");
		}
		else System.out.println("Either you have not set the pin or you have entered incorrect pin");
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Dear user, please enter your name :");
		String name= sc.nextLine();
		System.out.print(name+" Enter bankcode :");
		int bnkcode=sc.nextInt();
		System.out.print(name+" Enter Pin :");
		int pin=sc.nextInt();
		System.out.println(name+" Do you have your Pancard y/n :");
		boolean pncrd = "y".equalsIgnoreCase(sc.next());
		System.out.println(name+" Enter Phone Number :");
		long phno=sc.nextLong();
		System.out.println(name+" Amount :");
		int amount=sc.nextInt();
		Banking c = new Banking(name,bnkcode,pin,pncrd,phno);
		c.deposit(pin,amount);
		c.withdraw(amount,pin);
		c.checkbalance();
		c.checkbalance(pin);
		sc.close();
		
//		Banking c = new Banking("RAJU",2,1234,true,9456745645L);
//		Banking c2 = new Banking("shyam",2,1245,false,9456745645L);  //test cases in object form
//		Banking c3 = new Banking("pawan",4,124565,true,9456745645L);
	}

}
