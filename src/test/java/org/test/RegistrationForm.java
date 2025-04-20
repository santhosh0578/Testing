package org.test;

import java.sql.Date;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class RegistrationForm extends BassClass {
@BeforeClass 
	
	public static void beforeClass() {
		browserLaunch("chrome");
		urlLaunch("https://adactinhotelapp.com/");
		impWait(10);
	}
	
	@AfterClass
	public static void afterClass() {
		//quit();
	}
	
	@Before 
	public void before() {
		Date a = new Date (0);
		System.out.println("Date" + a);
	}
	
	@After 
	public void After() {
		Date a = new Date (0);
		System.out.println("Date" + a);
	}
	
	
	@Test
	public void testA1() throws InterruptedException {
		
		Register l = new Register();
		
		click(l.getNewUser());
		
		sendKeys(l.getUsername(), "Santhosh008");
		
		sendKeys(l.getFullname(), "Santhosh R");
		
		sendKeys(l.getPass(), "Santa@123");
		
		sendKeys(l.getCnfpass(), "Santa@123");
		
		sendKeys(l.getEmailAdd(), "samsanthosh438@gmail.com");
		
		Thread.sleep(10000);
		
		click(l.getClickTOS());
		
		click(l.getBtnRegister());
		
	}
	
	@Ignore
	@Test
	public void testA2() {
		
		TicketBook t = new TicketBook ();
		
		sendKeys(t.getUsername(), "aselvaaaaaaaaaa1");
		
		sendKeys(t.getPassword(), "Selva@007");
		
		click(t.getBtnlogin());
		
		selectByIndex(t.getLocation(), 2);
		
		selectByIndex(t.getHotel(), 2);
		
		selectByIndex(t.getRoomType(), 2);
		
		selectByIndex(t.getRoomNumber(), 2);
		
		sendKeys(t.getDatecheckin(), "24/03/2025");
		
		sendKeys(t.getDatecheckout(), "24/03/2025");
		
		selectByIndex(t.getAdultroom(), 2);
		
		selectByIndex(t.getChildroom(), 2);
		
		click(t.getSearchHotel());
		
		click(t.getSelectHotel());
		
		click(t.getConfirmHotel());
		
		sendKeys(t.getFirstName(), "Selva");
		
		sendKeys(t.getLastName(), "Kumar");
		
		sendKeys(t.getAddress(), "Chennai, Perungalathur");
		
		sendKeys(t.getCcNum(), "4637398270619576 ");
		
		selectByIndex(t.getCcType(), 2);
		
		selectByIndex(t.getCcexpmonth(), 3);
		
		selectByVisibleTex(t.getCcexpyear(), "2029");
		
		sendKeys(t.getCcCVV(), "123");
		
		click(t.getBook());
		
		getAttribute(t.getOrderNumber());
	
		
	}

}

