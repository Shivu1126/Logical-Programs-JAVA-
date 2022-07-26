package aaa;
import java.util.*;
public class Check_sub_str_letters_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string : ");
		String str1=s.next();
		System.out.println("Enter sub string : ");
		String str2=s.next();

		int n1=str1.length();
		int n2=str2.length();
		int f=0;
		int arr[]=new int[n1];
		int k=0;
		for(int i=0;i<n2;i++)
		{
			for(int j=0;j<n1;j++)
			{
				if(str2.charAt(i)==str1.charAt(j))
				{
					arr[k]=j;
					k++;
				}
			}
		}
		int temp;
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
/*		for(int i=0;i<k;i++)
		{
			System.out.print(arr[i]+" ");
		}		*/
		System.out.println("new string");
		k=0;
		for(int i=0;i<n1;i++)
		{
			if(arr[k]!=i)
				System.out.print(str1.charAt(i));			
			else
				k++;	
		}	
	}
}

/*
 * 
 * 	input : str1 = experiance
 *  		str2 = en
 *  output: xpriac
 * */
