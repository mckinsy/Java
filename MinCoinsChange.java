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
		    
		} // be decent look , be serious no unnecessary laugh even very very scarce laugh, be serious and most impressive unique
         //i am not the one who try to excell world is so big to beat others i've to work more hard and think more effectively and optimistic also optimized precise 
      ///be ready for such situation where maximum fails nd you excell there keep working 
     // kbhi kisi ko poora gyan mt do khuli kitaab mt bno jb bhi kisi se milo usse direct high level knowledge mt do usski level of understanding ko prkho sbse basic sbse km cheez use btaao vha se start kro phir aage tk le jaao agr vo smjh le to vrna khud aaage bdo use choro vhi nipta do topic khtm
     // e very very curious and exciting to learn new and quick also accurate
   ///i want to become user friendly programs, fun to use,easy to understand, simple and most super smart also creative innovative revolutionary and impressive ,real heroic, solid player,attractive which make others jaw drops and impress them jai shree krishna
//desired to be the bestest of all so be underground and work continuously improve yourself to excellent in world international level excellence
//speak through actions rather than speaking everything also be man of your word also keep rocking keep shocking, what's next till lead the world in excellence and beyond that like google so no one can think to compete