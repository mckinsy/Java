package numbers;
import java.util.Scanner;
public class Circular_num_rotation {
	public int rotate_right(int n, int trail)
	{		
		return ((n%10)*trail)+(n/10);
	}
	public int rotate_left(int n,int trail)
	{
		int primary_digit=n/trail; //eg 4234 / 10^count digit-1 ==> 4 separated one last leftmost digit eg 43321 / 10000 = 4(quotient) and 43321 % 10000 = 3321(remainder)
	    int residual_digit = n%trail;	//int residual_digit=n-(p*primary_digit); //eg 4234-10^count * 4(leftmost digit)==> 4234 - 4000 = 234 separated right digits by subtracting 
	    return residual_digit*10+primary_digit;// (residual) 234 *10 + 4 (primary) why residual *10 because merging digit is only one i.e leftmost one eg in 4321 merging number is 4 in 3210 + 4 = 3214
	}
	
	public void check_returndancy(int choice,int num)
	{   
	  int temp=num;
	  int trailNumber = num;
	  int trail = 1; //10, 100, 1000 .....
	  while(trailNumber >= 10) // combination of power function of 10 to the number of digit of input number and counting number of digit in input number
		{
		  trailNumber/=10;
		  trail *= 10;
		}
	  System.out.println("trail "+ trail);
	 if(choice==1)
	  {
		do
		{
			temp=rotate_right(temp, trail);
			System.out.println(temp);
			
		}
		while(temp!=num);
	  }
	  else if(choice==2)
	  {
		do
		{
			temp=rotate_left(temp,trail);
			System.out.println(temp);
		}
		while(temp!=num);
	  }
	  else System.out.println("wrong input only from 1/2 ");
	  //}
	}
	public static void main(String[] args) {
		Circular_num_rotation cnr=new Circular_num_rotation();
		Scanner sc=new Scanner(System.in);
		System.out.println(" 1) 1 to Rotate right \n 2) 2 to Rotate left \n 3) 0 to Exit");
		int choice = sc.nextInt();		
		System.out.println("Enter number for rotation ");
		int num = sc.nextInt();
		cnr.check_returndancy(choice, num); 
		sc.close();
	}

}
