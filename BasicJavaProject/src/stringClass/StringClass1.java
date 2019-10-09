package stringClass;

public class StringClass1 {

	public static void main(String[] args) {

		String str=" Animesh ";
		
		String str2=" AnimesH ";
		
		
		//1  print full length of string
		System.out.println(str.length());
		
		//2 print specific index of string
		System.out.println(str.charAt(5));
		
		//3 print string in upper case
		System.out.println(str.toUpperCase());
		
		//4 prinf string in lower case
		System.out.println(str.toLowerCase());
		
		//5 trim the wide space from start and end
		System.out.println(str.trim());
		
		//6 to compare strings with consideration of case
		System.out.println(str.equals(str2));
		
		//7 to compare strings ignoring case 
		System.out.println(str.equalsIgnoreCase(str2));
		
		//8
		System.out.println(str.trim().equalsIgnoreCase(str2.trim()));
		
		//9 replacing index value within string
		System.out.println(str.replace("A", "aa"));
		
		//10 to split the string
		String[] temp=str.split("n");
		for(String s:temp)
		{
			System.out.println(s);
		}
		
		//11 sub string through index
		System.out.println(str.substring(2));
		
		//12 sub string through index 
		
		System.out.println(str.substring(2, 6));
		
	}

}
