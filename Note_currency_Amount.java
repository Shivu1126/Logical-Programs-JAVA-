package aaa;
import java.util.*;
public class Note_currency_Amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int notes[]=new int[]{2000,500,200,100,50,20,10,5,2,1};
		int notesCurr[]=new int[10];
		System.out.println("Enter amount");
		int amount=s.nextInt();
		for(int i=0;i<10;i++)
		{
			if(amount>=notes[i])
			{
				notesCurr[i]=amount/notes[i];
				amount=amount%notes[i];
			}
		}
		for(int i=0;i<10;i++)
		{
			if(notesCurr[i]!=0)
				System.out.println(notes[i]+"-"+notesCurr[i]);
		}
	}

}
