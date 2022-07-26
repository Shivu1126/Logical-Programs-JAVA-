package aaa;
import java.util.*;
public class Find_leap_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		if((n%4==0 && n%100!=0) || n%400==0)
		{
			System.out.println("leap");
		}
		else
			System.out.println("not");
		
		System.out.println("a to b year leap : ");
		int a=s.nextInt();
		int b=s.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			if((i%4==0 && i%100!=0) || i%400==0)
			{
				System.out.println(i);
			}
		}
	}

}
