package aaa;
import java.util.*;
public class Rotate_90degree_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter size : ");
		int n=s.nextInt();
		System.out.println("Enter values : ");
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("Before rotate ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After rotate (Direct): ");
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter degree value : ");
		int deg=s.nextInt();
		
		if(deg==90)
		{
			deg=1;
		}
		if(deg==180)
		{
			deg=2;
		}
		if(deg==270)
		{
			deg=3;
		}
		if(deg==360)
		{
			deg=4;
		}
		System.out.println("After rotate (Swapping): ");
		int p=1;
		while(deg>=p)
		{
			for(int i=0;i<n/2;i++)
			{
				for(int j=i;j<n-1-i;j++)
				{
					int temp=arr[i][j];
					
					arr[i][j]=arr[j][n-1-i];
					arr[j][n-1-i]=arr[n-1-i][n-1-j];
					arr[n-1-i][n-1-j]=arr[n-1-j][i];
					arr[n-1-j][i]=temp;
					
				}
			}
			p++;
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		s.close();
	}

}
