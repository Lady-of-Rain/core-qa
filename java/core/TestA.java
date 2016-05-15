package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		WebElement elem = driver.findElement(By.xpath(".//*[@id='lst-ib']"));
		elem.click();
		elem.sendKeys("Nataliia Pasika");
		driver.findElement(By.cssSelector(".lsb")).click();
		System.out.println("Hello");
		

		
		
		
		
		

	}

}
