package aaa;
import java.util.*;
public class if_num_repeated_add {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size ");
		int n=s.nextInt();
		System.out.println("Enter values ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			if(i!=0)
			{
				if(arr[i-1]==arr[i])
				{
					arr[i]+=arr[i-1];
					arr[i-1]=0;
					
				}
			}
		}
		System.out.println("OUTPUT : ");
		int k=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				k++;
				System.out.print(arr[i]+" ");
			}
		}
		for(int i=k;i<n;i++)
		{
			System.out.print(0+" ");
		}
	}
}
/*
 * input : 0 2 2 2 0 6 6 0 8
 * output: 4 2 12 8 0 0 0 0 0
 * 
 * 
 * */
