package algorithms;

import arrays.Beautify;

public class Merge_Sort 
{ 
	static int call=0;
	public static void merge(int array[],int start_Index,int middle,int end_Index,int callVal) // be careful we should use <= or >= because these all indexes passed are accurate indexes
	{
		int new_array[] = new int[end_Index-start_Index+1];
		
		int idx_LeftSub_Arr=start_Index;
		int idx_RightSub_Arr=middle+1;   // Hypothetical/fictional array which is inside argumented array in form of indexes
		
		int idx_new_array=0;
		
		String postfix=callVal==1?"st":callVal==2?"nd":callVal==3?"rd":"th";
		
		System.out.println("Current recursion : "+callVal+postfix+"\n");
		
		System.out.println("Array received : ");
		Beautify.display(array);
		System.out.println();
		
		System.out.println("\n[ Starting index : "+start_Index+" ] [ Middle index : "+middle+" ] [ End index : "+end_Index+" ]");
		System.out.println("new array size : "+new_array.length);
		
		System.out.print("\nLeft sub array : [ ");
		for(int i=start_Index;i<=middle;i++)
			System.out.print(array[i]+" ");
		
		System.out.println("]");
		
		System.out.print("Right sub array : [ ");
		for(int i=middle+1;i<=end_Index;i++)
			System.out.print(array[i]+" ");
		
		System.out.println("]");
		
	//--------------------------M.A.I.N----------L.O.G.I.C---------------------------------
		
		while(idx_LeftSub_Arr<=middle && idx_RightSub_Arr<=end_Index)
		{
			if(array[idx_LeftSub_Arr]<=array[idx_RightSub_Arr])
				new_array[idx_new_array++]=array[idx_LeftSub_Arr++];
			
			else new_array[idx_new_array++]=array[idx_RightSub_Arr++];
		}
		
		while(idx_LeftSub_Arr<=middle)
			new_array[idx_new_array++]=array[idx_LeftSub_Arr++];

		while(idx_RightSub_Arr<=end_Index)
			new_array[idx_new_array++]=array[idx_RightSub_Arr++];

		for(int i=0,j=start_Index;i<new_array.length;i++,j++)
			array[j]=new_array[i];
		
	//----------------------------------------------------------------------------------------	

		System.out.println("\n");
		
		System.out.println("new sorted array :");
		Beautify.display(new_array);
		
		System.out.println();
		
		System.out.println("Original array after insertion :");
		Beautify.display(array);
		
		System.out.println("\n===========================================================================================\n");
	}
	public static void divide_recursively(int[] array,int start_Index, int end_Index,int call)
	{
		if(start_Index<end_Index)
		{
			int mid=(end_Index+start_Index)/2;
			divide_recursively(array,start_Index,mid,++call);
			divide_recursively(array,mid+1,end_Index,++call);
			merge(array,start_Index,mid,end_Index,call);
		}
	}
	public static void main(String[] args)
	{
		int array[] = {3,0,-1,5,0};
		divide_recursively(array,0,array.length-1,call);
	}

}