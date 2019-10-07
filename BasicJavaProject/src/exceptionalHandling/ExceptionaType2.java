package exceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionaType2 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {

		System.out.println("Testing");
		
		Thread.sleep(2000);
		
		System.out.println("Testing2");
		
		FileInputStream file=new FileInputStream("");
	}

}
