package aaa;
import java.util.*;
public class Find_1st_greater_ {

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
		int a[]=new int[n];
		int x;
		for(int i=0;i<n;i++)
		{
			int max=0;
			int f=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					max=arr[j];
					f=1;
					for(int k=0;k<n;k++)
					{
						if(max>arr[k] && arr[i]<arr[k])
						{
							max=arr[k];
							
						}
								
					}
					break;
				}
			}
			if(f==1)
			{
				System.out.println(arr[i]+"<"+max);
			}
			else
			{
				System.out.println(arr[i]+"<");
			}
		}
	}

}
