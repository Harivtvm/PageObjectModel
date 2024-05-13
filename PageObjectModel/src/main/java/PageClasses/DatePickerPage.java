package PageClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickerPage {
	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Date Pickers')]")
	WebElement datepicker;
	@FindBy(xpath = "//input[@class='form-control datepicker']")
	WebElement datepickerinput;
	@FindBy(xpath = "(//th[@class='datepicker-switch'])[1]")
	WebElement calendermiddlebutton;
	@FindBy(xpath = "//th[@class='prev']")
	WebElement calenderprevbutton;
	@FindBy(xpath = "//th[@class='next']")
	WebElement calendernextbutton;
	

	public DatePickerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void click_DatePickerPage() {
		datepicker.click();
	}

	public void click_DatePickerInput() {
		datepickerinput.click();

	}

	public void click_PrevCalenderButton() {
		calenderprevbutton.click();
	}
	public void click_middle() throws InterruptedException {
		calendermiddlebutton.click();
		Thread.sleep(3000);
	}

	public void chooseDate() {
		String date = "20-05-2024";
		String split[] = date.split("-");
		String year = split[2];
		String day = split[0];
		String monthIndex = split[1];
		int monthNumber = Integer.parseInt(monthIndex);
		int yearNumber = Integer.parseInt(year);
		String month = "";
		switch (monthNumber) {
		case 01:
		month = "January";
		break;
		case 2:
		month = "February";
		break;
		case 3:
		month = "March";
		break;
		case 4:
		month = "April";
		break;
		case 5:
		month = "May";
		break;
		case 6:
		month = "June";
		break;
		case 7:
		month = "July";
		break;
		case 8:
		month = "August";
		break;
		case 9:
		month = "September";
		break;
		case 10:
		month = "October";
		break;
		case 11:
		month = "November";
		break;
		case 12:
		month = "December";
		}

		String month_year = month + " " + year;
		String currentmo=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
		String cmon=currentmo.split(" ")[0];
		String cyear=currentmo.split(" ")[1];
		int cyearno= Integer.parseInt(cyear);
		int cmonth = 0;
		switch (cmon) {
		case "January":
		cmonth = 1;
		break;
		case "February":
		cmonth = 2;
		break;
		case "March":
		cmonth = 3;
		break;
		case "April":
		cmonth = 4;
		break;
		case "May":
		cmonth = 5;
		break;
		case "June":
		cmonth = 6;
		break;
		case "July":
		cmonth = 7;
		break;
		case "August":
		cmonth = 8;
		break;
		case "September":
		cmonth = 9;
		break;
		case "October":
		cmonth = 10;
		break;
		case "November":
		cmonth = 11;
		break;
		case "December":
		cmonth = 12;
		}
System.out.println(cmonth);
		
		while (true) {
		//String currentmonth_year = middleelemenet.getText();
		String currentmonth_year=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
		System.out.println(currentmonth_year);
		if (month_year.equals(currentmonth_year)) {
		break;
		} else if (yearNumber == cyearno && monthNumber > cmonth) {
			calendernextbutton.click();
		} else if (yearNumber == cyearno && monthNumber < cmonth) {
			calenderprevbutton.click();
		} else if (yearNumber < cyearno) {
			calenderprevbutton.click();
		} else if (yearNumber > cyearno) {
			calendernextbutton.click();
		}


		}
		WebElement calenderdayelement = driver
				.findElement(By.xpath("//tbody//td[text()='" + day + "' and @class='day']"));
				calenderdayelement.click();

		}

	
public void usingsendkeys() {
	datepickerinput.sendKeys("05/03/2024");
}
}