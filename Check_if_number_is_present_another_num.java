package aaa;
import java.util.*;
public class Check_if_number_is_present_another_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		System.out.println("enter check val : ");
		int ch=s.nextInt();
		int f=1;
		while(n>0)
		{
		
			int rem=n%10;
			if(rem==ch)
			{				
				System.out.println("Number is present...");
				break;
			}
			n=n/10;
		}
		if(f==1)
			System.out.println("not present");
		
	}

}
