package aaa;
import java.util.*;
public class Remove_Zero_Add_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(removeZero(a)+removeZero(b)==removeZero(a+b))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
	public static int removeZero(int n)
	{
		int res=0;
		int d=1;
		int k;
		while(n>0)
		{
			if(n%10 != 0)
			{
				k=(n%10)*d;
				res=res+k;
				d=d*10;
			}
			n=n/10;
		}
		return res;
	}

}
