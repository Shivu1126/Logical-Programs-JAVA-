package aaa;
import java.util.*;
public class Reverse_string_if_char_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str=s.next();
		int n=str.length();
		
		String rev="";
		char arr[]=new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=str.charAt(i);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ) 
			{
				rev=rev+str.charAt(i);
			}
		}
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'  )
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
