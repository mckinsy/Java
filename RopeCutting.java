package recursion;

public class RopeCutting 
{
	static int maxCut(int rope, int a, int b,int c)
	{
		if(rope<0)
			return -1; // no further cutting possible so -ve
		
		if(rope==0)
			return 0;  // no length remaining so zero
		
		int max = Math.max(Math.max(maxCut(rope-a,a,b,c),maxCut(rope-b,a,b,c)),maxCut(rope-c,a,b,c));
		
		if(max<0)       // if all values returned to max is -ve when rope length is less than cutting length
			return -1;  // eg n=3 and a=4 , b=6 in this case answer will be max of -ve values max(-1,-3) returning value will be -1 which is wrong
		
		return max+1;  // bcoz of zero returned for one possible cut
	}
	
	static int max(int a, int b, int c) //bug if a =5 b=5 and c=1  no problem wheenn a=b=c=5 all are same 
	{
		return a>b & a>c ? a : b>a & b>c ? b : c;
	}
	
	public static void main(String[] args) 
	{
		int ropeLength=9;
		int cutA= 2;
		int cutB= 3;
		int cutC= 4;
		
		System.out.println(maxCut(ropeLength,cutA,cutB,cutC)); // shortcut simple solution is take minimum length and print it's division remember bricks problem coding bat goal%5.... same
		
		System.out.println(ropeLength/(Math.min(Math.min(cutA,cutB),cutC))); // alternate one line solution
		
//		System.out.println((Math.max(Math.max(ropeLength%cutA,ropeLength%cutB),ropeLength%cutC))); // alternate one line solution
	}
}
