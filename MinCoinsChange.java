package numbers;
import java.util.*;
public class MinCoinsChange 
{
		    public static int change(int[] a,int amount)
		    {  int total=0;
		        for(int i=0;i<a.length;i++)
		        {
		            total+=amount/a[i];
		            if(amount%a[i]==0)
		                break;
		            amount%=a[i];
		        }
		     return total;
		    }

		    public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        int amount=sc.nextInt();
		        int size=sc.nextInt();
		        int a[]=new int[size];
		        for(int i=0;i<size;i++)
		        {
		         a[i]=sc.nextInt();   
		        }
		        System.out.print(change(a,amount));
		        sc.close();
		    }
		    
		}
