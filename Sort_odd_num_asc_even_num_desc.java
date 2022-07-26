package aaa;
import java.util.*;
public class Sort_odd_num_asc_even_num_desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size : ");
		int n=s.nextInt();
		int arr[]=new int[n];
		int odd[]=new int[n];
		int even[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int a=0,b=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even[b]=arr[i];
				b++;
			}
			else
			{
				odd[a]=arr[i];
				a++;
			}
		}
		int temp;
		
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(odd[i]>odd[j])
				{
					temp=odd[i];
					odd[i]=odd[j];
					odd[j]=temp;
				}
				
			}
		}
		for(int i=0;i<a;i++)
		{
			System.out.print(odd[i]+" ");
		}
		
		for(int i=0;i<b;i++)
		{
			for(int j=i+1;j<b;j++)
			{
				if(even[i]<even[j])
				{
					temp=even[i];
					even[i]=even[j];
					even[j]=temp;
				}
				
			}
		}
		for(int i=0;i<b;i++)
		{
			System.out.print(even[i]+" ");
		}
	}

}

/*
 * input : 5 8 11 6 2 1 7
 * output: 1 5 7 11 8 6 2 
 * 
 *
 * */


