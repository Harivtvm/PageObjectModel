package PageClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityPackage.Utility;

public class TablePage {
	Utility utility = new Utility();
	WebDriver driver;
	@FindBy(xpath = "(//a[contains(text(),'Table')])[1]")
	WebElement tablelink;
	@FindBy(xpath = "(//div[@class='card-header'])[2]")
	WebElement tableheader;
	@FindBy(xpath = "//a[text()='Table with Pagination']")
	WebElement tablewithpagination;
	@FindBy(xpath = "//tbody//tr//td[1]")
	List<WebElement> listnameelement;
	@FindBy(xpath = "(//a[@class='page-link'])[8]")
	WebElement tablenext;

	public TablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickontablelink() {
		tablelink.click();
	}

	public String gettableheader() {
		String a = tableheader.getText();
		return a;
	}

	public String getclassattribute() {
		return utility.get_attribute(tableheader, "class");
	}

	public String gethrefattribute() {
		return utility.get_attribute(tablewithpagination, "href");
	}

	public void printallanames() {
		List<String> namesData = new ArrayList<String>();
		namesData = utility.gettextofelements(listnameelement);
		System.out.println(namesData);

	}

	public List<String> namelist() {
		List<String> namesData = new ArrayList<String>();
		namesData = utility.gettextofelements(listnameelement);
		return namesData;

	}
	public boolean find(String a) {
		List<String> namesData = new ArrayList<String>();
		namesData = utility.gettextofelements(listnameelement);
		boolean b=listnameelement.contains(a);
		return b;

	}
	public String getofficeofperson(String name) {
		int index=0;
		List<String> namesData = new ArrayList<String>();
		namesData = utility.gettextofelements(listnameelement);
		for(index=0;index<namesData.size();index++)
		{
			if(namesData.get(index).equals(name)) {
				index++;
				break;
			}
		}
		WebElement officeelement=driver.findElement(By.xpath("//table//tr["+index+"]//td[3]"));
		return officeelement.getText();
	}
	public String getageofperson(String name) {
		int index=0;
		List<String> namesData = new ArrayList<String>();
		namesData = utility.gettextofelements(listnameelement);
		for(index=0;index<namesData.size();index++)
		{
			if(namesData.get(index).equals(name)) {
				index++;
				break;
			}
		}
		WebElement officeelement=driver.findElement(By.xpath("//table//tr["+index+"]//td[4]"));
		return officeelement.getText();
	}
	
}
