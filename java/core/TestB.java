package core;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestB {

	public static void main(String[] args) {
		
		WebDriver adcdriver  = new FirefoxDriver();
		
		adcdriver.get("https://www.google.com");
		
		List <WebElement> elem = new ArrayList<> (adcdriver.findElements(By.tagName("img")));
		for (WebElement image : elem){
			
			String alt = image.getAttribute("alt");
			
			System.out.println("alt:  " + alt);
		}
		
		adcdriver.quit();
		
	}

}
