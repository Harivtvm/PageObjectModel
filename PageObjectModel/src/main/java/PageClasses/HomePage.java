package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	By logo=By.xpath("//a[@href='index.php']//img");
	public HomePage (WebDriver driver) {
	this.driver=driver;
		
	}
	public boolean islogodisplayed() {
		WebElement element=driver.findElement(logo);
		return element.isDisplayed();
	}
	public void printtitle() {
		System.out.println(driver.getTitle());
	
	}
	public static void main(String[] args) {
	
	}
}
