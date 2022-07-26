package aaa;
import java.util.*;
public class check_if_2_numbers_sum_equal_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter size :");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values :");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter checking sum val : ");
		int k=s.nextInt();
		int f=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					if(arr[i]+arr[j]==k)
					{
						System.out.println("TRUE");
						f=1;
						return;
					}
				}
			}
		}
		if(f==0)
		{
			System.out.println("FALSE");
		}
		
	}

}
