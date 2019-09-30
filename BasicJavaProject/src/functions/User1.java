package functions;

public class User1 {

	public static void main(String[] args) {
		
		Car Scross= new Car();
		
		Scross.wheels=6;
		Scross.colour="gray";
		Scross.type="MUV";
		Scross.acceleration();
		
		Car car2= new Car();
		
//		car2.wheels=4;
		car2.colour="black";
//		car2.type="Sedan";
		car2.acceleration();
		
		Car car3= new Car();
		
		System.out.println(Scross.colour);
		System.out.println(car2.colour);
		System.out.println(car3.colour);
		
		System.out.println(Scross.wheels);
		System.out.println(car2.wheels);
		System.out.println(car3.wheels);
		
		

	}

}
