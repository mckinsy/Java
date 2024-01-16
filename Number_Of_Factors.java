package numbers;

public class Number_Of_Factors 
{
	public void Factors(int n)
	{
		System.out.print(n+" Factors are : ");
		for(int i=1;i<=n/2;i++)// every possible factor of number is present in the range of half only next factor after half is number itself. This is important observation for optimization
		{
			if(n%i==0)
				System.out.print(i+" ");
		}
	}
	public void primeFactors(int n)
	{
		System.out.print(n+" Prime Factors are : ");
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0&&PrimeNumbers.isPrime(i))
				System.out.print(i+" ");
		}
	}
	public boolean primeNumber_Logic_By_Counting_Factors(int n)
	{
		int c=0;
		if(n<2)
			return false;
//		if(n==2|n==3)
//			return true;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				c++;
		}
		return c==2; // factors count must be zero excluding 1 and itself or must've exactly two factors 1 and itself is called prime numbers
	}
	public static void main(String[] args) 
	{
		int n=78;
		Number_Of_Factors nf = new Number_Of_Factors();
		nf.Factors(n);
		System.out.println();
		nf.primeFactors(n);
		System.out.println();
		if(nf.primeNumber_Logic_By_Counting_Factors(n))
			System.out.println(n+" is Prime");
		else System.out.println(n+" is not prime");
	}

}
