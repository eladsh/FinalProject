package Junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import Pages.LogInPO;

public class LogInTest {

	 LogInPO _LogInPO = new LogInPO("Chrome");
	
//Properties
	boolean isEmptyNegative;
	
	@Before
	
	public void init() throws InterruptedException {
		_LogInPO.initialization();
		_LogInPO.pressLogInTab();
	}

	
	 @Test
	 public void sanity() throws InterruptedException {

	 _LogInPO.fillReEmail("eee@rrr");
	 _LogInPO.fillRePassword("123456");
	 _LogInPO.pressLogInBtn();
	 _LogInPO.waitUntil();
	 _LogInPO.back();
	 _LogInPO.close();
	
	
	 }
	
	 @Test
	 public void sanityE2E() throws InterruptedException {
	

	 _LogInPO.fillReEmail("eee@rrr");
	 _LogInPO.fillRePassword("123456");
	 _LogInPO.pressLogInBtn();
	 _LogInPO.waitUntil();
	 _LogInPO.back();
	 _LogInPO.pressSingOnTab();
	 _LogInPO.fillFirstName("bobo");
	 _LogInPO.fillLastName("clown");
	 _LogInPO.fillEmail("eee@rrr");
	 _LogInPO.fillPassword("123456");
	 _LogInPO.pressSingOnBtn();
	 _LogInPO.waitUntil();
	 _LogInPO.back();
	 _LogInPO.close();
	
	
	 }
	
	
	
	 @Test
	
	 public void isEmailCorrectPositive() throws InterruptedException {
	 boolean x = _LogInPO.fillReEmail("eee@rrr");
	 assertTrue(x);
	 _LogInPO.close();
	 }
	
	 @Test
	
	 public void isEmailCorrectNegative() throws InterruptedException {
		 
	 boolean x =_LogInPO.fillReEmail("er");
	 assertFalse(x);
	 _LogInPO.close();
	 }

	@Test

	public void isPasswordEmptyNegative() throws InterruptedException {

		_LogInPO.fillReEmail("eee@rrr");
		_LogInPO.fillRePassword("");
		_LogInPO.pressLogInBtn();
		Thread.sleep(3000);
		_LogInPO.close();
	}
	
	@Test

	public void isEmailEmptyNegative() throws InterruptedException {

		isEmptyNegative = _LogInPO.fillReEmail("");
		_LogInPO.fillRePassword("123456");
		_LogInPO.pressLogInBtn();
		assertFalse(isEmptyNegative);
		Thread.sleep(3000);
		_LogInPO.close();
	}


}
