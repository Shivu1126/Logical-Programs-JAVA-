package aaa;
import java.util.*;
public class Sum_math_expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter : ");
		String str=s.next();
		int n=str.length();
		//1+2*3=9
		int sum=0;
	    char arr[]=str.toCharArray();
	    
 		int t = str.charAt(0)-'0';
		for(int i=1;i<n-1;i=i+2)
		{
			if( arr[i]=='+')
			{
				t+=(arr[i+1]-'0');				
			}
			else if(arr[i]=='-')
				t-=arr[i+1]-'0';
			else if(arr[i]=='*')
				t*=arr[i+1]-'0';
			else if(arr[i]=='/')
				t/=arr[i+1]-'0';
		}		
		System.out.println(t);
	}

}
