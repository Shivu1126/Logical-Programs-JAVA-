package aaa;
import java.util.*;
public class Find_Odd_in_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		
		for(int i=start;i<end;i++)
		{
			if(i%2==1)
			{
				System.out.print(i+" ");
			}
		}
	}

}
