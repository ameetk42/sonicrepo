package com.sonic.VendingMachine.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sonic.VendingMachine.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	HomeService homeService;

	@RequestMapping(value = "/home", method = { RequestMethod.GET, RequestMethod.POST })
	public String initView(@ModelAttribute(name = "listOfItems") HashMap<String, String> listOfItems, Model model) {

		listOfItems.putAll(homeService.getListOfItems());
		model.addAttribute("moneyInMachine", homeService.getMoneyInMachine());
		model.addAttribute("cardPayment", homeService.getCardPayments());
		model.addAttribute("cashPayment", homeService.getCashPayments());
		model.addAttribute("numOfCansSold", homeService.getNumOfCansSold());

		return "home";
	}

	@RequestMapping("/")
	public void handleRequest() {
		throw new RuntimeException("Server exception");
	}

	@PostMapping("/restock")
	public String restock() {
		return homeService.restock();
	}

	@RequestMapping("/result")
	public String result() {
		return "result";
	}// home

	@RequestMapping("/payment")
	public String payment(@RequestParam(name = "product") String product,
			@RequestParam(name = "paymentMethod") String paymentMethod, Model model) {
		model.addAttribute("paymentMethod", paymentMethod);
		if (homeService.proceedToPayment(product, paymentMethod)) {
			model.addAttribute("available", true);
			return "payment";
		}
		model.addAttribute("available", false);
		return "result";
	}// home

}
