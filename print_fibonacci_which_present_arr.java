package aaa;
import java.util.*;
public class print_fibonacci_which_present_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter size : ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values : ");
		int max=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		int a[]=new int[50];
		int n1=0,n2=1,n3=max,k=0;
		while(n3<=max)
		{
			n3=n1+n2;
			a[k++]=n3;
			n1=n2;
			n2=n3;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<k;j++)
			{
					if(arr[i]==a[j])
					{
						System.out.print(arr[i]+" ");
					}
			
			}
		}
			
		
	}

}
/*
 * input : 2 10 4 8					1 10 6 8 13 21
 * output: 2 8						1 8 13 21
 * 
 * */
