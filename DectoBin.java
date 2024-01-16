package numbers;

import java.util.HashSet;

public class DectoBin 
{
	public long convert(int num)
	{ 
		long bin=0L;
		long trail=1;		// trail will go long leads to data overflow incorrect output
		while(num>0)   		// 25 > 0	12>0	6 >0	3> 0	1>0
		{
			int i = num%2;  // 1		0		0		1		1
			bin +=i*trail;	// 1		01(1)	001(1)	1001	11001
			trail*=10;		// 10		100		1000	10000	100000
			num/=2;			// 12		6		3		1		0
		}
		//System.out.println(bin);		// 11001
		return bin;
	}
	public static void main(String[] args) 
	{
		DectoBin db=new DectoBin();
		HashSet<Integer> a=Generator.random(2,20); // this saves time complexity bcoz if you call method inside for each loop every time method for will iterate and new array gets created instead make a fixed array first then iterate
		for(int element:a)
		{
			System.out.print(element+" -> ");
			System.out.println(db.convert(element));
		}
		
		HashSet<String> ab=Generator.randomString(6,4);
		for(String element:ab)
			{
				System.out.println(element);
			}
	}
}
