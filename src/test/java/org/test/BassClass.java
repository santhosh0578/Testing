package org.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BassClass {
public static WebDriver driver;
	
	public static WebDriver browserLaunch(String Browser) {
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver ();
		}
		
		else if (Browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver ();	
		}
		
		else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver ();	
		}
		return driver;
	}
	
	public static void launchBrowser(String Browser) {
		
		switch(Browser) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver ();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver ();	
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver ();	
			
		}
		
	}

//	public static void browserLaunch() {
//		
//		WebDriverManager.chromedriver().setup();
//		
//		driver = new ChromeDriver ();	
//		
//	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void impWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);
	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	public static String getText(WebElement e) {
		String t = e.getText();
		System.out.println(t);
		return t;
	}
	
	public static String getAttribute(WebElement e) {	
		String att = e.getAttribute("value");
		System.out.println(att);
		return att;
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static String currentUrl() {
		String cu = driver.getCurrentUrl();
		System.out.println(cu);
		return cu;
	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	// Actions
	
	public static void moveTo(WebElement t) {
		Actions a = new Actions (driver);
		a.moveToElement(t).build().perform();
			}
	
	public static void dragAndDrop(WebElement src, WebElement des) {
		Actions a = new Actions (driver);
		a.dragAndDrop(src, des).build().perform();
	}
	
	public static void actionClick(WebElement e) {
		Actions a = new Actions (driver);
		a.click(e).build().perform();
		
	}
	
	public static void doubleClick(WebElement t) {
		Actions a = new Actions (driver);
		a.doubleClick(t).build().perform();
	}
	
	public static void contextClick(WebElement t) {
		Actions a = new Actions (driver);
		a.contextClick(t).build().perform();

	}
	
	// Select
	
	public static void selectByIndex(WebElement t, int index) {
		Select s = new Select (t);
		s.selectByIndex(index);
	}
	
	public static void deSelectByIndex(WebElement t, int index) {
		Select s = new Select (t);
		s.deselectByIndex(index);

	}
	
	public static void selecyByValue(WebElement t, String value) {
		Select s = new Select(t);
		s.selectByValue(value);
	}
	
	public static void deSelectByValue(WebElement t, String value) {
		Select s = new Select (t);
		s.deselectByValue(value);
	}	
	

	public static void selectByVisibleTex(WebElement t, String value) {
		Select s = new Select (t);
		s.selectByVisibleText(value);
	}
	
	public static void deSelectByVisibleTex(WebElement t, String value) {
		Select s = new Select (t);
		s.deselectByVisibleText(value);
	}
	
// Alerts
	
	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public static void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public static String getAlertText() {
		return driver.switchTo().alert().getText();
	}
	
// Scroll - JS
	
	public static void scrollDown(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", e);
	}
	
	public static void scrollUp(WebElement e) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", e);
	}
	
// Frames
	
	public static void switchtoFrame(String s) {
		driver.switchTo().frame(s);
	}
	
	public static void switchtoFrame(WebElement e) {
		driver.switchTo().frame(e);
	}
	
	public static void switchtoFrame (int x) {
		driver.switchTo().frame(x);
	}
	
	public static void exitFrame() {
		driver.switchTo().defaultContent();
	}
	
// Windows handling
	
	public static void switchWindow(int index) {

		String[] win = driver.getWindowHandles().toArray(new String[0]);
		driver.switchTo().window(win[index]);
	}
	
	
// Navigation 
	
	public static void navigateURL(String url) {
		driver.navigate().to(url);
	}
	
	public static void navigateForward() {
		driver.navigate().forward();
	}
	
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	public static void refreshPage() {
		driver.navigate().refresh();		
	}
	
	
// JavaScript executor 
	
	public static void executeJs( String s, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(s, e);
	}
	
	
	public static void clickJs(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", e);
	}
	
// Take Screenshot
	
	public static void screenShot(String s) throws IOException {
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File screen = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File (s));
		 
	}

}
