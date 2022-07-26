package aaa;
import java.util.*;
public class Longest_seq_between_same_char {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string : ");
		String str=s.next();
		int len=str.length();
		int max=0;
		for(int i=1;i<len;i++)
		{
			if(str.charAt(0)==str.charAt(i))
			{
				max=i;
			}
		}
		if(max==0)
		{
			System.out.println("No char");
		}
		else
		{
			System.out.println(max-1);
		}
	}
}
/*
input : abcccccbba
output: 8 (from a to a)

input : aaaaaaaa
output: 6
*/