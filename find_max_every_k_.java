package aaa;
import java.util.*;
public class find_max_every_k_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter size K :");
		int k=s.nextInt();
		int max;
		for(int i=0;i<=n-k;i++)
		{
			max=arr[i];
			for(int j=1;j<k;j++)
			{
				if(arr[i+j]>max)
				{
					max=arr[i+j];
				}
			}
			System.out.println(max);
		}
		
	}

}
