package aaa;
import java.util.*;
public class Number_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i=0,j=0;
		int t=1;
		while(t<10000)
		{
			int temp=t;
			int flag=1;
			while(temp>10)
			{
				int h=temp%10;
				temp=temp/10;
				if(h!=3 && h!=4)
					flag=0;
			}
			if((temp==3 || temp==4)&&flag==1)
				System.out.println(t+" ");
			t++;
		}
	}
}
