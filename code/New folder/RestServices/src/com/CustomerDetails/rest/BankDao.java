package com.CustomerDetails.rest;

import java.util.HashMap;
import java.util.Map;

public enum BankDao {
	instance;

	private Map<String, Bank> banks = new HashMap<String, Bank>();

	private BankDao() {

		//pumping-in some default data
		Bank bank= new Bank("21323", "sandhya", "Savings");
		banks.put("1", bank);
		bank = new Bank("2655465", "Bablu", "Current");
		banks.put("2", bank);

	}

	public Map<String, Bank> getBanks() {
		return banks;
	}
}