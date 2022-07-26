package aaa;
import java.util.*;
public class adding_a_digit_to_all_the_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=s.nextInt();
		System.out.println("Enter n value");
		int n=s.nextInt();
		
		int arr[]=new int[40];
		int i=0;
		while(num>0)
		{
			int rem=num%10;
			arr[i++]=rem+n;
			num=num/10;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
	}

}
