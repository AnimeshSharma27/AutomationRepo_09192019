package functions;

public class AccessModifiers {
	
	public static void main(String[] args)
	{
		AccessModifiers obj= new AccessModifiers();
		
		obj.publicFunction();
		obj.PrivateFunction();
		obj.noAccessModFunction();
		obj.protectedFunction();
	}
	
	public void publicFunction()
	
	{
		System.out.println("Public Function");
	}
	
	private void PrivateFunction()
	{
		System.out.println("Private Function");
	}
	
	void noAccessModFunction()
	{
		System.out.println("No Access Mod.function");
	}
	
	protected void protectedFunction()
	{
		System.out.println("protected function");
	}

}
