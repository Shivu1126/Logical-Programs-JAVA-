package aaa;
import java.util.*;
public class Math_expression_valid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		
		int a=0,b=0,flag=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				a++;
			}
			if(str.charAt(i)==')')
			{
				b++;
			}
			
			if(str.charAt(i)=='+' || str.charAt(i)=='-' || str.charAt(i)=='/' || str.charAt(i)=='*')
			{
				
				if((str.charAt(i+1)>='a' && str.charAt(i+1)<='z') && str.charAt(i-1)>='a' && str.charAt(i-1)<='z')
				{
					flag=1;
				}
				else
				{
					System.out.println("Invalid expression");
					return;
				}
				
			}						
		}
		if(a==b && flag==1)
		{
			System.out.println("Valid expression");
		}
		else
		{
			System.out.println("Invalid expression");
		}
		
	}

}
