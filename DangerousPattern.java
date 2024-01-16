package patterns;

public class DangerousPattern 
{
	public void pattern(int n)
	{ 
		int k=n;
//		int[][] ar=new int [n*2-1][n*2-1];
		while(n>=1)
		{
			for(int i=0;i<n*2-1;i++)
			{
				for(int j=0;j<n*2-1;j++)
				{
					if((i==0||i==n*2-2)||(j==0||j==n*2-2))
					System.out.print(n+" ");
					else
					System.out.print("  ");
					//		for(int i=0;i<=n*2-2;i++)
					//		{ 
					//			for(int j=n*2-2;j>=0;j--)
					//			{     
					//				int diff;
					//				diff=i<j?i:j;
					//				diff=diff<(n*2-2)-j?diff:(n*2-2)-j;
					//				diff=diff<(n*2-2)-i?diff:(n*2-2)-i; 
					//				System.out.print(n-diff+" ");
				}
				System.out.println();
				n--;
			}
			//n--;
			k=n;
		}
	}
	public static void main(String[] args)
	{
		new DangerousPattern().pattern(3);
		//		System.out.println("3 3 3 3 3");
		//		System.out.println("3 2 2 2 3");
		//		System.out.println("3 2 1 2 3");
		//		System.out.println("3 2 2 2 3");
		//		System.out.println("3 3 3 3 3");
	}
}
