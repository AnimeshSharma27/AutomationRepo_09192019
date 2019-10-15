package besicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass4 {
	
	@Test
	public void test()
	{
System.out.println("Launch Chrome Browswe");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.get("http://newtours.demoaut.com/");
		dr.manage().window().maximize();
		
		System.out.println(dr.findElementByXPath("//img[@alt='Mercury Tours']").getAttribute("height"));
	}

}
