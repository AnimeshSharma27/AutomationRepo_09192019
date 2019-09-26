package basicJavaProjectPractice;

public class LogicalStatementANDPractice1 {

	public static void main(String[] args) {
		
		double amit=98.0;
		double rohit=70.6;
		double sumit=99.5;

		 if(amit>rohit && amit>sumit) {
			 System.out.println("AMit is topper of the class");
		 }
		
	      else if(rohit>amit && rohit>sumit)
	      {
	    	  System.out.println("rohit is topper of the class");
	      }
	      else
	      {
	    	  System.out.println("sumit is topper of the class");
	      }
	}

}
