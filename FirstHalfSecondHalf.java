package aaa;
import java.util.*;
public class FirstHalfSecondHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		Long N=s.nextLong();
		Long n1=N;
		Long  k=0l;
		int rem;
		int len=0;
	//Reverse the Number
		while(N!=0)
		{
			rem=(int)(N%10);
			k=k*10+rem;
			N/=10;
			len++;
		}
		
	//System.out.println(k);
		
	//add last 3 digit in N and k
		int tot1=0,tot2=0,i=0;
		while(len/2>i)
		{
			tot1=(int)(tot1+(n1%10));
			tot2=(int)(tot2+(k%10));
			n1=n1/10;
			k=k/10;
			i++;
		}
	//System.out.println(tot1+" "+tot2);
		
	//check	
		if(tot1==tot2)
		{
			System.out.println("its equal");
		}
		else
		{
			System.out.println("its not equal");
		}
	}

}
