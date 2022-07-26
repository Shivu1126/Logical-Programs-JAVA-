package aaa;
import java.util.*;
public class Odd_desc_Even_asce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int arr[]=new int[n];
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];

		int k=0;
		int l=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			if(i%2==0)
			{
				a[k]=arr[i];
				k++;
			}
			else
			{
				b[l]=arr[i];
				l++;
			}
		}
		int temp;
		int t=0;
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			c[t]=a[i];
			t+=2;
		}
		t=1;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(b[i]>b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
			c[t]=b[i];
			t+=2;
		}
		int i=0;
		for( i=0;i<t;i++)
		{
			System.out.print(c[i]+" ");
		}
	
	}

}
