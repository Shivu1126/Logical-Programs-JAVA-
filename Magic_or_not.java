package aaa;
import java.util.*;
public class Magic_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		int sum=0;
		int k;
		while(n>0 || sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			k=n%10;
			sum=sum+k;
			n=n/10;
		}
		if(sum==1)
		{
			System.out.println("Magic");
		}
		else
		{
			System.out.println("Not Magic");
		}
	}

}
