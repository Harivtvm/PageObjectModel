 package TestCases;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.DatePickerPage;

public class DatePickerTest extends BaseClass{
	DatePickerPage datepickerpage;
	@Test
	public void verify_datePickerPageLink() {
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.click_DatePickerPage();
	}
	@Test
	public void verify_DatePickerInput() {
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.click_DatePickerPage();
		datepickerpage.click_DatePickerInput();
	}
	@Test
	public void verify_middle() throws InterruptedException {
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.click_DatePickerPage();
		datepickerpage.click_DatePickerInput();
		datepickerpage.click_middle();
	}
	@Test
	public void verify_PrevCalenderButton() {
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.click_DatePickerPage();
		datepickerpage.click_DatePickerInput();
		datepickerpage.click_PrevCalenderButton();
	}
	@Test
	public void verify_DateSelection() {
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.click_DatePickerPage();
		datepickerpage.click_DatePickerInput();
	}
	@Test
	public void verify_choosedate() throws InterruptedException {
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.click_DatePickerPage();
		datepickerpage.click_DatePickerInput();
		datepickerpage.chooseDate();
	}
	@Test
	public void verify_sendkey() {
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.click_DatePickerPage();
		datepickerpage.click_DatePickerInput();
		datepickerpage.usingsendkeys();
	}
		
}
