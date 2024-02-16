package numbers;

//class Key
//{
//	char ar[]= new char[3]; 
//}
//
//public class KeyCombination  //logic1 O(n^4) logic3 is same but String approach
//{
//	int count =65; 
//	ArrayList<Key> al=new ArrayList<Key>();
//	static  Scanner sc= new Scanner(System.in); 
//
//	public void initialize() 
//	{
//		for(int j=0;j<9;j++) 
//		{
//			Key k=new Key(); 
//////			if(count>90) 
//////				return;
////			for(int i=0;i<3;i++)
////			{
////				k.ar[i]=(char)count;
////				count++;
////			}
////			al.add(k);
//		} 
//	}
//	public void combination(int key1,int key2)
//	{
//		String str="";
//		for(int i=0;i<al.get(key1).ar.length;i++)
//		{
//			for(int j=0;j<al.get(key2).ar.length;j++)
//			{
//				char c=al.get(key1).ar[i];
//				char d=al.get(key2).ar[j];
//				if(c!='['&&d!='[') 
//				str+=c+" "+d+"\n";
//			}
//		}
//		System.out.println(str);
//	}
//	public static void main(String[] args) 
//	{
//		KeyCombination kc=new KeyCombination();
//		kc.initialize();
//		System.out.println("Enter combination key 1 between 1 to 9");
//		try
//		{
//			int key1=sc.nextInt()-1;
//			System.out.println("Enter combination key 2 between 1 to 9");
//			int key2=sc.nextInt();
//			kc.combination(key1,key2-1);
//		}
//		catch(Exception ob)
//		{
//			System.err.println("input cannot be more than 9 or less than 0 "+ ob);
//		}
//	}
//}
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