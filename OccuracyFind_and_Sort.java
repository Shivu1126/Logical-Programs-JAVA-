package aaa;
import java.util.*;
public class OccuracyFind_and_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter size : ");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				int temp=0;
				if(check(arr[i]) <= check(arr[j]))
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
				}
			}	
		
		}
		
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

	static int check(int a)
	{
		int c=0;
		while(a!=0)
		{
			if(a%10==6)
			{
				c++;
			}
			a/=10;
		}
		return c;
	}
}
