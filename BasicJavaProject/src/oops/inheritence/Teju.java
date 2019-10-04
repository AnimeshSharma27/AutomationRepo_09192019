package oops.inheritence;

public class Teju {

	public static void main(String[] args) {
		
		SmartPhone phone= new SmartPhone();
		
		phone.Calling();
		phone.texting();
		phone.Internet();
		
		Telephone phone2= new Telephone();
		
		phone2.Calling();
		
		Telephone phone3= new SmartPhone();
		
		phone3.Calling();
		
		
	}

}
