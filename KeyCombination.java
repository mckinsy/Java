package numbers;
public class KeyCombination  //logic2 O(n^2) most optimized
{ 
	int count,count1;
	public void initialize(int key1,int key2)
	{
		if(key1==2)
			count=65;
		if(key1==3)
			count=68;
		if(key1==4)
			count=71;
		if(key1==5)
			count=74;
		if(key1==6)
			count=77;
		if(key1==7)
			count=80;
		if(key1==8)
			count=84;
		if(key1==9)
			count=87;
		if(key2==2)
			count1=65;
		if(key2==3)
			count1=68;
		if(key2==4)
			count1=71;
		if(key2==5)
			count1=74;
		if(key2==6)
			count1=77;
		if(key2==7)
			count1=80;
		if(key2==8)
			count1=84;
		if(key2==9)
			count1=87;
	}

	public void combination(int key1,int key2)
	{
		initialize(key1, key2);

		if((key1==7||key1==9)&&(key2==7||key2==9))
		{
			for(int i=count;i<count+4;i++)
			{
				for(int j=count1;j<count1+4;j++) //key2
				{
					System.out.print((char)i+""+(char)j+"\n");
				}
			} return; //or use else if instead
		}
		if((key1==7||key1==9)&&(key2!=7&&key2!=9))
		{
			for(int i=count;i<count+4;i++)
			{
				for(int j=count1;j<count1+3;j++) //key2
				{
					System.out.print((char)i+""+(char)j+"\n");
				}
			} return; //or use else if instead
		}
		if((key2==7||key2==9)&&(key1!=7&&key1!=9))
		{
			for(int i=count;i<count+3;i++)
			{
				for(int j=count1;j<count1+4;j++) //key2
				{
					System.out.print((char)i+""+(char)j+"\n");
				}
			} return; //or use else instead
		}
		for(int i=count;i<count+3;i++)
		{
			for(int j=count1;j<count1+3;j++)
			{
				System.out.println((char)i+""+(char)j);
			}
		}
	}
	public static void main(String[] args) 
	{
		KeyCombination kc=new KeyCombination(); kc.combination(3, 9);
	   //new keyCombination().combination(5,6);
	}
}
