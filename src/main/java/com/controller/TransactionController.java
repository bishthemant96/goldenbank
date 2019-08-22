package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.TransactionModel;
import com.service.TransactionService;

@Controller
public class TransactionController {

	@Autowired
	TransactionService tService;

	@RequestMapping(value = "/addTransaction", method = RequestMethod.POST)
	public String createTransaction(@ModelAttribute("addTransaction") TransactionModel transactionModel,Model model) {

		transactionModel = tService.createTransaction(transactionModel);
		model.addAttribute("message", "Transaction Created!");
		return "transaction";
	}

	@RequestMapping(value = "/readTransaction", method = RequestMethod.POST)
	public String readTransaction(@ModelAttribute("readTransaction") TransactionModel transactionModel, Model model) {

		transactionModel = tService.viewTransaction(transactionModel);
	
		return "transaction";

	}
}