package TestCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.InputFormPage;

public class InputFormTest extends BaseClass{
	InputFormPage inputformpage;
	
	@Test
	public void verify_Showmsgtext() {
		inputformpage=new InputFormPage(driver);
		inputformpage.clickOnInputForm();
		String expectedbuttonmsg="Show Message";
		String Actualbuttonmsg=inputformpage.getshowmsgbuttonlabel();
		Assert.assertEquals(Actualbuttonmsg, expectedbuttonmsg);
	}
	@Test
	public void verify_singleInputFieldText() {
		inputformpage=new InputFormPage(driver);
		inputformpage.clickOnInputForm();
		String Expectedtext="Single Input Field";
		String Actualtext=inputformpage.getSingleInputFieldText();
		Assert.assertEquals(Actualtext, Expectedtext);
	}
	@Test
	public void verify_showmsgbuttonenabled() {
		inputformpage=new InputFormPage(driver);
		inputformpage.clickOnInputForm();
		Boolean actual=inputformpage.isEnabledShowmsgButton();
		Assert.assertTrue(actual);
	
		
	}
	@Test
	public void verify_yourMsgEnteredText() {
		inputformpage=new InputFormPage(driver);
		inputformpage.clickOnInputForm();
		String data1="hello";
		String Expectedtext="Your Message : "+data1;
		String Actualtext=inputformpage.getYourMsgText(data1);
		Assert.assertEquals(Actualtext, Expectedtext);	
	}
	@Test
	public void verify_bcolorShowButton() {
		inputformpage=new InputFormPage(driver);
		inputformpage.clickOnInputForm();
		String Expectedtext="rgba(0, 123, 255, 1)";
		String Actualtext=inputformpage.getbcolorofbutton();
		Assert.assertEquals(Actualtext, Expectedtext);	
	}
}

