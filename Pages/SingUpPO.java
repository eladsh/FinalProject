package Pages;

import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Main.TestBase;

public class SingUpPO extends TestBase {

	

	// constructor
	
	public SingUpPO(String browser) {
		super(browser);

	}

	// methods

	public void close() {
		driver.close();
	}

	public void back() {
		driver.navigate().back();
	}

	public void initialization() throws InterruptedException {

		driver.get(url);

	}

	public void pressSingOnTab() {
		driver.findElement(By.id("Sign-UpB")).click();

	}

	public void pressSingOnBtn() {
		driver.findElement(By.id("BGetS")).click();

	}

	public boolean fillFirstName(String value) {
		boolean x;
		if (value !=null) {
			driver.findElement(By.id("FNTB")).sendKeys(value);
		x = true;
		}else {
			assertNotEquals(url1, driver.getCurrentUrl());
			x = false;
		}
		return x;
	}
	
	public boolean fillLastName(String value) {
		boolean x;
		if (value !=null) {
			driver.findElement(By.id("LNTB")).sendKeys(value);
		x = true;
		}else {
			assertNotEquals(url1, driver.getCurrentUrl());
			x = false;
		}
		return x;
	}

	public boolean fillPassword(String value) {
		boolean x;
		if (value !=null) {
			driver.findElement(By.id("PassTB")).sendKeys(value);
		x = true;
		}else {
			assertNotEquals(url1, driver.getCurrentUrl());
			x = false;
		}
		return x;
	}
	
	
	public boolean fillEmail(String value) {
		driver.findElement(By.id("EmailTB")).sendKeys(value);
		boolean x;
		if (value != null) {
			if (value.contains("@")) {
				x = true;
			} else {
				x = false;
			}
		} else {
			x = false;
		}

		return x;

	}


	public boolean waitUntil() {

		boolean x;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement pathHeader;
		pathHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]")));
		if (pathHeader != null)
			x = true;
		else
			x = false;
		return x;

	}
	
	
	public void pressLogInTab() {
		driver.findElement(By.id("LoginB")).click();
	
	
	}
	
	public void pressLogInBtn() {
		driver.findElement(By.id("ReBGetS")).click();
	
	
	}
	
	public boolean fillReEmail(String value) {
		driver.findElement(By.id("ReEmailTB")).sendKeys(value);
		boolean x;
		if (value != null) {
			if (value.contains("@")) {
				x = true;
			} else {
				x = false;
			}
		} else {
			x = false;
		}

		return x;

	}
	



	public boolean fillRePassword(String value) {
	    boolean x;
	    if (value != null) {
			driver.findElement(By.id("RePassTB")).sendKeys(value);
			x = true;
	    }else {
	    	x = false;
	    }
	    return x;
		}


	



}
