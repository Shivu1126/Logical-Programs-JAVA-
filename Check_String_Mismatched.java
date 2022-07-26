package aaa;
import java.util.*;
public class Check_String_Mismatched {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		
		int n=str1.length();
		
		for(int i=0;i<n;i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				System.out.println(str1.charAt(i)+","+str2.charAt(i));
			}
		}
		
	}

}
