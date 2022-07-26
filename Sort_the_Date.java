package aaa;
import java.util.*;
public class Sort_the_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<String> dates=new ArrayList<>();
		
		int n=s.nextInt();
		String str;
		System.out.println("Enter date : ");
		for(int i=0;i<n;i++)
		{
			str=s.next();
			dates.add(str);
		}
		
		Collections.sort(dates);
		
		for(String d:dates)
		{
			System.out.println(d);
		}
		
	}

}
