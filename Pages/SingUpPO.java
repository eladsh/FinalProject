package Pages;

import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Main.TestBase;

public class SingUpPO extends TestBase {

	// Properties

	private WebElement firstName;
	private WebElement SingOnTab;	
	private WebElement lastName;
	private WebElement password;
	private WebElement email;
	private WebElement logInTab;
	private WebElement logInBtn;
	private WebElement SingOnBtn;
	private WebElement reEmail;
	private WebElement rePassword;

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
		getSingOnTab();
		

	}

	public void pressSingOnBtn() {
		//driver.findElement(By.id("BGetS")).click();
		getSingOnBtn();
	}

	public boolean fillFirstName(String value) {
		boolean x;
		if (value != null) {
			
			getFirstName();
			setFirstName(firstName, value);
			x = true;
		} else {
			assertNotEquals(url1, driver.getCurrentUrl());
			x = false;
		}
		return x;
	}

	public boolean fillLastName(String value) {
		boolean x;
		if (value != null) {
			
			getLastName();
			setLastName(lastName, value);
			x = true;
		} else {
			assertNotEquals(url1, driver.getCurrentUrl());
			x = false;
		}
		return x;
	}

	public boolean fillPassword(String value) {
		boolean x;
		if (value != null) {
			
			getPassword();
			setPassword(password, value);
			x = true;
		} else {
			assertNotEquals(url1, driver.getCurrentUrl());
			x = false;
		}
		return x;
	}

	public boolean fillEmail(String value) {
		
		getEmail();
		setEmail(email, value);
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
		
		getLogInTab();

	}

	public void pressLogInBtn() {
		
		getLogInBtn();

	}

	public boolean fillReEmail(String value) {
		getReEmail();
		setReEmail(reEmail, value);
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
		getRePassword();
		setRePassword(rePassword, value);
		boolean x;
		if (value != null) {
			
			x = true;
		} else {
			x = false;
		}
		return x;
	}

	
	
	// Getters & Setters
	
	public WebElement getFirstName() {
		firstName = driver.findElement(By.id("FNTB"));
		return firstName;
	}

	public void setFirstName(WebElement firstName, String value) {

		this.firstName = firstName;
		firstName.sendKeys(value);
	}

	public WebElement getSingOnTab() {
		driver.findElement(By.id("Sign-UpB")).click();
		return SingOnTab;
	}

	public WebElement getLastName() {
		lastName = driver.findElement(By.id("LNTB"));
		return lastName;
	}

	public void setLastName(WebElement lastName, String value) {
		this.lastName = lastName;
		lastName.sendKeys(value);
	}

	public WebElement getPassword() {
		password = driver.findElement(By.id("PassTB"));
		return password;
	}

	public void setPassword(WebElement password, String value) {
		this.password = password;
		password.sendKeys(value);
	}

	public WebElement getEmail() {
		email = driver.findElement(By.id("EmailTB"));
		return email;
	}

	public void setEmail(WebElement email, String value) {
		this.email = email;
		email.sendKeys(value);
	}

	public WebElement getReEmail() {
		reEmail = driver.findElement(By.id("ReEmailTB"));
		return reEmail;
	}

	public void setReEmail(WebElement reEmail, String value) {
		this.reEmail = reEmail;
		reEmail.sendKeys(value);
		
	}

	public WebElement getRePassword() {
		rePassword = driver.findElement(By.id("RePassTB"));
		return rePassword;
	}

	public void setRePassword(WebElement rePassword, String value) {
		this.rePassword = rePassword;
		rePassword.sendKeys(value);
	}

	public WebElement getLogInTab() {
		driver.findElement(By.id("LoginB")).click();
		return logInTab;
	}

	public WebElement getLogInBtn() {
		driver.findElement(By.id("ReBGetS")).click();
		return logInBtn;
	}
	public WebElement getSingOnBtn() {
		driver.findElement(By.id("BGetS")).click();
		return SingOnBtn;
	}


}
