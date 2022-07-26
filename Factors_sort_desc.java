package aaa;
import java.util.*;
public class Factors_sort_desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter size ");
		int n=s.nextInt();
		int arr[]=new int[n];
		int a[]=new int[n];
		System.out.println("Enter values : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int b,k=0;
		for(int i=0;i<n;i++)
			
		{
			b=0;
			k=arr[i];
			for(int z=1;z<=k;z++)
			{
				if(arr[i]%z==0)
				{
					b++;
				}
			}
			a[i]=b;
		}
		System.out.println("Factors ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		int temp,t1;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					t1=arr[i];
					
					a[i]=a[j];
					arr[i]=arr[j];
					
					a[j]=temp;
					arr[j]=t1;
				}
			}
		}	
		System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

/*
 * 	array size = 7
	input : 5 11 10 20 9 16 23	
	Factors:2  2  4  6 3  5  2
		 
	output: 20 16 10 9 5 11 23 
 *  explanation : 
 *  		num.of distinct factors:
 *  		for >>  20=6,16=5,10=4,9=3, 5=2,11=2,23=2;
 * 
 * input :104 210 315 166 441 180
 * Factors: 8  16  12   4   9  18 
 * output:180 210 315 441 104 166
 * */
