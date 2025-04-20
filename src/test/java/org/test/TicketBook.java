package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketBook extends BassClass {
	public TicketBook ( ) {

		PageFactory.initElements(driver, this);
}
	
	@FindBy (name="username")
	private WebElement username;
	
	@FindBy (name="password")
	private WebElement password;
	
	@FindBy (name="login")
	private WebElement btnlogin;
	
	@FindBy (name="location")
	private WebElement location;
	
	@FindBy (name="hotels")
	private WebElement hotel;
	
	@FindBy (name="room_type")
	private WebElement roomType;
	
	@FindBy (name="room_nos")
	private WebElement roomNumber;
	
	@FindBy (name="datepick_in")
	private WebElement datecheckin;
	
	@FindBy (name="datepick_out")
	private WebElement datecheckout;
	
	@FindBy (name="adult_room")
	private WebElement adultroom;
	
	@FindBy (name="child_room")
	private WebElement childroom;
	
	@FindBy (name="Submit")
	private WebElement searchHotel;
	
	@FindBy (name="radiobutton_0")
	private WebElement selectHotel;
	
	@FindBy (name="continue")
	private WebElement confirmHotel;
		
	@FindBy (name="first_name")
	private WebElement firstName;
	
	@FindBy (name="last_name")
	private WebElement lastName;
	
	@FindBy (name="address")
	private WebElement address;
	
	@FindBy (name="cc_num")
	private WebElement ccNum;
	
	@FindBy (name="cc_type")
	private WebElement ccType;
	
	@FindBy (name="cc_exp_month")
	private WebElement ccexpmonth;
	
	@FindBy (name="cc_exp_year")
	private WebElement ccexpyear;
	
	@FindBy (name="cc_cvv")
	private WebElement ccCVV;
	
	@FindBy (name="book_now")
	private WebElement book;
	
	@FindBy (name="order_no")
	private WebElement orderNumber;
	
	

	public WebElement getOrderNumber() {
		return orderNumber;
	}

	public WebElement getConfirmHotel() {
		return confirmHotel;
	}

	public WebElement getSearchHotel() {
		return searchHotel;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNumber() {
		return roomNumber;
	}

	public WebElement getDatecheckin() {
		return datecheckin;
	}

	public WebElement getDatecheckout() {
		return datecheckout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCcCVV() {
		return ccCVV;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
}
