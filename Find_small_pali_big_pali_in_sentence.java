package aaa;
import java.util.*;
public class Find_small_pali_big_pali_in_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string : ");
		String str=s.nextLine();
	
		int len=str.length();
		String part="";
		String rev="";
		String small="",big="";
		int slen=0;
		int f=0;
		for(int i=0;i<len;i++)			
		{
			if(str.charAt(i)!=' ')
				part+=str.charAt(i);
			if(str.charAt(i)==' ')
			{
				for(int k=part.length()-1;k>=0;k--)
				{
					rev+=part.charAt(k);
				}
				if(part.equals(rev))
				{
					if(f==0)
					{
						small=part;
						big=part;
						f=1;
					}
					if(small.length()>=part.length())
					{
						small=part;
					}
					if(big.length()<=part.length())
					{
						big=part;
					}
				}
				part="";
				rev="";
			}			
		}
		
		rev="";
		for(int k=part.length()-1;k>=0;k--)
		{
			rev+=part.charAt(k);
		}
		if(part.equals(rev))
		{
			if(small.length()>=part.length())
			{
				small=part;
			}
			if(big.length()<=part.length())
			{
				big=part;
			}
		}
		System.out.println(small);
		System.out.println(big);
	}

}
