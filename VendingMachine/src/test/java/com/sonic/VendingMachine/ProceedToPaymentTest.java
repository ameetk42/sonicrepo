package com.sonic.VendingMachine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sonic.VendingMachine.service.HomeService;

class ProceedToPaymentTest {


	@Test
	public void testproceedToPayment() {
		HomeService homeService = new HomeService();
		homeService.getListOfInventory();
		boolean rslt = homeService.proceedToPayment("2", "1");

		System.out.println("result got "+rslt); 
		Assertions.assertEquals(true, rslt);

		//Assertions.assertFalse(false);
	}


}
