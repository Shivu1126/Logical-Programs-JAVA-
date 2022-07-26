package aaa;
import java.util.*;
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		System.out.println("Enter values : ");
		int arr[]=new int[100];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			if(i!=0)
			{
				if(arr[i]==1&&arr[i-1]==1)
				{
					n++;
					arr[i+1]=0;
					i++;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
