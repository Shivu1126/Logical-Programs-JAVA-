package aaa;
import java.util.*;
public class Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter distance : ");
		int d=s.nextInt();
		int temp[]=new int[n];
		int z=0;
		for(int i=d;i<n;i++)
		{
			temp[z]=arr[i];
			z++;
		}
	//	System.out.println(z);
		for(int i=0;i<d;i++)
		{
			temp[z]=arr[i];
			z++;
		}
		
		for(int i=0;i<z;i++)
		{
			System.out.println(temp[i]);
		}
	}

}
