package aaa;
import java.util.*;
public class ele_GreaterThan_prev_next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=1;i<n-1;i++)
		{
			if(arr[i-1]<arr[i] && arr[i+1]<arr[i])
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
