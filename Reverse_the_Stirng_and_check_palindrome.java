package aaa;
import java.util.*;
public class Reverse_the_Stirng_and_check_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str=s.nextLine();
		int len=str.length();
		String rev="";
		
		for(int i=len-1;i>=0;i--)
		{
			if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))
			{
				rev+=str.charAt(i);
			}
		}
		int k=0;
		int f=0;
		for(int i=0;i<len;i++)
		{
			if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))
			{
				if(rev.charAt(k)==str.charAt(i))
				{
					k++;
				}
				else
				{
					f=1;
				}
			}
		}
		if(f==0)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
		
	}

}
/*

input : race car			i did,did i?			siva ram
output: palindrome			palindrome				not palindrome


*/