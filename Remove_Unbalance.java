package aaa;
import java.util.*;
public class Remove_Unbalance {

	
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
        System.out.println("Enter the expression:");
        String expression=input.next();
        int openParentheses[]=new int[100];
        int closeParentheses[]=new int[100];
        int toBeRemoved[]=new int[100];
        int opIt=0,cpIt=0,toBeRemovedIt=0;        
        for(int i=0;i<expression.length();i++)
        {
            if(expression.charAt(i)=='(')
            {
                openParentheses[opIt]=i;
                opIt++;
            }
            if(expression.charAt(i)==')')
            {
                closeParentheses[cpIt]=i;
                cpIt++;
            }
            
        }
       /* for(int i=0;i<opIt;i++)
            System.out.print(openParentheses[i]+" ");
        
        for(int i=0;i<cpIt;i++)
            System.out.print(closeParentheses[i]+" ");*/
        int greather=(opIt>cpIt)?1:2;   // 1=openParentheses higher 2=closeParentheses higher
        int ParenthesesDiff=Math.abs(opIt-cpIt);
        //System.out.print("ParenthesesDiff:"+ParenthesesDiff+"greather : "+greather);
        
        
        for(int i=0;i<ParenthesesDiff;i++)
        {
            if(greather==1)
            {
                opIt--;
                toBeRemoved[toBeRemovedIt]=openParentheses[opIt];
                toBeRemovedIt++;
            }
            else if(greather==2)
            {
                cpIt--;
                toBeRemoved[toBeRemovedIt]=closeParentheses[cpIt];
                toBeRemovedIt++;
            }
        }
        
    /*    for(int i=0;i<toBeRemovedIt;i++)
            System.out.print(toBeRemoved[i]+" ");
    */
        int temp=-100;
        if(toBeRemovedIt>0)
        {
            toBeRemovedIt--;
            temp=toBeRemoved[toBeRemovedIt];
        }
        
        for(int i=0;i<expression.length();i++)
        {            
            if(i==temp)
            {
                if(toBeRemovedIt>0)
                {
                    toBeRemovedIt--;
                    temp=toBeRemoved[toBeRemovedIt];
                }
            }
            else
            {
                System.out.print(expression.charAt(i));
            }
            
        }
	}
}
