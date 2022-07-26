package aaa;
import java.util.*;
public class Find_extra_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter n1 and n2 : ");
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println("Enter 1st arr : ");
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=s.nextInt();
		}
		int arr2[]=new int[n2];
		System.out.println("Enter 2nd arr : ");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=s.nextInt();
		}
	//	Arrays.sort(arr1);
	//	Arrays.sort(arr2);
		int max=0;
		int min=0;
		
		max=n1<n2?n2:n1;
		min=n1>n2?n2:n1;
		int num=n1>n2?1:2;
		for(int i=0;i<max;i++)
		{
			int f=0;
			for(int j=0;j<min;j++)
			{
				if(num==1)
				{
					if(arr1[i]==arr2[j])
					{
						f=1;
						break;
					}
				}
				else
				{
					if(arr2[i]==arr1[j])
					{
						f=1;
						break;
					}
				}
				
			}
			if(f==0)
			{
				if(num==1)
					System.out.println(arr1[i]);
				else
					System.out.println(arr2[i]);
				break;
			}
		}	
	
	}

}
