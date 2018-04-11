package Pages;

import static org.junit.Assert.assertNotEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Main.TestBase;

public class LogInPO extends TestBase {

	// Properties

	private WebElement reEmail;
	private WebElement logInBtn;
	private WebElement logInTab;
	private WebElement rePassword;

	public LogInPO(String browser) {
		super(browser);

	}

	public LogInPO() {
	};

	// methods

	public void initialization()  {

		driver.get(url);

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
		boolean x;
		if (value != null) {
			getRePassword();
			setRePassword(rePassword, value);
			x = true;
		} else {
			x = false;
		}
		return x;
	}

	public void close() {
		driver.close();
	}

	public void back() {
		driver.navigate().back();
	}

	public boolean waitUntil() {
		boolean x;
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement pathHeader;
		pathHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]")));
		if (pathHeader.isDisplayed())
			x = true;
		else
			x = false;
		return x;

	}

	public WebElement getReEmail() {
		reEmail = driver.findElement(By.id("ReEmailTB"));
		return reEmail;
	}

	public void setReEmail(WebElement reEmail, String value) {
		this.reEmail = reEmail;
		reEmail.sendKeys(value);

	}

	public WebElement getLogInBtn() {
		driver.findElement(By.id("ReBGetS")).click();
		return logInBtn;
	}

	public WebElement getLogInTab() {
		driver.findElement(By.id("LoginB")).click();
		return logInTab;
	}

	public WebElement getRePassword() {
		rePassword = driver.findElement(By.id("RePassTB"));
		return rePassword;
	}

	public void setRePassword(WebElement rePassword, String value) {
		this.rePassword = rePassword;
		rePassword.sendKeys(value);
	}

}
