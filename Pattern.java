package aaa;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N value");
		int n=s.nextInt();
		int t=n;
		int k=1;
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(k+" ");
				k=k+n-j;
			}
			k=n-i+2;
			System.out.println();
		}
	}

}
/*
N=7

1 7  12 16 19 21
2 8  13 17 20
3 9  14 18
4 10 15 
5 11 
6



*/