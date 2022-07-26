package aaa;
import java.util.*;
public class Odd_Even_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		
		int rem;
		int even=0,odd=0;
		while(n>0)
		{
			rem=n%10;
			if(rem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			n=n/10;
		}
		System.out.println("Even "+even);
		System.out.println("Odd "+odd);
	}

}
/*
	input : 123456				 89373
	output : 					
			Even 3				Even 1
			Odd  3				Odd  4
*/