package com.sonic.VendingMachine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sonic.VendingMachine.service.HomeService;

class TestaddPaymentNumber {



	@Test
	public void testaddPaymentNumber() {

		HomeService homeService = new HomeService();
		homeService.getListOfInventory();
		boolean rslt = homeService.addPaymentNumber("2");


		Assertions.assertEquals(true, rslt);

	}

}
