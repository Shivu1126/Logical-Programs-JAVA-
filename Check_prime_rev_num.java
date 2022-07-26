package aaa;
import java.util.*;
public class Check_prime_rev_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=s.nextInt();
		//check n prime or not
		boolean a=check(n);
		//reverse the number
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		//again check
		boolean b=check(sum);
		
		//check a and b are true
		if(a==b)
			System.out.println("Twisted prime number ");
		else
			System.out.println("Not twisted prime number ");
	}

	static boolean check(int n)
	{
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
/*

input : 97
output: Twisted prime number
//explanation ==>>97>>  1st check n is prime or not...97 is prime....
				    	then reverse the n and check it prime or not....79 is prime ...
				  		so it is  TWISTED PRIME NUMBER	
				  43>>	1st check n is prime or not...43 is prime....
				  		then reverse the n and check it prime or not....34 is Not prime...
				  		so it is NOT TWISTED PRIME NUMBER	
*/