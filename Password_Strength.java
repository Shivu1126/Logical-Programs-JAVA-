package aaa;
import java.util.*;
public class Password_Strength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter password : ");
		String pass=s.next();
		int len=pass.length();
		
		if(len<=6)
		{
			System.out.println("Weak");
			return;
		}
		int small=0,caps=0,num=0,spcl=0;
		for(int i=0;i<len;i++)
		{
			if(pass.charAt(i)>='a' && pass.charAt(i)<='z')
			{
				small++;
			}
			else if(pass.charAt(i)>='A' && pass.charAt(i)<='Z')
			{
				caps++;
			}
			else if(pass.charAt(i)>='0' && pass.charAt(i)<='9')
			{
				num++;
			}
			else
			{
				spcl++;
			}
		
		}
		
		if(caps==0 && num>0 && small>0)
		{
			System.out.println("Medium");
			return;
		}
		if(num==0 && caps>0 && small>0)
		{
			System.out.println("Medium");
			return;
		}
		if(spcl==0 && caps>0 && small>0)
		{
			System.out.println("Good");
			return;
		}
		if(spcl>0 && caps>0 && small>0)
		{
			System.out.println("Strong");
			return;
		}
	}
}
