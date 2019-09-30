package arrays;

public class Array1 {

	public static void main(String[] args) {
		
		String[] str= new String[10];
		
		str[0]="Animesh";
		str[1]="Tejashree";
		str[2]="Mahesh";
		str[3]="Pradeep";
		str[4]="Nikhil";
		str[5]="Bhushan";
		str[6]="Shubhangee";
		str[7]="Babasaheb";
		str[8]="Shubhada";
		str[9]="Amit";
		
		// for size of array
		
		//System.out.println(str.length);
		
		//for single value print
		//System.out.println(str[5]);
		
		/*for all values to print from array
		for(int i=0; i<=9; i++)
			
			System.out.println(str[i]);*/
		
		// print till n-1 values
		
		/*for(int i=0; i<str.length-1; i++)
			
			System.out.println(str[i]);*/
		
		//for each loop or Enhanced for loop
		
		for(String s:str)
		{
			System.out.println(s);
		}

	}

}
