package aaa;
import java.util.*;
public class Union_Inter_Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];
		System.out.println("1st array :");
		for(int i=0;i<n1;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("2nd array :");
		for(int i=0;i<n2;i++)
		{
			b[i]=s.nextInt();
		}
		System.out.println("Intersection :");
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(b[j]==a[i])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("UNION :");
		int i=0,j=0;
		while(i<n1 && j<n2)
		{
			if(a[i]<b[j])
			{
				System.out.print(a[i]);
				i++;
			}
			else if(b[j]<a[i])
			{
				System.out.print(b[j]);
				j++;
			}
			else
			{
				System.out.print(b[j]);
				j++;
				i++;
			}
		}
		while(i<n1)
		{
			System.out.print(a[i]);
			i++;
		}
		while(j<n2)
		{
			System.out.print(b[j]);
			j++;
		}
	}

}
