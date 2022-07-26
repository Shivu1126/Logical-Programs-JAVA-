package aaa;
import java.util.*;
public class possible_psuedobinary_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		while(n!=0)
		{
			int temp=n,m=0,p=1;
			while(temp!=0)
			{
				int rem=temp%10;
				temp=temp/10;
				if(rem!=0)
				{
					m+=p;
				}
				p*=10;
			}
			System.out.println(m+" ");
			n=n-m;
		}
		
	}

}
