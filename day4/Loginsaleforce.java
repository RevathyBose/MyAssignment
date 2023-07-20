package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Loginsaleforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(32000);
	//	driver.wa
		String title =driver.getTitle();
	    System.out.println("MY Driver Title is:"+title);
	       
		driver.close();
        
	}

}
