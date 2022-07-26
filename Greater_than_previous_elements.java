package aaa;
import java.util.*;
public class Greater_than_previous_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter size : ");
		int n=s.nextInt();
		System.out.println("Enter array : ");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.print(arr[0]+" ");
		for(int i=1;i<n-1;i++)
		{
			if(arr[i]>arr[i-1])
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
