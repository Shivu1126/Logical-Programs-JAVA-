package aaa;
import java.util.*;
public class Days_between_2_dates {

	static int monthDays[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	static int countLeap(int d[])
	{
		int years=d[2];
		if(d[1]<=2)
		{
			years--;
		}		
		return years/4 - years/100 + years/400;
	}
	
	static int getDiff(int dt1[],int dt2[])
	{
		int n1=dt1[2] * 365 + dt1[0];
		for(int i=0;i<dt1[1]-1;i++)
		{
			n1+=monthDays[i];
		}
		n1+=countLeap(dt1);
		
		int n2=dt2[2] * 365 + dt2[0];
		for(int i=0;i<dt2[1]-1;i++)
		{
			n2+=monthDays[i];
		}
		n2+=countLeap(dt2);
		
		return (n2-n1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int dt1[]= {10,2,2014};
		int dt2[]= {10,3,2015};
		System.out.println("Days : "+getDiff(dt1,dt2));
	}

}
