package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Verizon1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathy1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bose1");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revbose1@yahoo.co.in");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9000428900");
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source1= new Select(source);
		source1.selectByVisibleText("Employee");
		WebElement mktcmp=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select advtise= new Select(mktcmp);
		advtise.selectByValue("9001");
		WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownship= new Select(ownership);
		ownship.selectByIndex(5);
		WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select cntry= new Select(country);
		cntry.selectByVisibleText("India");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(4000);
        driver.close();
	}

}
