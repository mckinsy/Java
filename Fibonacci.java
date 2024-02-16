package numbers;

public class Fibonacci // Has three variations --> within n fibonacci   nth fibonacci    n fibonacci numbers
{
	public void nth_FibonacciNumber(int n)
	{
		int x=-1,y=1;int Z;  // logic for nth fibonacci number
		for(int i=1;i<=n;i++)  // bcoz counting always done in natural number not whole number so avoid start counting(i) from zero
		{
			Z=x+y;
			x=y;
			y=Z;
			if(i==n)
				System.out.print(n+"th fibonacci is "+Z);
		}
	}
	public void n_FibonacciNumbers(int n)
	{
		int x=-1,y=1,z;String res="";
		for(int i=0;i<n;i++) //
		{
			z=x+y;
			x=y;
			y=z;
			System.out.print(res+z);
		}
	}
	@SuppressWarnings("unused")
	public void within_N_FibonacciNumbers(int n)
	{
		int x=-1,y=1,z;
		for(int i=0;;i++) // upto/within n fibonacci logic or use while instead while (z<=n)
		{
			z=x+y;
			if(z>n)     // for within/upto "n" fibonacci number also first validation then printing else one extra number out of range will print before break
				break;
			x=y;
			y=z;
			System.out.print(z+" ");
			// we can write like this while((n/=10)>0 | --n>0) but this is not program part
		}
	}
	public static void main(String[] args) 
	{
		new Fibonacci().n_FibonacciNumbers(5);

	}
}