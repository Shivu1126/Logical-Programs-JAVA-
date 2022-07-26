package aaa;
import java.util.*;
public class Merged_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n1=s.nextInt();
		int n2=s.nextInt();
		int a1[]=new int[n1];
		int a2[]=new int[n2];
		
		int a3[]=new int[n1+n2];
		
		int k=0;
		for(int i=0;i<n1;i++)
		{
			a1[i]=s.nextInt();
			a3[k++]=a1[i];
			
		}
		
		for(int i=0;i<n2;i++)
		{
			a2[i]=s.nextInt();	
			a3[k++]=a2[i];
			
		}
		// using sort
	/*	Arrays.sort(a3);
		int temp[]=new int[k];
		int j=0;
		for(int i=0;i<k-1;i++)
		{
			if(a3[i]!=a3[i+1])
			{
				temp[j++]=a3[i];
			}
		}
		temp[j++]=a3[k-1];
		
		for(int i=0;i<j;i++)
		{
			a3[i]=temp[i];
		}
		
		
		for(int l=0;l<j;l++)
		{
			System.out.println(temp[l]);
		}
		
		*/
		
		//without sort
		
		int temp[]=new int[k];
		
		for(int i=0;i<k;i++)
		{
			boolean b=true;
			for(int j=i+1;j<k;j++)
			{
				if(a3[i]==a3[j])
				{
					b=false;
				}
			}
			if(b)
			{
				temp[i]=a3[i];
			}
		}
		
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]!=0)
				System.out.println(temp[i]);
		}
	}

}
