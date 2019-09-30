package arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		String[][] str= new String[4][2];
		
		str[0][0]="Username";
		str[0][1]="Password";
		str[1][0]="Username1";
		str[1][1]="Password1";
		str[2][0]="Username2";
		str[2][1]="Password2";
		str[3][0]="Username3";
		str[3][1]="Password3";
		
		//for single value print
		
		//	System.out.println(str[2][1]);
		
		// for all value to print
		
		/*for(int r=0; r<4; r++)
		{
			for(int c=0; c<2; c++)
			{
				System.out.println(str[r][c]);
			}*/
		
			
		// for length
		
			for(int r=0; r<str.length; r++)
			{
				for(int c=0; c<str[r].length; c++)
				{
					System.out.println(str[r][c]);
				}
			
			
		}
	}

}
