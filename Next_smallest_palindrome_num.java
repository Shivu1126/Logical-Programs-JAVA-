package aaa;
import java.util.*;
public class Next_smallest_palindrome_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=s.nextInt();
		
		while(check(n)==0)
		{
			n=n+1;
		}
		System.out.println("Next palindrome "+n);
	}
	static int check(int n)
	{
		int t=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(t==sum)
			return 1;
		else
			return 0;
	}
}
