package aaa;
import java.util.*;
public class Add_2_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter n1 and n2 values : ");
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println("Enter arr1 values : ");
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=s.nextInt();
		}
		System.out.println("Enter arr2 values : ");

		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			arr2[i]=s.nextInt();
		}
		
		int temp[]=new int[n1+n2];
		int rem=0,q=0;
		int i=0;
		int a=n1-1;
		int b=n2-1;
		while(a>=0 && b>=0 )
		{
			int add=arr1[a]+arr2[b]+q;
			if(add>9)
			{
				rem=add%10;
				q=add/10;
				temp[i]=rem;
				i++;
			}
			else
			{
				temp[i]=add;
				q=0;
				i++;
			}		
			a--;
			b--;
		}
		while(a>=0)
		{
			temp[i]=arr1[a]+q;
			a--;
			i++;
		}
		while(b>=0)
		{
			temp[i]=arr1[b]+q;
			b--;
			i++;
		}
		
		for(int k=i-1;k>=0;k--)
		{
			System.out.print(temp[k]+" ");
		}
	}
}

/*
 * input : 							
 *							 					arr1 		
 *  											1 2 3 4 5 6
												arr2	
	arr1			  							4 5 6 7
	9 2 8 1 3 5 6 7 3 1 1 6						output:
	arr2  				 							1 2 8 0 3 3
	7 8 4 6 2 1 9 9 7
	output :
	9 2 8 9 2 0 2 9 5 1 1 3 
 */

