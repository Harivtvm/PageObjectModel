package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {
	WebDriver driver;
	By inputform=By.xpath("(//a[@class='nav-link'])[2]");
	By showmsgbutton=By.xpath("//button[@id='button-one']");
	By singleinputfield=By.xpath("//div[contains(text(),'Single Input')]");
	By msginputfield=By.xpath("//input[@id='single-input-field']");
	By yourmessagedisplay=By.xpath("//div[@id='message-one']");
	
	public InputFormPage (WebDriver driver) {
		this.driver=driver;
			
		}
	public void clickOnInputForm() {
		WebElement ele1=driver.findElement(inputform);
		ele1.click();
	}
	public String getshowmsgbuttonlabel() {
		WebElement ele1=driver.findElement(showmsgbutton);
		String a=ele1.getText();
		return a;
		
	}
	public boolean isEnabledShowmsgButton() {
		WebElement ele1=driver.findElement(showmsgbutton);
		boolean a=ele1.isEnabled();
		return a;
		
	}
	public String getSingleInputFieldText() {
		WebElement ele1=driver.findElement(singleinputfield);
		String a=ele1.getText();
		return a;
		
	}
	public String getYourMsgText(String b) {
		WebElement ele1=driver.findElement(msginputfield);
		ele1.sendKeys(b);
		WebElement ele2=driver.findElement(showmsgbutton);
		ele2.click();
		WebElement ele3=driver.findElement(yourmessagedisplay);
		String a=ele3.getText();
		return a;
		
	}
	public String getbcolorofbutton() {
		WebElement ele1=driver.findElement(showmsgbutton);
		String a=ele1.getCssValue("background-color");
		return a;
}
}