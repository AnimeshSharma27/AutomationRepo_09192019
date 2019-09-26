package basicJavaProjectPractice;

public class LogicalStatmentORPractic2 {

	public static void main(String[] args) {
		
		float number1=12.03f;
		float number2=32.04f;
		float number3=65.03f;
		
		if(number1>number2 || number1>number3)
		{
			System.out.println("number1 is greatest");
		}
		else if(number2>number3 && number2>number3)
		{
			System.out.println("number2 is greatest");
		}
		else
		{
			System.out.println("number3 is greatest");
		}
		
	}

}
