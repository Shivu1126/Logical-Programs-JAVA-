package aaa;
import java.util.*;
public class find_words_2D_char_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char arr[][]= { {'a','z','o','l'},
						{'n','x','h','o'},
						{'v','y','i','v'},
						{'o','r','s','e'}
					  };
				
	//	System.out.print(arr[3][3]);
		
		String str1="zoho";
		int len=str1.length();
		int a,b;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(str1.charAt(i)==arr[i][j])
				{
					a=i;
					b=j;
				}
			}
		}
		

	}

}
