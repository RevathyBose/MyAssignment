package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		EdgeDriver driver=new EdgeDriver();
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
		driver.close();

        }
	
	}


