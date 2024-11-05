package automationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstAutomation {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testingbaba.com/old/");
		
		driver.findElement(By.xpath("//*[@class=\"close\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@data-target=\"#elements\"]")).click();
		driver.findElement(By.xpath("//*[@href=\"#tab_2\"]")).click();
		
		WebElement framele = driver.findElement(By.xpath("//*[@id=\"tab_2\"]/div/iframe"));
		driver.switchTo().frame(framele);
		driver.findElement(By.xpath("//*[@id=\"myCheck\"]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"mylaptop\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"mydesktop\"]")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@href=\"#tab_1\"]")).click();
		Thread.sleep(2000);
	   	driver.findElement(By.xpath("//*[@id=\"fullname1\"]")).sendKeys("sachin");
	   	driver.findElement(By.xpath("//*[@id=\"fullemail1\"]")).sendKeys("sachin@gmail.com");
	   	driver.findElement(By.xpath("//*[@id=\"fulladdresh1\"]")).sendKeys("sector 34 faridabad");
	   	driver.findElement(By.xpath("//*[@id=\"paddresh1\"]")).sendKeys("faridabad haryna");
	   	driver.findElement(By.xpath("//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")).click();
	   	
	}

}
