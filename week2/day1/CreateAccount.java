package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[contains(@id,'groupNameLocal')]")).sendKeys("revathy");
		driver.findElement(By.xpath("//input[contains(@id,'accountName')]")).sendKeys("revathy");
		driver.findElement(By.xpath("//input[contains(@id,'officeSiteName')]")).sendKeys("revathy");
		driver.findElement(By.xpath("(//input [@class='inputBox'])[5]")).sendKeys("9500428900");
		WebElement company = driver.findElement(By.name("industryEnumId"));
		Select company1 =new Select(company);
		company1.selectByIndex(3);
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select owship =new Select(ownership);
		owship.selectByVisibleText("S-Corporation");
		WebElement source=driver.findElement(By.name("dataSourceId"));
		Select ssource =new Select(source);
		ssource.selectByValue("LEAD_EMPLOYEE");
		WebElement mcampaign=driver.findElement(By.name("marketingCampaignId"));
		Select macampaign =new Select(mcampaign);
		macampaign.selectByIndex(6);
		WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stprov =new Select(state);
		stprov.selectByValue("TX");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();

	}

}
