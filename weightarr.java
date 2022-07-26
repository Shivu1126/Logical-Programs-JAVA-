package aaa;
import java.util.*;
public class weightarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	int k=39;
			int res=(int)Math.sqrt(k);
			System.out.println(Math.sqrt(k));	*/
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int arr[]=new int[n];
		int tem[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int res=(int)Math.sqrt(arr[i]);
			if(res*res==arr[i])
			{
				sum+=5;
			}
			
			if(arr[i]%4==0 && arr[i]%6==0)
			{
				sum+=4;
			}
			if(arr[i]%2==0)
			{
				sum+=3;
			}
			
			tem[i]=sum;
			sum=0;
			
		}
		int temp=0;
		int t1=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(tem[i]<tem[j])
				{
					temp=tem[i];
					tem[i]=tem[j];
					tem[j]=temp;
					
					t1=arr[i];
					arr[i]=arr[j];
					arr[j]=t1;
					
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" "+tem[i]);
			System.out.println();
		}
	}

}
