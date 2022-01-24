package com.sonic.VendingMachine.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sonic.VendingMachine.entity.Inventory;
import com.sonic.VendingMachine.entity.Product;

@Service
public class HomeService {

	List<Inventory> inventoryList = new ArrayList<Inventory>();
	boolean setList = false;
	double moneyInMachine = 0.0;
	int cashPayments = 0;
	int cardPayments = 0;
	int numOfCansSold = 0;

	
	/**
	 * checks if the selected item is available in stock
	 * @param key id of the selected item
	 * @return true if selected item available
	 */
	public boolean checkInventory(String key) {

		int keyInt = Integer.parseInt(key);
		for (Inventory inventory : inventoryList) {
			if (keyInt == inventory.getProduct().getId()) {
				if (inventory.getAmountAvailable() > 0) {
					return true;
				}

			} // if
		} // for
		return false;
	}// checkInventory
	
	

	/**
	 * payment method counter
	 * @param paymentMethod the mode of payment chosen
	 */
	public void addPaymentNumber(String paymentMethod) {

		switch (paymentMethod) {
		case "1":
			this.cardPayments++;
			break;
		case "2":
			this.cashPayments++;
			break;
		default:
			break;
		}
	}// addPaymentNumber

	
	/**
	 * performs the payments if the stock is available
	 * @param key id of the item selected
	 * @param paymentMethod mode of payment
	 * @return true if stock available and payment successful 
	 */
	public boolean proceedToPayment(String key, String paymentMethod) {

		if (checkInventory(key)) {
			int keyInt = Integer.parseInt(key);
			reduceAmountAvailable(keyInt);
			this.moneyInMachine = this.moneyInMachine + 5.0;
			this.numOfCansSold ++; 
			addPaymentNumber(paymentMethod);
			return true;
		} // if stock available
			// System.out.println("returning false from prooceed to pay");

		return false;
	}// makePayment

	public void reduceAmountAvailable(int indexNo) {
		int availAmount = inventoryList.get(indexNo).getAmountAvailable();
		inventoryList.get(indexNo).setAmountAvailable(availAmount - 1);
	}// reduceAmountAvailable

	
	/**
	 * reset the machines value and restock the items
	 * @return the redirection to restock
	 */
	public String restock() {

		this.moneyInMachine = 0.0;
		this.cardPayments = 0;
		this.cashPayments = 0;
		this.numOfCansSold = 0;
		this.setList = false;
		this.inventoryList.clear();
		getListOfInventory();

		return "restock";

	}//restock
	
	
/**
 * sets the list of items and inventory
 * @return list of items and their values
 */
	public HashMap<String, String> getListOfItems() {

		HashMap<String, String> list = new HashMap<String, String>();
		list.put("0", "Pepsi - $5");
		list.put("1", "Coke - $5");
		list.put("2", "Miranda - $5");
		list.put("3", "Coke Zero - $5");
		list.put("4", "Cocacola - $5");
		list.put("5", "Coke Zero - $5");
		list.put("6", "Lemonde - $5");
		list.put("7", "Ginger Beer - $5");
		list.put("8", "Water - $5");
		list.put("9", "Red Bull - $5");

		getListOfInventory();

		return list;

	}

	

	/**
	 * sets the list of Inventory
	 */
	public void getListOfInventory() {
		if (setList == false) {
			inventoryList.add(0, new Inventory(new Product(0, "Pepsi", 5), 4));
			inventoryList.add(1, new Inventory(new Product(1, "Coke", 5), 4));
			inventoryList.add(2, new Inventory(new Product(2, "Miranda", 5), 4));
			inventoryList.add(3, new Inventory(new Product(3, "Coke Zero", 5), 4));
			inventoryList.add(4, new Inventory(new Product(4, "Cocacola", 5), 4));
			inventoryList.add(5, new Inventory(new Product(5, "Coke Zero", 5), 4));
			inventoryList.add(6, new Inventory(new Product(6, "Lemonde", 5), 4));
			inventoryList.add(7, new Inventory(new Product(7, "Ginger Beer", 5), 4));
			inventoryList.add(8, new Inventory(new Product(8, "Water", 5), 4));
			inventoryList.add(9, new Inventory(new Product(9, "Red Bull", 5), 4));

			setList = true;
		}

	}
	
	

	
	

	public double getMoneyInMachine() {
		return moneyInMachine;
	}

	public void setMoneyInMachine(double moneyInMachine) {
		this.moneyInMachine = moneyInMachine;
	}

	public int getCashPayments() {
		return cashPayments;
	}

	public void setCashPayments(int cashPayments) {
		this.cashPayments = cashPayments;
	}

	public int getCardPayments() {
		return cardPayments;
	}

	public void setCardPayments(int cardPayments) {
		this.cardPayments = cardPayments;
	}

	public int getNumOfCansSold() {
		return numOfCansSold;
	}

	public void setNumOfCansSold(int numOfCansSold) {
		this.numOfCansSold = numOfCansSold;
	}

}
