package aaa;
import java.util.*;
public class add_sub_mult_div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b value :");
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println("Addition "+(a+b));
		System.out.println("Substruction "+(a+(-b)));
		int sum=0;
		for(int i=1;i<=Math.abs(a);i++)
		{
			sum=Math.abs(sum)+Math.abs(b);
		}
		int k=sum;
		if(a<0 || b<0)
			sum=-k;
		if(a<0 && b<0)
			sum=k;
		System.out.println("Multiplication "+sum);
		int max=Math.abs(a)>Math.abs(b)?Math.abs(a):Math.abs(b);
		int min=Math.abs(a)<Math.abs(b)?Math.abs(a):Math.abs(b);
		int c=0;
		while(max >= min)
		{
			min=min+min;
			c++;
		}
		k=c;
		if(a<0 || b<0)
			c=-k;
		if(a<0 && b<0)
			c=k;
		System.out.println("division "+c);
	}

}
