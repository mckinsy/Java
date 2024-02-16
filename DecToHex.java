package numbers;

import java.util.HashSet;

import arrays.Beautify;
import numbers.Generator.PermutationUnderflowException; //created custom exception

public class DecToHex 
{  // 0 1 2 3 4 5 6 7 8 9 A B C D E F
	
	public static String dectoHex(long n)
	{
		String hex="";//int d=3456675; int n=3468954;
		while(n>0)
		{
			int rem;
			rem=(int)n%16;
			if(rem==10)
				rem='A';
			if(rem==11)
				rem='B';
			if(rem==12)
				rem='C';
			if(rem==13)	
				rem='D';
			if(rem==14)
				rem='E';
			if(rem==15)
				rem='F';			
			hex =(rem>='A'&&rem<='F')? (char)rem+hex : rem+hex;		
			n=n/16;			
		}
		return hex;
	}

	public static void main(String[] args) throws PermutationUnderflowException 
	{
		
		int[] decimal=Generator.exactUnique(4,4);
		for(int element:decimal)
		{
			System.out.print(element+" -> ");
			System.out.println(dectoHex(element));
		}
	}

}
