package aaa;
import java.util.*;
public class Remove_palindrom_word_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

		System.out.println("Enter string : ");
		String str=s.nextLine();
		int len=str.length();
		String part="";
		String rev="";
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)!=' ')
				part+=str.charAt(i);
			if(str.charAt(i)==' ')
			{
				for(int k=part.length()-1;k>=0;k--)
				{
					rev+=part.charAt(k);
				}
				if(!part.equals(rev))
				{
					System.out.print(part+" ");					
				}
				part="";
				rev="";
			}			
		}
		
		rev="";
		for(int k=part.length()-1;k>=0;k--)
		{
			rev+=part.charAt(k);
		}
		if(!part.equals(rev))
		{
			System.out.print(part);
		}
			
		
	}

}
/*
 * input : hari speaks malayalam
 * output: hari speaks
 * 
 * input : malayalam is a good deed in india
 * output: is good in india
 *
 */