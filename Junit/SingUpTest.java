package Junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import Pages.SingUpPO;

public class SingUpTest {

	SingUpPO _SingUpPO = new SingUpPO("Chrome");
	
	// Properties
	boolean isEmptyNegative;
	boolean isCurrect;

	
	// Test methods
	@Before
	public void init() throws InterruptedException {
		_SingUpPO.initialization();
		_SingUpPO.pressSingOnTab();
	}

//	@Test
//	public void sanity() throws InterruptedException {
//
//		
//		_SingUpPO.fillFirstName("bobo");
//		_SingUpPO.fillLastName("clown");
//		_SingUpPO.fillEmail("eee@rrr");
//		_SingUpPO.fillPassword("123456");
//		_SingUpPO.pressSingOnBtn();
//		_SingUpPO.waitUntil();
//		// _SingUpPO.back();
//		_SingUpPO.close();
//
//	}

	@Test
	public void E2Esanity() throws InterruptedException {

		
		_SingUpPO.fillFirstName("bobo");
		_SingUpPO.fillLastName("clown");
		_SingUpPO.fillEmail("eee@rrr");
		_SingUpPO.fillPassword("123456");
		_SingUpPO.pressSingOnBtn();
		_SingUpPO.waitUntil();
		_SingUpPO.back();
		_SingUpPO.pressLogInTab();
		_SingUpPO.fillReEmail("eee@rrr");
		_SingUpPO.fillRePassword("123456");
		_SingUpPO.pressLogInBtn();
		_SingUpPO.waitUntil();
		_SingUpPO.back();
		_SingUpPO.close();

	}

//	@Test
//
//	public void isEmailCorrectPositive() throws InterruptedException {
//		
//		isCurrect = _SingUpPO.fillEmail("eee@rrr");
//		assertTrue(isCurrect);
//		_SingUpPO.close();
//	}
//
//	@Test
//
//	public void isEmailCorrectNegative() throws InterruptedException {
//		
//		isEmptyNegative = _SingUpPO.fillEmail("er");
//		assertFalse(isEmptyNegative);
//		_SingUpPO.close();
//	}
//
//	@Test
//
//	public void isEmailEmpty() throws InterruptedException {
//	
//		boolean x = _SingUpPO.fillEmail("");
//		assertFalse(x);
//		_SingUpPO.close();
//	}
//	@Test
//
//	public void isPasswordEmptyNegative() throws InterruptedException {
//	
//		_SingUpPO.fillFirstName("bobo");
//		_SingUpPO.fillLastName("clown");
//		_SingUpPO.fillEmail("eee@rrr");
//		_SingUpPO.fillPassword("");
//		_SingUpPO.pressSingOnBtn();
//		Thread.sleep(3000);
//		_SingUpPO.close();
//	}
//	@Test
//
//	public void isFirstNameEmptyNegative() throws InterruptedException {
//	
//		_SingUpPO.fillFirstName("");
//		_SingUpPO.fillLastName("clown");
//		_SingUpPO.fillEmail("eee@rrr");
//		_SingUpPO.fillPassword("123456");
//		Thread.sleep(3000);
//		_SingUpPO.close();
//	}
//	
//	@Test
//
//	public void isLastNameEmptyNegative() throws InterruptedException {
//		
//		_SingUpPO.fillFirstName("bobo");
//		_SingUpPO.fillLastName("");
//		_SingUpPO.fillEmail("eee@rrr");
//		_SingUpPO.fillPassword("123456");
//		Thread.sleep(3000);
//		_SingUpPO.close();
//	}
//	


}
