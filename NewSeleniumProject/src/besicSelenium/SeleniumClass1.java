package besicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClass1 {
	
	@Test
	public void login() throws InterruptedException
	{
		System.out.println("Launch Chrome Browswe");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.get("http://newtours.demoaut.com/");
		dr.manage().window().maximize();
		WebElement Username = dr.findElement(By.name("userName"));
		Username.sendKeys("mercury");
		//Thread.sleep(2000);
		Username.clear();
		//Thread.sleep(2000);
		Username.sendKeys("mercury");

		//Textbox
		dr.findElement(By.name("password")).sendKeys("mercury");

		//button
		dr.findElement(By.name("login")).click();
		//radio button
		System.out.println(dr.findElement(By.xpath("//input[@value='oneway']")).isSelected());
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		System.out.println(dr.findElement(By.xpath("//input[@value='oneway']")).isSelected());
		
		WebElement pass = dr.findElement(By.xpath("//select[@name='passCount']"));  
		
		Select sel=new Select(pass);
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("2"); 
		Thread.sleep(2000);
		sel.selectByVisibleText("4");
		
//		dr.findElement(By.xpath("//select[@name='fromPort']"));  
//		dropdown.selectByValue("Frankfurt");
//		
//		dr.findElement(By.xpath("//select[@name='fromMonth']"));
//		dropdown.selectByValue("12");
//		
//		
//		dr.findElementByName("findFlights").click();
//		
//		dr.findElementByName("reserveFlights").click();
//		
//		dr.findElementByName("buyFlights").click();
//		
		}
		}
