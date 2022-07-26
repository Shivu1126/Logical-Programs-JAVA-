package aaa;

public class check_sub_string_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="WELCOMETOZOHOCORPORATION";
		int len=str.length();
		char arr[][]=new char[5][5];
		int k=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(k<len)
				{
					arr[i][j]=str.charAt(k);
					k++;
				}
				
			}
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(arr[i][j]+" ");
				if(j==4)
				{
					System.out.println();
				}
			}
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j<3)
				{
					if('T'==arr[i][j] && 'O'==arr[i][j+1] && 'O'==arr[i][j+2])
					{
						System.out.println("Start Index : " + i+","+j + " Ending index : " + i+","+(j+2) );
					}
				}
				if(i<3)
				{
					if('T'==arr[i][j] && 'O'==arr[i+1][j] && 'O'==arr[i+2][j])
					{
						System.out.println("Start Index : " + i+","+j + " Ending index : " + (i+2)+","+j );
	
					}
				}				
			}
		}	
		
		
	}

}
