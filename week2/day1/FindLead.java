package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	    Thread.sleep(4000);
        String title =driver.getTitle();
        System.out.println(title);
        if (title.contains("TestLeaf")) {
        	System.out.println(driver.getTitle()+"Title contains " +"Teatleaf");
        }
        	else {
        		System.out.println(driver.getTitle()+"Title not contains " +"Teatleaf");
        	}
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Find Accounts")).click();
        driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
      //input[contains(@name,'search-suggestions')]
        driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
        driver.findElement(By.linkText("Credit Limited Account")).click();
        driver.findElement(By.linkText("Edit")).click();
		String accountName=driver.findElement(By.id("accountName")).getAttribute("value");     
		System.out.println(accountName);
        String desc = driver.findElement(By.xpath("//textarea[@name='description']")).getText().toString();
        System.out.println(desc);
        String title1 =driver.getTitle();
        System.out.println(title1);
       
        //button[text()='Find Accounts']"
      //tagname[contains(text(),'textValue')]
	}

}
