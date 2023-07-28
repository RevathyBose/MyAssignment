package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement().click();
		driver.findElement(By.xpath("//form[@id=\"menuform\"]//span[@text=\"Element\"]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		driver.findElement(By.xpath("(//label[@for='j_idt87:basic:0'])")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']")).isSelected();
        driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click(); 
        boolean enabled=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isSelected();
        if(enabled) {
        	System.out.println("enabled");
        }else { 	
        	System.out.println("Disabled");
        }
        	driver.findElement(By.xpath("(//ul[@data-label='Cities']")).click();
        	driver.findElement(By.xpath("(//label[text()='Miami'])[2]'")).click();
        	driver.findElement(By.xpath("(//label[text()='London'])[2]'")).click();
	
		
		
	}

}
