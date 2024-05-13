package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.InputFormPage;
import PageClasses.TablePage;

public class TableTest extends BaseClass{
	TablePage tablepage;
	@Test
	public void verify_tablelink() {
		tablepage=new TablePage(driver);
		tablepage.clickontablelink();
		
	}
	@Test
	public void verify_tableheader() {
		tablepage=new TablePage(driver);
		tablepage.clickontablelink();
		String exp="Table with Pagination Example";
		String act=tablepage.gettableheader();
		Assert.assertEquals(act, exp);
		
	}
	@Test
	public void verify_classattribute() {
		tablepage=new TablePage(driver);
		tablepage.clickontablelink();
		String act=tablepage.getclassattribute();
		String exp="card-header";
		Assert.assertEquals(act, exp);
		
	}
	@Test
	public void verify_hrefvalue() {
		tablepage=new TablePage(driver);
		tablepage.clickontablelink();
		String act=tablepage.gethrefattribute();
		String exp="https://selenium.qabible.in/table-pagination.php";
		Assert.assertEquals(act, exp);
		
	}
	@Test
	public void printnames() {
		tablepage=new TablePage(driver);
		tablepage.clickontablelink();
		tablepage.printallanames();
		
		
	}
	@Test
	public void verifynamelist() {
		tablepage=new TablePage(driver);
		tablepage.clickontablelink();
		List<String> explist= new ArrayList<String>();
			explist.add("Tiger Nixon");
			explist.add("Garrett Winters");
			explist.add("Ashton Cox");
			List<String> actlist= new ArrayList<String>();
			actlist=tablepage.namelist();
			boolean a=explist.contains(actlist);
			Assert.assertTrue(a);
		}
	@Test
	public void findname() {
		tablepage=new TablePage(driver);
		tablepage.clickontablelink();
		tablepage.find("Tiger Nixon");
		System.out.println(tablepage.find("Tiger Nixon"));
		List<String> actlist= new ArrayList<String>();
		actlist=tablepage.namelist();
		System.out.println(actlist);
	}
	@Test
	public void verify_officename() {
		tablepage=new TablePage(driver);
		tablepage.clickontablelink();
		System.out.println(tablepage.getofficeofperson("Cedric Kelly"));
	}
	@Test
	public void verify_age() {
		tablepage=new TablePage(driver);
		tablepage.clickontablelink();
		System.out.println(tablepage.getageofperson("Cedric Kelly"));
	}
	}

