package aaa;
import java.util.*;
public class sum_start_to_end_2d_arr {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int mat[][]= {{1,2,3,4,6},{5,3,8,1,2},{4,6,7,5,5},{2,4,8,9,4}};
		int row=mat.length;
		int col=mat[0].length;
		System.out.println("Enter statrting point : ");
		int st1=s.nextInt();
		int st2=s.nextInt();
		
		System.out.println("Enter ending point : ");
		int en1=s.nextInt();
		int en2=s.nextInt();
		int i,j;
		int sum=0;
		int f=0;
		for(i=st1;i<row;i++)
		{
			for(j=st2;j<col;j++)
			{
				sum=sum+mat[i][j];
				if(i==en1 && j==en2)
				{
					System.out.println(sum);
					f=1;
				//	return;
				}
				if(f==1)
				{
					break;
				}
			}
			if(f==1)
			{
				break;
			}	
		}
	}
}
