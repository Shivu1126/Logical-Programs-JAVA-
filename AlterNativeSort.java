package aaa;

import java.util.Arrays;
import java.util.Scanner;

public class AlterNativeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n1,i,j;
		n1=s.nextInt();
		
		int arr1[]=new int[n1];
		int arr2[]=new int[n1];
		
		System.out.print("Enter  array value :\n");
		for(i=0;i<n1;i++)
		{
			arr1[i]=s.nextInt();
		}
		
		Arrays.sort(arr1);
		
		i=0;j=n1-1;
		while(i<j)
		{
			System.out.printf("%d ",arr1[j--]);
			System.out.printf("%d ",arr1[i++]);			
		}
		if( n1%2 != 0 )
		{
			System.out.printf("%d ",arr1[i]);	
		}
	}

}
