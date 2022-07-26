package aaa;
import java.util.*;
public class reverse_string_without_chnaging_position_of_space_and_punct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string : ");
		String str=s.nextLine();
		int n=str.length();
/*		int space[]=new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)==' ' || str.charAt(i)=='@')
			{
				space[k]=i;
				k++;
			}
		}
		for(int j=0;j<k;j++)
		{
			System.out.println(space[j]);
		}	
		k=0;
		int t=0;
		for(int i=n-1;i>=0;i--)
		{

			if(str.charAt(i)!=' ' && str.charAt(i)!='@')
			{		
				System.out.print(str.charAt(i));
				t++;
			}
			if(space[k]==t)
			{
				if(str.charAt(t)==' ')
				{
					System.out.print(" ");
					
				}
				if(str.charAt(t)=='@')
				{	
					System.out.print("@");
					
				}
				k++;
				t++;
			}
		
		}	*/
		
		char arr[]=new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=str.charAt(i);
		}
	
		String rev="";
		for(int i=n-1;i>=0;i--)
		{
			
			
			if( (str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='0' && str.charAt(i)<='9'))
			{		
				rev+=str.charAt(i);
			}
		}
		System.out.println(rev);
		int j=0;
		for(int i=0;i<n;i++)
		{
			if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z') || (arr[i]>='0' && arr[i]<='9'))
			{
				arr[i]=rev.charAt(j);
				j++;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
		
	}

}

/*
 * 	i/p ::: house no 123@ cbe
 * 	o/p ::: ebc32 1o nes@ uoh 	
 * 
 * 
 * 
 * 
 * */


