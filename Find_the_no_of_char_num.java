package aaa;
import java.util.*;
public class Find_the_no_of_char_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=s.nextInt();
		int i=1,c=0;
		int temp=1;
		while(i<=n)
		{
			if(temp!=0)
			{
				c++;
				temp=temp/10;
			}
			if(temp==0)
			{
				i++;
				temp=i;
			}
		}
		System.out.println(c);		
		s.close();		
	}
}
/*
 * input : 13							input:101
 * output : 17							output:195
 * explanation : 
 * 			1 -> 1 digit
 * 			2 -> 1 digit
 * 			3 -> 1 digit
 * 			4 -> 1 digit
 * 			5 -> 1 digit
 * 			6 -> 1 digit
 * 			7 -> 1 digit
 * 			8 -> 1 digit
 * 			9 -> 1 digit
 * 			10 -> 2 digit
 * 			11 -> 2 digit
 * 			12 -> 2 digit
 * 			13 -> 2 digit
 * ----------------------
 *	sum of digit = 17
 * 
 * 
*/

