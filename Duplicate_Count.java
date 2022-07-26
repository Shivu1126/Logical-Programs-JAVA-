package aaa;
import java.util.*;
public class Duplicate_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int visit[]=new int[n];
		Arrays.fill(visit,0);
		for(int i=0;i<n;i++)
		{
			if(visit[i]==0)
			{
				int count=1;
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]==arr[j])
					{
						visit[j]=-1;
						count++;
					}
				}
				System.out.println(arr[i]+"->"+count);
			}
		}
		
	}

}
