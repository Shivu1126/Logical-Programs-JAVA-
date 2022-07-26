package aaa;
import java.util.*;
public class Recursion_Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans;
	//	String st[][]=new String[100][100];
		int len=str.length()-1;
		int k=len;
		for(int i=len;i>=0;i--)
		{
			int r=0;
			if(str.charAt(i)==' ')
			{
				k=i+1;
				for(int j=k;j<=len;j++)
				{
					System.out.print(str.charAt(j));
				}
				System.out.print(" ");
				len=i-1;
			}
		}
		for(int i=0;i<=len;i++)
		{
			System.out.print(str.charAt(i));
		}	
	}

}
