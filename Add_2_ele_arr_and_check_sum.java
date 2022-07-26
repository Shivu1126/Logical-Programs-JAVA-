package aaa;
import java.util.*;
public class Add_2_ele_arr_and_check_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size : ");
		int n=s.nextInt();
		System.out.println("Enter sum value : ");
		int k=s.nextInt();
		System.out.println("Ente values : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();							
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				
					if(arr[i]+arr[j]==k)
					{
						System.out.println(arr[i]+","+arr[j]);
					}				
			}
		}
		s.close();
	}

}
