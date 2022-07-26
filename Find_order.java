package aaa;
import java.util.*;
public class Find_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter size :");
		int n=s.nextInt();
		System.out.println("enter elements :");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int inc=1,dec=1;
	
		//increment,decrement
		for(int i=1;i<n;i++)
		{
			if(arr[0]<arr[i])
			{
				inc++;
			}
			if(arr[0]>arr[i])
			{
				dec++;
			}
			
		}
		if(inc==n)
		{
			System.out.println("increase");
			return;
		}
		if(dec==n)
		{
			System.out.println("decrease");
			return;
		}
		
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]<arr[i+1])
			{
				//continu
			}
			
			
		}
		
		
	}

}
