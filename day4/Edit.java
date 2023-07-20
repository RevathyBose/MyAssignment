package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

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
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Verizon3");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathy3");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bose3");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revbose3@yahoo.co.in");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9000428903");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		Thread.sleep(4000);	}

}
