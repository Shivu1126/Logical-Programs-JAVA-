package aaa;
import java.util.*;
public class Thershold_find_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter size : ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array values : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter thereshold : ");
		int ts=s.nextInt();
		int c,sum=0;
		for(int i=0;i<n;i++)
		{
			c=0;
			if(arr[i]%ts!=0)
			{
				c++;
			}
			c+=arr[i]/ts;
			sum=sum+c;
		}
		System.out.println("Sum : " + sum);
	}

}
