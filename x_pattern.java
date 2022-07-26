package aaa;

import java.util.Scanner;

public class x_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int len,i,j;
		String str;
		System.out.print("Enter the string :");
		str=s.next();
		len=str.length();
		
		for(i=0;i<len;i++)
		{
			for(j=0;j<len;j++)
			{
				if(i==j || i+j==len-1)
				{
					System.out.printf("%c",str.charAt(j));
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}

}
