package functions;

public class Functions1 {

	public static void main(String[] args) {
		
		/*sum(10,20);
		sum(481,371);
		sum(1033,2043);
		sum(13455,20095);*/
		
		int add=sum1(10,20);
		System.out.println(add);
		
		int add2=sum1(10, 20, 30);
		System.out.println(add2);
		
	}
	
	//Type 1
	public static void sum(int a,int b)
	{
		int add=a+b;
		
		System.out.println(add);
	}
	
	//Type 2
	public static int sum1(int a, int b)
	{
		return a+b;
	}
	
	//Type 3 - Method overloading
	public static int sum1(int a,int b,int c)
	{
		return a+b+c;
		
		
		
	}

}
