package aaa;
import java.util.*;
public class second_Greater_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int len=s.nextInt();
		int a[]=new int[len];
		int b[]=new int[len];
		System.out.println("Enter values");
		int k=0,max=0;
		for(int i=0;i<len;i++)
		{
			a[i]=s.nextInt();
			if(max<a[i])
			{
				max=a[i];
				b[k++]=max;
			}
		}
	/*	for(int i=0;i<k;i++)
		{
			System.out.print(b[i]+" ");
		} */		
		System.out.println("Second greatest element : "+b[k-2]);
	}

}
/*
 * input : 245 467 45 568 354
 * output: Second greatest element : 467
 * 
 * */
 