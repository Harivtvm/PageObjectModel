package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.HomePage;

public class HomeTest extends BaseClass{
HomePage homepage;
	
	@Test
	public void Verify_logo() {
		homepage=new HomePage(driver);
		
System.out.println(driver.getTitle());
Boolean a=homepage.islogodisplayed();
//homepage.printtitle();
Assert.assertTrue(a);
	}
}


