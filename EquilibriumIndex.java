package aaa;
import java.util.*;
public class EquilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size : ");
		int n=s.nextInt();
		System.out.println("Enter arr vslues : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int ls,rs;
		int f=0;
		for(int i=0;i<n;i++)
		{
			ls=0;
			for(int j=0;j<i;j++)
			{
				ls=ls+arr[j];
			}
			rs=0;
			for(int j=i+1;j<n;j++)
			{
				rs=rs+arr[j];
			}
			if(ls==rs)
			{
				f=1;
				System.out.println(arr[i]);
				break;
			}
		}
		if(f==0)
		{
			System.out.println(-1);
		}
		
		
	}

}
