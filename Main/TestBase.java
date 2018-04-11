package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class TestBase {

	// Properties
	public static WebDriver driver;
	//public String url = "https://www.google.co.il/";
	public String url = "file:///D:/Elad/Authomation%20cours/Final%20Project/signUp/index.html";
	public String url1 = "file:///D:/";

	// Constructor

	public TestBase(String browser) {
		Choosebrowser(browser);
	 

	}
	public TestBase() {
	
	 

	}
	public void Choosebrowser(String browser) {
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "FireFox":
			driver = new FirefoxDriver();
			
			break;
		case "IE":
			driver= new InternetExplorerDriver();
			break;
		}

	}


	
	
	
	
	
	
	
	

}
