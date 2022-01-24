package com.sonic.VendingMachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sonic.VendingMachine.service.HomeService;

class CheckInventoryTest {


	@Test
	public void testCheckInventory() {
		HomeService homeService = new HomeService();
		homeService.getListOfInventory();
		boolean rslt = homeService.checkInventory("2");

		/*
		 * if (rslt) { Assertions.assertTrue(true); } else {
		 * System.out.println("condition failed"); }
		 */
		System.out.println("result got "+rslt); 
		Assertions.assertEquals(true, rslt);

		//Assertions.assertFalse(false);
	}


}
