package Junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import Pages.LogInPO;
import Pages.SingUpPO;

public class LogInTest {

	 LogInPO _LogInPO = new LogInPO("Chrome");
	 SingUpPO _SingUpPO = new SingUpPO();
	
//Propertiesss
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
//	
//	 @Test
//	 public void sanityE2E() throws InterruptedException {
//	
//
//	 _LogInPO.fillReEmail("eee@rrr");
//	 _LogInPO.fillRePassword("123456");
//	 _LogInPO.pressLogInBtn();
//	 _LogInPO.waitUntil();
//	 _LogInPO.back();
//	 _SingUpPO.pressSingOnTab();
//	 _SingUpPO.fillFirstName("bobo");
//	 _SingUpPO.fillLastName("clown");
//	 _SingUpPO.fillEmail("eee@rrr");
//	 _SingUpPO.fillPassword("123456");
//	 _SingUpPO.pressSingOnBtn();
//	 _SingUpPO.waitUntil();
//	 _SingUpPO.back();
//	 _SingUpPO.close();
//	
//	
//	 }
//	
//	
//	
//	 @Test
//	
//	 public void isEmailCorrectPositive() throws InterruptedException {
//	 boolean x = _LogInPO.fillReEmail("eee@rrr");
//	 assertTrue(x);
//	 _LogInPO.close();
//	 }
//	
//	 @Test
//	
//	 public void isEmailCorrectNegative() throws InterruptedException {
//		 
//	 boolean x =_LogInPO.fillReEmail("er");
//	 assertFalse(x);
//	 _LogInPO.close();
//	 }
//
//	@Test
//
//	public void isPasswordEmptyNegative() throws InterruptedException {
//
//		_LogInPO.fillReEmail("eee@rrr");
//		_LogInPO.fillRePassword("");
//		_LogInPO.pressLogInBtn();
//		Thread.sleep(3000);
//		_LogInPO.close();
//	}
//	
//	@Test
//
//	public void isEmailEmptyNegative() throws InterruptedException {
//
//		isEmptyNegative = _LogInPO.fillReEmail("");
//		_LogInPO.fillRePassword("123456");
//		_LogInPO.pressLogInBtn();
//		assertFalse(isEmptyNegative);
//		Thread.sleep(3000);
//		_LogInPO.close();
//	}


}
