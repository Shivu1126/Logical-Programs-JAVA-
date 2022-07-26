package aaa;
import java.util.*;
public class Corresponding_Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		System.out.println(check(n));
		s.close();
	}
	public static String check(int n)
	{
		if(n<0)
		{
			return "-"+check(-n-1);
		}
		int q=n/26;
		int rem=n%26;
		char let=(char)((int)'A'+rem);
		if(q==0)
			return ""+let;
		else
			return check(q-1)+let;
	}
}
